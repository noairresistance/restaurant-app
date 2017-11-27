/*
 * CSCE 4444
 * 
 * 
 */
package Table;

import Food.MasterFoodItemList;
import Food.Order;
import Food.ServerSentMasterList;
import Food.Food;
import java.net.SocketException;
import java.net.Socket;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Table
{
    private static int ID = 0; // the table's id
    private Socket TableSkt; // the table's socket
    private ObjectInputStream ObjIn; // stream used to read in objects
    private ObjectOutputStream ObjOut; // stream used to output objects
    private boolean Connected = false;
    
    private ServerSentMasterList SentMenu;
    private MasterFoodItemList Menu;
    private Order Order; // an array list containing foods, drinks, and merch ordered by the customer
    
    public Table()
    {
           Order = new Order(); // create a new order
           ID++; // assign a new ID
    }
    
    // this function is used to connect to the server
    public void Handshake()
    {
        try
        {
            String category = "Table@1"; // a string used by the server to determine what action to take
            TableSkt = new Socket("localHost", 5555); // create a new socket for the customer
            System.out.println("connected."); // test
            Connected = true; // the user is now connected to the server
            
            // create an object input and output stream after connecting to the server
            ObjOut = new ObjectOutputStream(TableSkt.getOutputStream());
            ObjOut.flush();
            ObjIn = new ObjectInputStream(TableSkt.getInputStream());
            
            // launch a thread dedicated to reading from the server
            Thread Listening = new Thread(new ListeningThread()); 
            Listening.start();
            
            // send a message to the server so that it launches a specific thread
            System.out.println("Sending message."); // test
            ObjOut.writeUTF(category);
            ObjOut.flush();
            
            Thread.sleep(100); // allow server to catch up
        }
        catch(SocketException se)
        {
             System.exit(0);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println("Error connecting to server" + e);
        }
    }
    
    // this class is a thread that will read input sent from the server
    public class ListeningThread implements Runnable
    {
        @Override
        public void run()
        {
            String Message; // the message from the server
                       
            try
            {
                // get the menu from the server
                SentMenu = (ServerSentMasterList)ObjIn.readObject();
                Menu = new MasterFoodItemList(SentMenu.totalList);
                
                while((Message = ObjIn.readUTF()) != null) // while there is input to read from the server
                {
                    System.out.println(Message); // test
                    if(Message.equals("Modify")) // if the order was modified by the waiter
                    {
                        // read the modified order from the server
                        Order ModifiedOrder = (Order)ObjIn.readObject();
                        setOrder(ModifiedOrder);
                    }
                    else if(Message.equals("Shutdown")) // if the table needs to shutdown
                    {
                        break;
                    }
                }
                Connected = false; // test closes the infinite loop in main
            }
            catch(Exception e)
            {
                System.out.println("Error receiving information from server.");
            }
        }
    }
    
    // this function is used to add an item to table's order
    public void AddToOrder(Food newItem)
    {
        getOrder().AddToOrder(newItem); // call the add to order in the list class
    }
    
    // this function is used to assign the table's order to the parameter
    public void addAnOrder(Order newOrder)
    {
        Order = newOrder;
    }
    // this function is used to send a table's order to the server
    public void SendOrder()
    {
        try
        {
            ObjOut.writeUTF("Send"); // send a message to the server
            ObjOut.flush();
            
            Thread.sleep(100); // allow the server to catch up
            
            if(getOrder() == null)
            {
                
            }    
            
            ObjOut.writeObject(Order); // send the object to the server
            ObjOut.flush();
                      
            Thread.sleep(100);
        }
        catch(Exception e)
        {
            System.out.println("Error sending order." + e);
        }
    }
    
    // this function is used to send a help request to the waiter
    public void RequestHelp()
    {
        try
        {
            // send a message to the server
            ObjOut.writeUTF("Help");
            ObjOut.flush();
            
            ObjOut.writeUTF("Table " + ID + " requested help."); // Send the request to the server
            ObjOut.flush();
        }
        catch(Exception e)
        {
            System.out.println("Error Requesting Help."+ e);
        }
    }
    
    // this function sends a message to the waiter that the table paid by cash
    public void OrderPaidByCash()
    {
        try
        {
            // send a prep message to the server
            ObjOut.writeUTF("Cash");
            ObjOut.flush();
            
            // Send the paid notification request to the server
            ObjOut.writeUTF("Table ["+ ID + "] has paid $" + Order.getTotalPrice() + " with cash.");
            ObjOut.flush();
        }
        catch(Exception e)
        {
            System.out.println("Error Requesting Help."+ e);
        }
    }
    
    // this function sends a message to the waiter that the table paid by card
    public void OrderPaidByCard()
    {
        try
        {
            // prep the server with a message
            ObjOut.writeUTF("Card");
            ObjOut.flush();
            
            // Send the paid notification request to the server
            ObjOut.writeUTF("Table [" + ID + "] has paid $" + Order.getTotalPrice() + " with a card.");
            ObjOut.flush();
        }
        catch(Exception e)
        {

        }
    }

    
    // this function sends requests a to go box from the waiter
    public void ToGoBox()
    {
        try
        {
            // prep the server with a message
            ObjOut.writeUTF("togo");
            ObjOut.flush();
                       
            // send the request
            ObjOut.writeUTF("Table [" + ID + "] has requested a to go box.");
            ObjOut.flush();
        }
        catch(Exception e)
        {
            System.out.println("Error @ ToGoBox Request."+ e);
        }
    }
    
    // this function requests a refill from the waiter
    public void requestRefill(String request)
    {
        try 
        {
            // prep the server with a message
            ObjOut.writeUTF("Refill");
            ObjOut.flush();
            
            // send the request
            ObjOut.writeUTF("Table " + ID + " request refill of: "+ request);
            ObjOut.flush();
        } catch (Exception ex)
        {
            System.out.println("Error sending refill request." + ex);
        }
    }
    
    // this function is used to close the table's connections
    public void CloseConnections()
    {
        try
        {
            // close in streams and the socket
            ObjIn.close();
            ObjOut.close();
            TableSkt.close();
        }
        catch(IOException e)
        {
            System.out.println("Error closing Streams and sockets");
        }
        
    }
    
    // this function send a message saying that the table won a free dessert
    public void freeDessert()
    {
        try 
        {
            // prep the server
            ObjOut.writeUTF("Free");
            ObjOut.flush();
            
            // send the server
            ObjOut.writeUTF("Table " + ID + " won a free Dessert!");
            ObjOut.flush();
        } catch (Exception ex)
        {
            System.out.println("Error sending free dessert request." + ex);
        }
    }
    
    // test function
    public MasterFoodItemList getMasterFoodItemList()
    {
        if(Menu == null)
        {
            System.out.println("Table menu so null");
        }
        return Menu;
    }

    // this function returns the table's 
    public Order getOrder()
    {
        return Order;
    }

    // this function sets the table's order
    public void setOrder(Order Order)
    {
        this.Order = Order;
    }
}

