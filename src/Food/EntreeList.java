/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Food;
import java.util.ArrayList;
/**
 *
 * @author Chema Salazar
 */
public class EntreeList {
       
    private ArrayList<Food> entrees;
    Food entree1;
    Food entree2;
    Food entree3;
    Food entree4;
    Food entree5;
    
    
    public EntreeList()
    {
        entrees = new ArrayList<>();
        
        entree1 = new Food("Burger1", 9.99, Boolean.TRUE, Boolean.FALSE);
        entree1.SetDescription("Heart-Stopping, All-American Cheese Burger with an extra large side of Freedom\n");
        entree1.SetIngredients("1/2 LB Patty");
        entree1.SetIngredients("Cheddar Cheese");
        entree1.SetIngredients("Lettuce");
        entree1.SetIngredients("Pickles");
        entree1.SetIngredients("Onion");
        entree1.SetIngredients("Mayo");
        
        entree2 = new Food("Burger2", 10.99, Boolean.TRUE, Boolean.FALSE);
        entree2.SetDescription("Bla bla blablablablablablablablala abala ablabab abl\n");
        entree2.SetIngredients("Bla bla bla");
        entree2.SetIngredients("Ndikin");
        entree2.SetIngredients("Jeignbkd");
        entree2.SetIngredients("Goenfksl");
        entree2.SetIngredients("Nei");
        entree2.SetIngredients("Mkenbd");
        
        entree3 = new Food("Burger3", 12.99, Boolean.TRUE, Boolean.FALSE);
        entree3.SetDescription("Nfkdh dksoih rxkcn dofb skfn voish dkdn foksn dlks ksn fkn kfn dokhl skdhlkj\n");
        entree3.SetIngredients("Udncosn");
        entree3.SetIngredients("Kdiojh ");
        entree3.SetIngredients("Ueijddl");
        entree3.SetIngredients("Pondks");
        entree3.SetIngredients("Mikuebnd");
        
        entree4 = new Food("Burger2", 10.99, Boolean.TRUE, Boolean.FALSE);
        entree4.SetDescription("Bla bla blablablablablablablablala abala ablabab abl\n");
        entree4.SetIngredients("Bla bla bla");
        entree4.SetIngredients("Ndikin");
        entree4.SetIngredients("Jeignbkd");
        entree4.SetIngredients("Goenfksl");
        entree4.SetIngredients("Nei");
        entree4.SetIngredients("Mkenbd");
        
        entree5 = new Food("Burger3", 12.99, Boolean.TRUE, Boolean.FALSE);
        entree5.SetDescription("Nfkdh dksoih rxkcn dofb skfn voish dkdn foksn dlks ksn fkn kfn dokhl skdhlkj\n");
        entree5.SetIngredients("Udncosn");
        entree5.SetIngredients("Kdiojh ");
        entree5.SetIngredients("Ueijddl");
        entree5.SetIngredients("Pondks");
        entree5.SetIngredients("Mikuebnd");
        
        entrees.add(entree1);
        entrees.add(entree2);
        entrees.add(entree3);
        entrees.add(entree4);
        entrees.add(entree5);
        
    }

    /**
     * @return the entrees
     */
    public ArrayList<Food> getEntrees() {
        return entrees;
    }

    /**
     * @param entrees the entrees to set
     */
    public void setEntrees(ArrayList<Food> entrees) {
        this.entrees = entrees;
    }
    
    
    
}
