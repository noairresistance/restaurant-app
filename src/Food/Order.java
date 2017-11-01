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
    private double subTotal;
    private boolean hasAddedToOrder;

    public Order()
    {
        hasAddedToOrder = false;
        totalPrice = 0;
        subTotal = 0;
        foodItem = new ArrayList<Food>();
        drink = new ArrayList<Food>();
    }
    
    
    public void createTableNumber(){}
    public void createOrdernumber(){}
    
    public void calculateSubTotal()
    {
        subTotal = 0;
        double temp = 0;
        for(Food food : foodItem)
        {
            temp += food.GetPrice();
        }
        for(Food food : drink)
        {
            temp += food.GetPrice();
        }
        
        subTotal += temp;
    }

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

    /**
     * @return the hasAddedToOrder
     */
    public boolean isHasAddedToOrder()
    {
        return hasAddedToOrder;
    }

    /**
     * @param hasAddedToOrder the hasAddedToOrder to set
     */
    public void setHasAddedToOrder(boolean hasAddedToOrder)
    {
        this.hasAddedToOrder = hasAddedToOrder;
    }

    /**
     * @return the subTotal
     */
    public double getSubTotal()
    {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal)
    {
        this.subTotal = subTotal;
    }
    
    
    
}
