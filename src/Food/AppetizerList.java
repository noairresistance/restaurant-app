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

//THIS IS ONLY FOR SERVER TESTING 
public class AppetizerList
{
    
    private ArrayList<Food> appitizers;
    Food appitizer1;
    Food appitizer2;
    Food appitizer3;
    Food appitizer4;
    Food appitizer5;
    
    
    public AppetizerList()
    {        
        appitizers = new ArrayList<>();
        
        appitizer1 = new Food("Appitizer1", 5.99, Boolean.TRUE, Boolean.FALSE);
        appitizer1.SetDescription("Heart-Stopping, All-American Cheese Burger with an extra large side of Freedom\n");
        
        
        appitizer2 = new Food("Appitizer2", 6.99, Boolean.TRUE, Boolean.FALSE);
        appitizer2.SetDescription("Bla bla blablablablablablablablala abala ablabab abl\n");
        
        
        appitizer3 = new Food("Appitizer3", 7.99, Boolean.TRUE, Boolean.FALSE);
        appitizer3.SetDescription("Nfkdh dksoih rxkcn dofb skfn voish dkdn foksn dlks ksn fkn kfn dokhl skdhlkj\n");
        
        appitizer4 = new Food("Appitizer4", 4.99, Boolean.TRUE, Boolean.FALSE);
        appitizer4.SetDescription("Yay 4th appitizer!\n");
        
        appitizer5 = new Food("Appitizer5", 8.99, Boolean.TRUE, Boolean.FALSE);
        appitizer5.SetDescription("Yay 5th appetizer!\n");
        
        appitizers.add(appitizer1);
        appitizers.add(appitizer2);
        appitizers.add(appitizer3);
        appitizers.add(appitizer4);
        appitizers.add(appitizer5);
    }    
    /**
     * @return the appitizers
     */
    public ArrayList<Food> getAppitizers() {
        return appitizers;
    }

    /**
     * @param appitizers the appitizers to set
     */
    public void setAppitizers(ArrayList<Food> appitizers) {
        this.appitizers = appitizers;
    }
        
}
