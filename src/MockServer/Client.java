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
    
    Food food;
    
    public Client()
    {
        
    }
    
    public void go()
    {
        try
        {
            System.out.println("CLIENT: Creating socket");
            Socket cliSocket = new Socket("127.0.0.1", 5555);
            System.out.println("CLIENT: Trying to connect to server");
 
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
        
    
}
