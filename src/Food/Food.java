/*
 * CSCE 4444
 * 
 * 
 */
package Food;

import java.util.ArrayList;

public class Food extends RestaurantItem
{
    private Boolean IsSpecial;
    private ArrayList<String> Ingredients;
    private String itemCatagory;
    private int tabNumber;
    private double price;
     
    public Food (String Name, String Type, String itemCatagory, Double Price,Boolean IsAvailable, Boolean Status)
    {
        super (Name, Type, Price, IsAvailable );
        IsSpecial = Status;
        Ingredients = new ArrayList<String>();
        this.itemCatagory = itemCatagory;
        tabNumber = 1;
        price = Price;
    }
    
    public void SetIngredients(String newIngredient)
    {
        Ingredients.add(newIngredient);
    }
    public String GetIngredients(int i)
    {
        return Ingredients.get(i);
    }
    
    public ArrayList<String> getIngredientList()
    {
        return Ingredients;
    }
    
    public int getIngrediantArraySize()
    {
        return Ingredients.size();
    }
    
    public void SetIsSpecial(Boolean Status)
    {
        this.IsSpecial = Status;
    }
    
    public Boolean GetIsSpecial()
    {
        return this.IsSpecial;
    }

    /**
     * @return the itemCatagory
     */
    public String getItemCatagory()
    {
        return itemCatagory;
    }

    /**
     * @param itemCatagory the itemCatagory to set
     */
    public void setItemCatagory(String itemCatagory)
    {
        this.itemCatagory = itemCatagory;
    }
    public int GetTabNumber()
    {
        return tabNumber;
    }
     public void SetTabNumber(int x)
    {
       tabNumber = x;
    }
    public double GetItemPrice()
     {
         return price;
     }
          
}
