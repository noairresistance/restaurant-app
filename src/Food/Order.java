/*
 * CSCE 4444
 * 
 * 
 */
package Food;

import java.io.Serializable;
import java.util.ArrayList;

public class Order implements Serializable
{
    private int tableNumber;
    private int orderNumber;
    private ArrayList<Food> foodItem;
    private ArrayList<Food> drink;
    private double totalPrice;


    public ArrayList<Food> getFoodItem()
    {
        return foodItem;
    }


    public void setFoodItem(Food foodItem)
    {
        this.foodItem.add(foodItem);
       
    }

    public double getTotalPrice()
    {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice)
    {
        this.totalPrice = totalPrice;
    }


    public int getTableNumber()
    {
        return tableNumber;
    }


    public void setTableNumber(int tableNumber)
    {
        this.tableNumber = tableNumber;
    }


    public int getOrderNumber()
    {
        return orderNumber;
    }


    public void setOrderNumber(int orderNumber)
    {
        this.orderNumber = orderNumber;
    }


    public ArrayList<Food> getDrink()
    {
        return drink;
    }


    public void setDrink(ArrayList<Food> drink)
    {
        this.drink = drink;
    }
    
    
    
}
