/*
 * CSCE 4444
 * 
 * 
 */
package allclasses;

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
        
        appitizer1 = new Food("Buffalo Wings", "Food",5.99, Boolean.TRUE, Boolean.FALSE);
        appitizer1.SetDescription("Some pretty good buffalo wings\n");
        
        
        appitizer2 = new Food("Fried Pickles", "Food",6.99, Boolean.TRUE, Boolean.FALSE);
        appitizer2.SetDescription("I mean, cmon.\n");
        
        
        appitizer3 = new Food("French fries", "Food",7.99, Boolean.TRUE, Boolean.FALSE);
        appitizer3.SetDescription("I have no clue\n");
        
        
        appitizers.add(appitizer1);
        appitizers.add(appitizer2);
        appitizers.add(appitizer3);
    }    
    
}
