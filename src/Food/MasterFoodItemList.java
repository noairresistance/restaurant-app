/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Food;

/**
 *
 * @author Chema Salazar
 */
import java.util.ArrayList;

public class MasterFoodItemList {
    public ArrayList<Food> drinks;
    public ArrayList<Food> appitizers;
    public ArrayList<Food> entries;
    public ArrayList<Food> desserts;
    
    
    public MasterFoodItemList(ArrayList<ArrayList<Food>> sentItemList)
    {
        drinks = sentItemList.get(0);
        appitizers = sentItemList.get(1);
        entries = sentItemList.get(2);
        desserts = sentItemList.get(3);
    }
}
