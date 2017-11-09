/*
 * CSCE 4444
 * 
 * 
 */
package allclasses;
import allclasses.Food;
import java.io.Serializable;
import java.util.ArrayList;


public class ServerSentMasterList implements Serializable
{
    public ArrayList<ArrayList<Food>> totalList;
    
    public ServerSentMasterList(ArrayList<Food> drinks, ArrayList<Food>appitizers, ArrayList<Food> entrees, ArrayList<Food>deserts)
    {
        totalList = new ArrayList<>();
        totalList.add(drinks);
        totalList.add(appitizers);
        totalList.add(entrees);
        totalList.add(deserts);
    }
    
    
    
}
