/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MockServer;

import Food.ServerSentMasterList;
import Food.*;
import java.io.IOException;
import java.net.Socket;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class Client {
    
    ServerSentMasterList masterList;
    MasterFoodItemList masterFoodItemList;
    
    public Client()
    {
        
    }
    
    public MasterFoodItemList getMasterFoodItemList()
    {
        return masterFoodItemList;
    }
    
    public void go() throws ClassNotFoundException
    {
        try
        {
            //Create Client Side Socket
            Socket cliSocket = new Socket("127.0.0.1", 5555);
            
            //Create Object Input Stream to receive serialized object from server
            ObjectInputStream in = new ObjectInputStream(cliSocket.getInputStream());
           
            //Read in object
            masterList = (ServerSentMasterList) in.readObject();
            
            //Create Master Food Items List
            //Get ArrayLists from server sent object
            masterFoodItemList = new MasterFoodItemList(masterList.totalList);
            
            
            
            
            //Print out all food item names
            for (int i = 0; i < masterFoodItemList.drinks.size(); i++)
            {
                System.out.println(masterFoodItemList.drinks.get(i).GetName());
            }
            System.out.println();
            
            for (int i = 0; i < masterFoodItemList.appitizers.size(); i++)
            {
                System.out.println(masterFoodItemList.appitizers.get(i).GetName());
            }
            System.out.println();
            
            for (int i = 0; i < masterFoodItemList.entries.size(); i++)
            {
                System.out.println(masterFoodItemList.entries.get(i).GetName());
            }
            System.out.println();
            
            for (int i = 0; i < masterFoodItemList.desserts.size(); i++)
            {
                System.out.println(masterFoodItemList.desserts.get(i).GetName());
            }
            System.out.println();
            
 
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
        
    
}
