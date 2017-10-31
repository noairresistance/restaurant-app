/*
 * CSCE 4444
 * 
 * 
 */
package Food;

import java.util.ArrayList;

//THIS IS ONLY FOR SERVER TESTING 
public class AppitizersList
{
    
    public ArrayList<Food> appitizers;
    Food appitizer1;
    Food appitizer2;
    Food appitizer3;
    
    
    public AppitizersList()
    {        
        appitizers = new ArrayList<>();
        
        appitizer1 = new Food("Appitizer1", 5.99, Boolean.TRUE, Boolean.FALSE);
        appitizer1.SetDescription("Heart-Stopping, All-American Cheese Burger with an extra large side of Freedom\n");
        
        
        appitizer2 = new Food("Appitizer2", 6.99, Boolean.TRUE, Boolean.FALSE);
        appitizer2.SetDescription("Bla bla blablablablablablablablala abala ablabab abl\n");
        
        
        appitizer3 = new Food("Appitizer3", 7.99, Boolean.TRUE, Boolean.FALSE);
        appitizer3.SetDescription("Nfkdh dksoih rxkcn dofb skfn voish dkdn foksn dlks ksn fkn kfn dokhl skdhlkj\n");
        
        
        appitizers.add(appitizer1);
        appitizers.add(appitizer2);
        appitizers.add(appitizer3);
    }    
    
}
