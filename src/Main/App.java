/*
 * CSCE 4444
 * 
 * 
 */
package Main;

import Listeners.Navigator;
import Panels.Drinks;
import Panels.EntreeItems;
import Panels.Entrees;
import Panels.HomeScreen;
import Panels.Icons;
import Panels.Menu;
import java.awt.BorderLayout;

public class App extends javax.swing.JFrame {

    
    Navigator navigator = new Navigator() {
        @Override
        public void goToHomeScreen() {
            setContentPane(new HomeScreen(this));
            repaint();
            validate();
        }

        @Override
        public void goToMenu() {
            System.out.println("Yup");
            setContentPane(new Menu(this));           
            repaint();
            validate();
            
        }

        @Override
        public void goToEntrees() {
            setContentPane(new Entrees(this));
            repaint();
            validate();
        }

        @Override
        public void goToEntreeItems() {
            setContentPane(new EntreeItems(this));
            repaint();
            validate();
        }

        @Override
        public void goToDrinks() {
            setContentPane(new Drinks(this));
            repaint();
            validate();
        }
        
    };
    
    /**
     * Creates new form App
     */
    public App() {
        initComponents();
        setSize(1024, 768); 
        navigator.goToHomeScreen();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
