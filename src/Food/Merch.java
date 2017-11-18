/*
 * CSCE 4444
 * 
 * 
 */
package Food;

import java.util.ArrayList;

public class Merch extends Food
{
    private Boolean IsSpecial;
    private String Size;
     
    public Merch (String Name, String Type, String ItemCatagory, Double Price,Boolean IsAvailable, Boolean Status, String newSize)
    {
        super (Name, Type, ItemCatagory,Price, IsAvailable,Status );
        IsSpecial = Status;
        Size = newSize;
    }
    
    public void SetSize(String newSize)
    {
        this.Size = newSize;
    }
    public String GetSize()
    {
        return this.Size;
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
