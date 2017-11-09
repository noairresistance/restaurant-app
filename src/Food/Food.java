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
     
    public Food (String Name, String Type, Double Price,Boolean IsAvailable, Boolean Status)
    {
        super (Name, Type, Price, IsAvailable );
        IsSpecial = Status;
        Ingredients = new ArrayList<String>();
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
    
}
