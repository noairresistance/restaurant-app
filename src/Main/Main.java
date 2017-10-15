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
       
        //Create a separate thread 
        //Create a Handler
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Handler handler = new Handler();

            }
        });
    }
}
