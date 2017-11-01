/*
 * CSCE 4444
 * 
 * 
 */
package Food;

import java.util.ArrayList;

public class MasterFoodItemList
{
    public ArrayList<Food> drinks;
    public ArrayList<Food> appetizers;
    public ArrayList<Food> entries;
    public ArrayList<Food> desserts;
    
    
    public MasterFoodItemList(ArrayList<ArrayList<Food>> sentItemList)
    {
        drinks = sentItemList.get(0);
        appetizers = sentItemList.get(1);
        entries = sentItemList.get(2);
        desserts = sentItemList.get(3);
    }
}
