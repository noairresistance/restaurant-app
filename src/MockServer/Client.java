/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MockServer;

import Food.*;
import java.io.IOException;
import java.net.Socket;
import java.io.ObjectInputStream;


public class Client {
    
    Food foodItem;
    
    public Client()
    {
        
    }
    
    public void go() throws ClassNotFoundException
    {
        try
        {
            System.out.println("CLIENT: Creating socket");
            Socket cliSocket = new Socket("127.0.0.1", 5555);
            System.out.println("CLIENT: Trying to connect to server");
            
            ObjectInputStream in = new ObjectInputStream(cliSocket.getInputStream());
            foodItem = (Food)in.readObject();
            
            for (int i = 0; i < foodItem.getIngrediantArraySize(); i++)
            {
                System.out.println(foodItem.GetIngredients(i));
            }
 
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
        
    
}
