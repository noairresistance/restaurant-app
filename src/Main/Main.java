/*
 * CSCE 4444
 * 
 * 
 */
package Main;
import Food.Food;
import Food.Merchandise;
import Food.EntreeList;
import Food.AppetizerList;
import Food.DrinkList;
import Food.DessertList;
import Food.SentMasterList.*;
import Food.SentMasterList;
import Handler.*;
/**
 *
 * @author Buckwheat
 */
public class Main {
    public static void main(String args[]) {
        
        //building the menu's
        DrinkList Drinks = new DrinkList();
        Drinks.getDrinks();
        System.out.println("Array of Drinks: "+Drinks.getDrinks());
        
        AppetizerList AppList = new AppetizerList();   
        AppList.getAppitizers();
        System.out.println("Array of Appetizers: "+AppList.getAppitizers());
        
        EntreeList Entrees = new EntreeList();
        Entrees.getEntrees();
        System.out.println("Array of Entrees: "+Entrees.getEntrees());
        
        DessertList Desserts = new DessertList();
        Desserts.getDesserts();
        System.out.println("Array of Desserts: "+Desserts.getDesserts());
        
        //sending the menu's to a master menu array.
        ServerSentMasterList Menu = new ServerSentMasterList(Drinks.getDrinks(),AppList.getAppitizers(),Entrees.getEntrees(),Desserts.getDesserts());
        System.out.println("Printing out the entire menu: "+Menu.getTotalList());
        
        
        
        //Create a separate thread 
        //Create a Handler
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Handler handler = new Handler();

            }
        });
    }
}
