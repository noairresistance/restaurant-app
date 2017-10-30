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
public class DrinkList
{
    private ArrayList<Food> drinks;
    Food drink1;
    Food drink2;
    Food drink3;
    Food drink4;
    Food drink5;
    
    
    public DrinkList()
    {
        drinks = new ArrayList<>();
        
        drink1 = new Food("Coke", 1.99, Boolean.TRUE, Boolean.FALSE);
        drink2 = new Food("Sprite", 2.99, Boolean.TRUE, Boolean.FALSE);
        drink3 = new Food("Pepsi", 3.99, Boolean.TRUE, Boolean.FALSE);
        drink4 = new Food("Water", 0.00, Boolean.TRUE, Boolean.FALSE);
        drink5 = new Food("Hi-C", 1.99, Boolean.TRUE, Boolean.FALSE);
        
        drinks.add(drink1);
        drinks.add(drink2);
        drinks.add(drink3);
        drinks.add(drink4);
        drinks.add(drink5);
    }
    
    /**
     * @return the drinks
     */
    public ArrayList<Food> getDrinks() {
        return drinks;
    }

    /**
     * @param drinks the drinks to set
     */
    public void setDrinks(ArrayList<Food> drinks) {
        this.drinks = drinks;
    }
    

}
