/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Food;

import java.io.Serializable;
import java.util.ArrayList;

public class SpecialsList implements Serializable
{
    private ArrayList<Food> List = null;
    public ArrayList<Food> specials;

    public SpecialsList()
    {
        List = new ArrayList();
    }
    
    public void addItem(Food newItem)
    {
        List.add(newItem);
    }
    
    public Food getItem(int i)
    {
        return List.get(i);
    }
    
    public int getListSize()
    {
        return List.size();
    }
}