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

import Food.Food;
import java.io.Serializable;
import java.util.ArrayList;

public class SentMasterList {



public static class ServerSentMasterList implements Serializable
{
    private ArrayList<ArrayList<Food>> totalList;
    public ArrayList<Food> drinks;
    public ArrayList<Food> appitizers;
    public ArrayList<Food> entries;
    public ArrayList<Food> desserts;
    
    public ServerSentMasterList(ArrayList<Food> drinks, ArrayList<Food>appitizers, ArrayList<Food> entrees, ArrayList<Food>desserts)
    {
        totalList = new ArrayList<>();
        totalList.add(drinks);
        totalList.add(appitizers);
        totalList.add(entrees);
        totalList.add(desserts);
    }

        /**
         * @return the totalList
         */
        public ArrayList<ArrayList<Food>> getTotalList() {
            return totalList;
        }

        /**
         * @param totalList the totalList to set
         */
        public void setTotalList(ArrayList<ArrayList<Food>> totalList) {
            this.totalList = totalList;
        }
    

    
}
}
