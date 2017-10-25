/*
 * CSCE 4444
 * 
 * 
 */
package MockServer;

import Food.Food;
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
           
          
            System.out.println("SERVER: Listening");
            Socket socket = listenerSocket.accept();
            System.out.println("SERVER: Client recieved");
            
            //Create Food Object
            foodItem = new Food("Burger", 9.99, Boolean.TRUE, Boolean.FALSE);
            foodItem.SetDescription("Heart-Stopping, All-American Cheese Burger with an extra large side of Freedom\n");
            foodItem.SetIngredients("1/2 LB Patty");
            foodItem.SetIngredients("Cheddar Cheese");
            foodItem.SetIngredients("Lettuce");
            foodItem.SetIngredients("Pickles");
            foodItem.SetIngredients("Onion");
            foodItem.SetIngredients("Mayo");
            
            //Serialize and write the object out to the socket
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(foodItem);
            
               
           
           
           
       } catch (IOException ex) {
           ex.printStackTrace();
       }
   }

    
}

