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
    private static int ID = 1;
    
    private int tableNumber;
    private int orderNumber;
    private ArrayList<Food> foodItem;
    private ArrayList<Food> drink;
    private double totalPrice;
    private double subTotal;
    private double tax;
    private boolean hasAddedToOrder;

    public Order()
    {
        tableNumber = ID;
        ID++;
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
    
    public void calculateTax()
    {
        tax = subTotal * 0.0825;      
    }

    public void calculateTotalPrice()
    {
        totalPrice = subTotal + tax;
    }
    
    public int GetOrderSize()
    {
        return this.foodItem.size();
    }
    
    public RestaurantItem GetItem(int i)
    {
        return foodItem.get(i);
    }
    

    public void AddToOrder(Food newItem)
    {
        foodItem.add(newItem);
    }
    
    public ArrayList<Food> getFoodItem()
    {
        return foodItem;
    }
    
    public ArrayList<Food> getDrinkItem()
    {
        return drink;
    }

    public void setDrinkItem(Food drink)
    {
        this.drink.add(drink);
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


    public int GetTableNum()
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

    /**
     * @return the tax
     */
    public double getTax()
    {
        return tax;
    }

    
    
    
}
