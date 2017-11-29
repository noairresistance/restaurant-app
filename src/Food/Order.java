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
    private int assignedWaiter;
    private int waiterID;
    private int orderNumber;
    private ArrayList<Food> foodItem;
    private ArrayList<Food> drink;
    private ArrayList<Food> special; //needs to be implemented.
    private ArrayList<Food> merch;  //newest list.
    private double totalPrice;
    private double subTotal;
    private double tax;
    private boolean hasAddedToOrder;
    private ArrayList<CompedItem> compedItems;

    public Order()
    {
        tableNumber = ID;
        ID++;
        hasAddedToOrder = false;
        totalPrice = 0;
        subTotal = 0;
        foodItem = new ArrayList<Food>();
        drink = new ArrayList<Food>();
        merch = new ArrayList<Food>();
        special = new ArrayList<Food>();
    }
    
    public class CompedItem
    {
        
        
        private String item;
        private int amount;
        private int waiterID;
        private String reason;
        private String dateTime;
        
        public CompedItem(String item, int amount, int waiterID, String reason, String dateTime)
        {
            this.item = item;
            this.amount = amount;
            this.waiterID = waiterID;
            this.reason = reason;
            this.dateTime = dateTime;
        }        
                
        /**
         * @return the item
         */
        public String getItem()
        {
            return item;
        }

        /**
         * @param item the item to set
         */
        public void setItem(String item)
        {
            this.item = item;
        }

        /**
         * @return the amount
         */
        public int getAmount()
        {
            return amount;
        }

        /**
         * @param amount the amount to set
         */
        public void setAmount(int amount)
        {
            this.amount = amount;
        }

        /**
         * @return the waiterID
         */
        public int getWaiterID()
        {
            return waiterID;
        }

        /**
         * @param waiterID the waiterID to set
         */
        public void setWaiterID(int waiterID)
        {
            this.waiterID = waiterID;
        }

        /**
         * @return the reason
         */
        public String getReason()
        {
            return reason;
        }

        /**
         * @param reason the reason to set
         */
        public void setReason(String reason)
        {
            this.reason = reason;
        }

        /**
         * @return the dateTime
         */
        public String getDateTime()
        {
            return dateTime;
        }

        /**
         * @param dateTime the dateTime to set
         */
        public void setDateTime(String dateTime)
        {
            this.dateTime = dateTime;
        }
  
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
        for(Food food : merch) //added merch getPrice call
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
  /* //not needed.
    public ArrayList<Merch> getMerch()
    {
        return merch;
    }
    
    public void addToMerch(Merch newItem)
    {
        merch.add(newItem);
    }
    
    public void setMerchItem (Merch newItem)
    {
        this.merch.add(newItem);
    }
    */

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

    public void setWaiter(int i)
    {
        this.assignedWaiter = i;
    }
    
    public int getWaiter()
    {
        return this.assignedWaiter;
    }
    
    public void setWaiterId(int i)
    {
        this.waiterID = i;
    }
    
    public int getWaiterId()
    {
        return this.waiterID;
    }
}
