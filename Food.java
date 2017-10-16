/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.util.ArrayList;

class RestaurantItem implements Serializable
{
    private String Name;
    private String Description;
    
    public RestaurantItem(String Name)
    {
        this.Name = Name;
        this.Description = null;
    }
    public String GetName()
    {
        return this.Name;
    }
    public String GetDescription()
    {
        return this.Description;
    }
    public void SetDescription(String Desc)
    {
        this.Description = Desc;
    }
}

class Food extends RestaurantItem
{
    private Boolean IsSpecial;
    private ArrayList<String> Ingredients;
     
    public Food (String Name, Boolean Status)
    {
        super (Name);
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
}
/*
public class Main
{
    public static void main(String argv[])
    {
        Food test = new Food("food1", false);
        test.SetDescription("It's edible.");
        test.SetIngredients("Ingredient 1");
        test.SetIngredients("Ingredient 2");
        test.SetIngredients("Ingredient 3");
       
        System.out.println(test.GetName());
    }
}*/
