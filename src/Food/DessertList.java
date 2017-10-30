/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Food;

/**
 *
 * @author Chema Salazar
 */
import java.util.ArrayList;

//THIS IS ONLY FOR SERVER TESTING
public class DessertList
{
    private ArrayList<Food> desserts;
    Food dessert1;
    Food dessert2;
    Food dessert3;
    Food dessert4;
    Food dessert5;
    
    
    public DessertList()
    {
        desserts = new ArrayList<>();
        
        dessert1 = new Food("Cake", 7.99, Boolean.TRUE, Boolean.FALSE);
        dessert2 = new Food("Ice Cream", 8.99, Boolean.TRUE, Boolean.FALSE);
        dessert3 = new Food("Cake and Ice Cream", 9.99, Boolean.TRUE, Boolean.FALSE);
        dessert4 = new Food("Sopapilla", 8.99, Boolean.TRUE, Boolean.FALSE);
        dessert5 = new Food("Molten Volcano", 9.99, Boolean.TRUE, Boolean.FALSE);
        
        desserts.add(dessert1);
        desserts.add(dessert2);
        desserts.add(dessert3);           
        desserts.add(dessert4);
        desserts.add(dessert5);     
    }

    /**
     * @return the desserts
     */
    public ArrayList<Food> getDesserts() {
        return desserts;
    }

    /**
     * @param desserts the desserts to set
     */
    public void setDesserts(ArrayList<Food> desserts) {
        this.desserts = desserts;
    }
    

}