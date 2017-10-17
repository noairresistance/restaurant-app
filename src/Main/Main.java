/*
 * CSCE 4444
 * 
 * 
 */
package Main;
import Handler.*;

/**
 *
 * @author Buckwheat
 */
public class Main {
    public static void main(String args[]) {
       
                // Hardcoded values to test classes and output.
        Food test = new Food("cheeseburger",3.99,true,false);
        test.SetDescription("It's cheesy af.");
        test.SetIngredients("Ingredient 1");
        test.SetIngredients("Ingredient 2");
        test.SetIngredients("Ingredient 3");
        
        Food test2 = new Food("nachos", 5.99, true, true);
        test2.SetDescription("it's not-yo cheese!");
        test2.SetIngredients("Ingredient 1");
        test2.SetIngredients("Ingredient 2");
        test2.SetIngredients("Ingredient 3");
        test2.SetIngredients("Ingredient 4");
        
        //output
        System.out.println("name: "+test.GetName());
        System.out.println("desc: "+test.GetDescription());
        System.out.println("price: $"+test.GetPrice());
        System.out.println("ingredients:\n"+test.GetIngredients(0));
        System.out.println(test.GetIngredients(1));
        System.out.println(test.GetIngredients(2));
        System.out.println("Available?: "+test.GetIsAvailable());
        System.out.println("Special?: "+test.GetIsSpecial());
        System.out.println("\n");
        System.out.println("name: "+test2.GetName());
        System.out.println("desc: "+test2.GetDescription());
        System.out.println("price: $"+test2.GetPrice());
        System.out.println("ingredients:\n"+test2.GetIngredients(0));
        System.out.println(test2.GetIngredients(1));
        System.out.println(test2.GetIngredients(2));
        System.out.println(test2.GetIngredients(3));
        System.out.println("Available?: "+test2.GetIsAvailable());
        System.out.println("Special?: "+test2.GetIsSpecial());
        
        
        //Create a separate thread 
        //Create a Handler
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Handler handler = new Handler();

            }
        });
    }
}
