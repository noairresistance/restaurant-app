package Main;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.awt.Image; //added image import
import java.io.Serializable;
import java.util.ArrayList;

class RestaurantItem implements Serializable
{
    private String Name;
    private String Description;
    private Double Price;
    //private Image Picture; // imported java.awt.Image;
    private Boolean IsAvailable;
    
    /* //Original 
    public RestaurantItem(String Name)
    {
        this.Name = Name;
        this.Description = null;
    }
    */
    
    //Dummy -> extending original class.
    public RestaurantItem(String Name, Double Price, Boolean IsAvailable)
    {
        /*  TODO:
        *   Needs the following variables:
        *   String Name
        *   String Description
        *   Double Price
        *   Image Picture
        *   Boolean IsAvailable
        */
        this.Name = Name;
        this.Description = null;
        this.Price = Price;
        //this.Picture = Picture;
        this.IsAvailable = IsAvailable;
    }
        
        /*  TODO:
        *   Needs the following methods:
        *   GetName() 
        *   GetDescription()
        *   GetPrice()
        *   GetPicture()
        *   GetIsAvailable()
        *   ======================
        *   SetName()
        *   SetDescription()
        *   SetPrice()
        *   SetPicture()
        *   SetIsAvailable()
        */
    
    /*=====Getters=====
    *
    */
    public String GetName()
    {
        return this.Name;
    }
    
    public String GetDescription()
    {
        return this.Description;
    }
    
    public Double GetPrice()
    {
        return this.Price;
    }
   /* 
    public Image GetPicture()
    {
        return this.Picture;
    }
    */
    
    public Boolean GetIsAvailable()
    {
        return this.IsAvailable;
    }
    
    /*=====Setters=====
    *
    */
    public void SetName(String Name)
    {
        this.Name = Name;
    }
    
    public void SetDescription(String Desc)
    {
        this.Description = Desc;
    }
    
    public void SetPrice(Double Price)
    {
        this.Price = Price;
    }
    
    /*
    public void SetPicture(Image Picture)
    {
        this.Picture = Picture;
    }
    */
    
    public void SetIsAvailable(Boolean IsAvailable)
    {
        this.IsAvailable = IsAvailable;
    }
    
    
}

/*Original
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
*/

//Dummy -> extending original class
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

/*public class Main
{
    public static void main(String[] args) {
        // Hardcoded values to test classes and output.
        Food test = new Food("cheeseburger",3.99,true,false);
        test.SetDescription("It's cheesy af.");
        test.SetIngredients("Ingredient 1");
        test.SetIngredients("Ingredient 2");
        test.SetIngredients("Ingredient 3");
        
        Food test2 = new Food("nachos", 5.99, true, true);
        test2.SetDescription("it's not-yo cheese!");
        test2.SetIngredients("Ingredient 1");
        test2.SetIngredients("Ingredient 2");
        test2.SetIngredients("Ingredient 3");
        test2.SetIngredients("Ingredient 4");
        
        //output
        System.out.println("name: "+test.GetName());
        System.out.println("desc: "+test.GetDescription());
        System.out.println("price: $"+test.GetPrice());
        System.out.println("ingredients:\n"+test.GetIngredients(0));
        System.out.println(test.GetIngredients(1));
        System.out.println(test.GetIngredients(2));
        System.out.println("Available?: "+test.GetIsAvailable());
        System.out.println("Special?: "+test.GetIsSpecial());
        System.out.println("\n");
        System.out.println("name: "+test2.GetName());
        System.out.println("desc: "+test2.GetDescription());
        System.out.println("price: $"+test2.GetPrice());
        System.out.println("ingredients:\n"+test2.GetIngredients(0));
        System.out.println(test2.GetIngredients(1));
        System.out.println(test2.GetIngredients(2));
        System.out.println(test2.GetIngredients(3));
        System.out.println("Available?: "+test2.GetIsAvailable());
        System.out.println("Special?: "+test2.GetIsSpecial());
    }
}*/
