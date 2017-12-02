/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Food;

import java.io.Serializable;

public class FullMenu implements Serializable
{
        private FoodList Entrees;
        private FoodList Appetizers;
        private FoodList Drinks;
        private FoodList Desserts;
        private FoodList Merchs;
        private FoodList Specials;
        
        public FullMenu()
        {
            // empty constructor
        }
        
        public FullMenu(FoodList entrees, FoodList apps, FoodList drinks, FoodList desserts, FoodList merch, FoodList specials)
        {
            Entrees = entrees;
            Appetizers = apps;
            Drinks = drinks;
            Desserts = desserts;
            Merchs = merch;
            Specials = specials;
        }
        
        public int entreesSize()
        {
            return Entrees.getListSize();
        }
        
        public int drinksSize()
        {
            return Drinks.getListSize();
        }
        
        public int dessertsSize()
        {
            return Desserts.getListSize();
        }
        
        public int appsSize()
        {
            return Appetizers.getListSize();
        }
        
        public int merchSize()
        {
            return Merchs.getListSize();
        }
        public int specialSize()
        {
            return Specials.getListSize();
        }
        public Food getDrink(int i)
        {
            return Drinks.getItem(i);
        }
        
        public Food getDessert(int i)
        {
            return Desserts.getItem(i);
        }
        
        public Food getApp(int i)
        {
            return Appetizers.getItem(i);
        }
        
        public Food getEntree(int i)
        {
            return Entrees.getItem(i);
        }
        
        public Food getMerch(int i)
        {
            return Merchs.getItem(i);
        }
        
        public Food getSpecials(int i)
        {
            return Specials.getItem(i);
        }
        
        public void printMenu()
        {
            for(int i = 0; i < appsSize(); i++)
            {
                System.out.println(Appetizers.getItem(i).GetName());
                System.out.println(Appetizers.getItem(i).GetPrice());
                for(int j = 0; j < Appetizers.getItem(i).getIngrediantArraySize(); j++)
                {
                    System.out.print(Appetizers.getItem(i).GetIngredients(j));
                }
            }
        
            for(int i = 0; i < drinksSize(); i++)
            {
                System.out.println(Drinks.getItem(i).GetName());
                System.out.println(Drinks.getItem(i).GetPrice());
  //              for(int j = 0; j < menu.getDrink(i).getIngrediantArraySize(); j++)
    //            {
      //              System.out.print(menu.getDrink(1).GetIngredients(j));
        //        }
            }
        
            for(int i = 0; i < dessertsSize(); i++)
            {
                System.out.println(Desserts.getItem(i).GetName());
                System.out.println(Desserts.getItem(i).GetPrice());
                for(int j = 0; j < Desserts.getItem(i).getIngrediantArraySize(); j++)
                {
                    System.out.print(Desserts.getItem(i).GetIngredients(j));
                }
            }
        
            for(int i = 0; i < entreesSize(); i++)
            {
                System.out.println(Entrees.getItem(i).GetName());
                System.out.println(Entrees.getItem(i).GetPrice());
                for(int j = 0; j < Entrees.getItem(i).getIngrediantArraySize(); j++)
                {
                    System.out.print(Entrees.getItem(i).GetIngredients(j));
                }
            }
            
            for(int i = 0; i < merchSize(); i++)
            {
                System.out.println(Merchs.getItem(i).GetName());
                System.out.println(Merchs.getItem(i).GetPrice());
                //System.out.println(Merchs.getItem(i).GetSize()); //This is an item size, not the list size.
                //since merch has no ingredients, we will omit Ingredients.
            }
            
            for(int i = 0; i < specialSize(); i++)
            {
                System.out.println(Specials.getItem(i).GetName());
                System.out.println(Specials.getItem(i).GetPrice());
            }
        }
}
