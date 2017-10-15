/*
 * CSCE 4444
 * 
 * 
 */
package Server;

import java.util.ArrayList;
import java.util.HashMap;

public class Server {
    
    String itemType;
    ArrayList<String> listOfItems;
    HashMap<String, Double> priceMap; 
    HashMap<String, String> descriptionMap;
    HashMap<String, String> toppingsMap;
    HashMap<String, String> imageMap;
    
    public Server()
    {
        itemType = "Burgers";
        
        //List of items on menu
        listOfItems = new ArrayList<String>();
            listOfItems.add("Royale w/ Cheese");
            listOfItems.add("Big Kahuna");
        
        //Price of items
        priceMap = new HashMap<>();
            priceMap.put("Royale w/ Cheese", 7.99);
            priceMap.put("Big Kahuna", 9.99);
            
        //Description of items     
        descriptionMap = new HashMap<>();
            descriptionMap.put("Royale w/ Cheese", "A classic 113 gram burger with all of the fixings. "
                                + "Cheddar cheese, juicy tomatoes, red onion, and fresh lettuce all stuffed "
                                + "between our big sweet buns.");
            descriptionMap.put("Big Kahuna", "A 1/2 lb all-beef patty topped with scrumptious Applewood smoked bacon, "
                                + "shoestring onions, and a slice of grilled pineapple. This is a tasty burger!");
            
        //Toppings that come with items
        toppingsMap = new HashMap<>();
            toppingsMap.put("Royale w/ Cheese", "Mayonaise, Cheddar Cheese, Tomatoes, Red Onion, Lettuce");
            toppingsMap.put("Big Kahuna", "Sweet Mustard, Shoestring Onions, Applewood Bacon, Grilled Pinapple, Sweet Bun");
            
        //File path to images
        imageMap = new HashMap<>();
            imageMap.put("Royale w/ Cheese", "/images/menuItems/burgers/royaleCheese.jpg");
            imageMap.put("Big Kahuna", "/images/menuItems/burgers/bigKahuna.jpg");
                  
       
    }
    
    
    
    
}
