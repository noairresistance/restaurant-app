package Food;


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
    
    
    //extending original class.
    public RestaurantItem(String Name, Double Price, Boolean IsAvailable)
    {
        /*  TODO:
        *   Needs the following variables:
        *   Image Picture
        */
        this.Name = Name;
        this.Description = null;
        this.Price = Price;
        //this.Picture = Picture;
        this.IsAvailable = IsAvailable;
    }
        
        /*  TODO:
        *   Needs the following methods:
        *   GetPicture()
        *   SetPicture()
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

//extending original class
public class Food extends RestaurantItem
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

/*
class EntreeList
{
    int x;
    private ArrayList<Food> Entree[];
    public EntreeList()
    {
        Entree[x] = new ArrayList<>();
    }
    public void addList(ArrayList<Food> List)
    {
        Entree[x].add(List);
    }
}


class MasterFoodList
{
    public ArrayList<Food> entrees;
    
    public MasterFoodList(ArrayList<ArrayList<Food>> SentList)
    {
        entrees = SentList.get(0);
    }
}
*/