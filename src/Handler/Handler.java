/*
 * CSCE 4444
 * 
 * 
 */
package Handler;
import Frame.*;
import Panels.*;
import Listeners.*;
import java.awt.Component;
import java.util.HashMap;
import javax.swing.JLabel;


import javax.swing.JPanel;


public class Handler{
    //Components
    Frame frame;
    Icons icons;
    HomeScreen homeScreen;
    Menu menu;
    Games games;
    EntreeItems entreeItems;

    //Event Listener
    HandlerMouseListener listener;
    
    //Current panel to pass around
    JPanel currentPanel;
    
    //Component map
    HashMap<JLabel, JPanel> map;
    
    
    public Handler(){
        
        /*
            To add a new page:
            
            1. Declare the object variable
            2. Instantiate the object
            3. Map the objects buttons to the page they are going to open
            4. Register the Listener as a MouseListener for the new object's button

        */
        
        
        //create frame object
        frame = new Frame();
        frame.setSize(1024, 768); 
        
        //create panel objects
        icons = new Icons();
        homeScreen = new HomeScreen();
        menu = new Menu();
        games = new Games();
        entreeItems = new EntreeItems();
        
        //create map for buttons -> panels
        map = new HashMap<>();
        map.put(homeScreen.getMenuButton(), menu);
        map.put(homeScreen.getGamesButton(), games);
        map.put(menu.getEntreeButton(), entreeItems);

        //set current panel to homeScreen
        currentPanel = homeScreen;
        
        //create listener classs
        listener = new HandlerMouseListener(frame, currentPanel, map);
        
        //register the listener to a button
        homeScreen.getMenuButton().addMouseListener(listener);
        homeScreen.getGamesButton().addMouseListener(listener);
        menu.getEntreeButton().addMouseListener(listener);
          
        
        
        //add panel to the frame and display it
        frame.add(homeScreen);
        
        //frame.setContentPane(homeScreen);
        frame.setVisible(true);
        
        
        
    }
    
    

    
    
    
}
