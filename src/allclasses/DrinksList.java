/*
 * CSCE 4444
 * 
 * 
 */
package allclasses;

import java.util.ArrayList;

//THIS IS ONLY FOR SERVER TESTING
public class DrinksList
{
    public ArrayList<Food> drinks;
    Food drink1;
    Food drink2;
    Food drink3;
    
    
    public DrinksList()
    {
        drinks = new ArrayList<>();
        
        drink1 = new Food("Coke", "Drink",1.99, Boolean.TRUE, Boolean.FALSE);
        drink2 = new Food("Sprite", "Drink",2.99, Boolean.TRUE, Boolean.FALSE);
        drink3 = new Food("Pepsi", "Drink",3.99, Boolean.TRUE, Boolean.FALSE);
        
        drinks.add(drink1);
        drinks.add(drink2);
        drinks.add(drink3);     
    }
}
