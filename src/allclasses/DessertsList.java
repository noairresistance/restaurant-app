/*
 * CSCE 4444
 * 
 * 
 */
package allclasses;

import java.util.ArrayList;

//THIS IS ONLY FOR SERVER TESTING
public class DessertsList
{
    public ArrayList<Food> desserts;
    Food dessert1;
    Food dessert2;
    Food dessert3;
    
    
    public DessertsList()
    {
        desserts = new ArrayList<>();
        
        dessert1 = new Food("Cake", "Food",7.99, Boolean.TRUE, Boolean.FALSE);
        dessert2 = new Food("Ice Cream", "Food",8.99, Boolean.TRUE, Boolean.FALSE);
        dessert3 = new Food("Cake and Ice Cream", "Food",9.99, Boolean.TRUE, Boolean.FALSE);
        
        desserts.add(dessert1);
        desserts.add(dessert2);
        desserts.add(dessert3);     
    }
    
}
