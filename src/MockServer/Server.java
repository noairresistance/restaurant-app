/*
 * CSCE 4444
 * 
 * 
 */
package MockServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;




public class Server
{
   public void go()
   {
       try 
       {
           ServerSocket listenerSocket = new ServerSocket(5555);
           
          
            System.out.println("SERVER: Listening");
            Socket socket = listenerSocket.accept();
            System.out.println("SERVER: Client recieved");
               
           
           
           
       } catch (IOException ex) {
           ex.printStackTrace();
       }
   }
}