/*
 * CSCE 4444
 * 
 * 
 */
package Food;

import java.io.Serializable;

public class RestaurantItem implements Serializable{
    

    private String Name;
    
    /*Note that TypeOfItem will be strings that are either: Food, Drink, or Merch*/
    private String TypeOfItem;
    private String Description;
    private Double Price;
    //private Image Picture; // imported java.awt.Image;
    private Boolean IsAvailable;
    
    
    //extending original class.
    public RestaurantItem(String Name, String Type, Double Price, Boolean IsAvailable)
    {
        /*  TODO:
        *   Needs the following variables:
        *   Image Picture
        */
        this.Name = Name;
        this.TypeOfItem = Type; 
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
    
    public String getTypeOfItem() 
    {
        return TypeOfItem;
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
    
    public void setTypeOfItem(String TypeOfItem) 
    {
        this.TypeOfItem = TypeOfItem;
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
