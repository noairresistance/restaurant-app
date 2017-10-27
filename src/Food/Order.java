/*
 * CSCE 4444
 * 
 * 
 */
package Food;

import java.util.ArrayList;

public class Order
{
    private int tableNumber;
    private int orderNumber;
    private ArrayList<Food> foodItem;
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
    
    
    
}
