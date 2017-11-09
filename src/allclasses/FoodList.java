/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allclasses;

import java.io.Serializable;
import java.util.ArrayList;

public class FoodList implements Serializable
{
    private ArrayList<Food> List = null;

    public FoodList()
    {
        List = new ArrayList();
    }
    
    public void addItem(Food newFood)
    {
        List.add(newFood);
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
