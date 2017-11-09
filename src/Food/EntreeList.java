/*
 * CSCE 4444
 * 
 * 
 */
package Food;

import java.util.ArrayList;


//THIS IS ONLY FOR SERVER TESTING
public class EntreeList
{
    
    public ArrayList<Food> entrees;
    Food entree1;
    Food entree2;
    Food entree3;
    
    
    public EntreeList()
    {
        entrees = new ArrayList<>();
        
        entree1 = new Food("Burger1", "Food",9.99, Boolean.TRUE, Boolean.FALSE);
        entree1.SetDescription("Heart-Stopping, All-American Cheese Burger with an extra large side of Freedom");
        entree1.SetIngredients("1/2 LB Patty");
        entree1.SetIngredients("Cheddar Cheese");
        entree1.SetIngredients("Lettuce");
        entree1.SetIngredients("Pickles");
        entree1.SetIngredients("Onion");
        entree1.SetIngredients("Mayo");
        
        entree2 = new Food("Burger2", "Food",10.99, Boolean.TRUE, Boolean.FALSE);
        entree2.SetDescription("Bla bla blablablablablablablablala abala ablabab abl");
        entree2.SetIngredients("Bla bla bla");
        entree2.SetIngredients("Ndikin");
        entree2.SetIngredients("Jeignbkd");
        entree2.SetIngredients("Goenfksl");
        entree2.SetIngredients("Nei");
        entree2.SetIngredients("Mkenbd");
        
        entree3 = new Food("Burger3", "Food",12.99, Boolean.TRUE, Boolean.FALSE);
        entree3.SetDescription("Nfkdh dksoih rxkcn dofb skfn voish dkdn foksn dlks ksn fkn kfn dokhl skdhlkj");
        entree3.SetIngredients("Udncosn");
        entree3.SetIngredients("Kdiojh ");
        entree3.SetIngredients("Ueijddl");
        entree3.SetIngredients("Pondks");
        entree3.SetIngredients("Mikuebnd");
        
        entrees.add(entree1);
        entrees.add(entree2);
        entrees.add(entree3);
    }
    
    
    
}
