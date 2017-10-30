/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Food;

import Food.*;

/**
 *
 * @author Chema Salazar
 */
public class Merchandise extends RestaurantItem
{
    private String Sizes;
    private String Colors;
    
        public Merchandise (String Name, Double Price,Boolean IsAvailable, String Size, String Color)
    {
        super (Name, Price, IsAvailable);
        Sizes = Size;
        Colors = Color;

    }
    
    public void SetSize(String Size)
    {
        this.Sizes = Size;
    }
    public String GetSize()
    {
        return this.Sizes;
    }
    
    public void SetColor(String Color)
    {
        this.Colors = Color;
    }
    public String GetColor()
    {
        return this.Colors;
    }
        
}
