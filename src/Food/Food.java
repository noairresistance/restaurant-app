/*
 * CSCE 4444
 * 
 * 
 */
package Food;

import java.util.ArrayList;

class Food extends RestaurantItem
{
    private Boolean IsSpecial;
    private ArrayList<String> Ingredients;
     
    public Food (String Name, Double Price,Boolean IsAvailable, Boolean Status)
    {
        super (Name, Price, IsAvailable );
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
    
    public void SetIsSpecial(Boolean Status)
    {
        this.IsSpecial = Status;
    }
    
    public Boolean GetIsSpecial()
    {
        return this.IsSpecial;
    }
    
}
