/*
 * CSCE 4444
 * 
 * 
 */
package MockServer;

import Food.EntreeList;
import Food.DrinksList;
import Food.Food;
import Food.AppitizersList;
import Food.DessertsList;
import Food.ServerSentMasterList;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;




public class Server implements Runnable
{   
   Food foodItem;
    
   @Override
   public void run()
   {
       go(); 
   }
   
   public void go()
   {
       try 
       {
           ServerSocket listenerSocket = new ServerSocket(5555);
           
          
            //System.out.println("SERVER: Listening");
            Socket socket = listenerSocket.accept();
            //System.out.println("SERVER: Client recieved");
            
            //Create Drinks
            DrinksList drinkList = new DrinksList();
            //Create Appitizers
            AppitizersList appitizerList = new AppitizersList();
            //Create Entrees
            EntreeList entreeList = new EntreeList();
            //Create Desserts
            DessertsList dessertsList = new DessertsList();
            
            //Create MasterList
            ServerSentMasterList masterList = new ServerSentMasterList(drinkList.drinks, appitizerList.appitizers, entreeList.entrees, dessertsList.desserts);
            
            
            
            //Serialize and write the object out to the socket
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(masterList);
            
               
           
           
           
       } catch (IOException ex) {
           ex.printStackTrace();
       }
   }

    
}

