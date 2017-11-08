/*
 * CSCE 4444
 * 
 * 
 */
package Main;

import Food.MasterFoodItemList;
import Food.Order;
import Listeners.Navigator;
import MockServer.*;
import Panels.*;
import java.awt.BorderLayout;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import table.Table;

public class App extends javax.swing.JFrame {

    Stack<JPanel> history;//stores all panels visited from the homescreen
    MasterFoodItemList masterFoodItemList;
    Order order;
    Table table;
    
    Navigator navigator = new Navigator() 
    {
        JPanel current;//stores the current panel
        
        void swapPanel(JPanel newPanel)
        {
            
            //check if there is a panel to remove
            if(current != null)
            {
                layeredPane.remove(current);//remove the current screen    
            }
            
            current = newPanel;//set current to the new panel
            history.push(current);//push the new panel onto the stack
            layeredPane.add(current);//add the new panel to the screen
            repaint();
            validate();
            
            
        }
        
        @Override
        public void goToHomeScreen() 
        {    
            history.clear();//when going to the home screen, clear the stack
            swapPanel(new HomeScreen(this));
        }

        @Override
        public void goToPay()
        {
            swapPanel(new Pay(this, order));
        }
        
        @Override
        public void goToCard()
        {
            swapPanel(new Card(this, order));
        }
        
        @Override
        public void goToTip()
        {
            swapPanel(new Tip(this, order));
        }
        
        @Override
        public void goToSplit()
        {
            swapPanel(new Split(this, order));
        }
        
        @Override
        public void goToMenu() 
        {
            //if the menu button is selected a new order object is created
            //order object is set to null for cheking if items have been addded to the order
            order = new Order();
            swapPanel(new Menu(this));
            
        }

        @Override
        public void goToEntrees() 
        {
            //swapPanel(new Entrees(this));
            //check if there is a panel to remove
            
            if(current != null)
            {
                layeredPane.remove(current);//remove the current screen    
            }
            
            current = new Entrees(this, masterFoodItemList.entries, order);//set current to the new panel
            
            
            history.push(current);//push the new panel onto the stack
            layeredPane.add(current);//add the new panel to the screen
            repaint();
            validate();
        }

               
        @Override
        public void goToDrinks()
        {
             if(current != null)
            {
                layeredPane.remove(current);//remove the current screen    
            }
            
            current = new Drinks(this, masterFoodItemList.drinks, order);//set current to the new panel
            

            history.push(current);//push the new panel onto the stack
            layeredPane.add(current);//add the new panel to the screen
            repaint();
            validate();
           
        }

        @Override
        public void goToGames()
        {
            swapPanel(new Games());
        }

        @Override
        public void goBack()
        {
            
            if(history.size() >= 2)
            {
                history.pop();
                swapPanel(history.pop());
            }
                
            
        }
        
        @Override
        public void goToAppetizers()
        {
             if(current != null)
            {
                layeredPane.remove(current);//remove the current screen    
            }
            
            current = new Appetizers(this, masterFoodItemList.appetizers, order);//set current to the new panel
            

            history.push(current);//push the new panel onto the stack
            layeredPane.add(current);//add the new panel to the screen
            repaint();
            validate();
           
        }
        
        @Override
        public void goToDesserts()
        {

             if(current != null)
            {
                layeredPane.remove(current);//remove the current screen    
            }
            
            current = new Desserts(this, masterFoodItemList.desserts, order);//set current to the new panel
            

            history.push(current);//push the new panel onto the stack
            layeredPane.add(current);//add the new panel to the screen
            repaint();
            validate();
        }
  
    };
    
    /**
     * Creates new form App
     */
    public App() {
        
        //Make the frame
        initComponents();
        setSize(1024, 790);
        
        //Set back button location
        history = new Stack<>();
        
        //Open the homescreen
        navigator.goToHomeScreen();
        
        //table = new Table();
        
        //table.connectToServer(table);
        
        
        
        //Create thread for server
        Runnable serverThread = new Server();
        Thread thread = new Thread(serverThread);
        thread.start();
        
        //Create client
        Client client = new Client();
        try
        {
            //Connect to server
            client.go();
            masterFoodItemList = client.getMasterFoodItemList();
        } catch (ClassNotFoundException ex)
        {
            ex.getStackTrace();
        }
        
        
        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        layeredPane = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1024, 768));

        layeredPane.setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanel1.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/home-icon-48x48.png"))); // NOI18N
        jLabel1.setText("HOME");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/back-icon-48x48.png"))); // NOI18N
        jLabel2.setText("BACK");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/refill-icon-48x48.png"))); // NOI18N
        jLabel3.setText("REFILL");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/waiter-icon-48x48.png"))); // NOI18N
        jLabel4.setText("WAITER");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/tutorial-icon-48x48.png"))); // NOI18N
        jLabel5.setText("INFO");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layeredPane.setLayer(jPanel1, javax.swing.JLayeredPane.PALETTE_LAYER);
        layeredPane.add(jPanel1);
        jPanel1.setBounds(620, 0, 400, 90);

        getContentPane().add(layeredPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel1MouseClicked
    {//GEN-HEADEREND:event_jLabel1MouseClicked
        // TODO add your handling code here:
        
        navigator.goToHomeScreen();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel2MouseClicked
    {//GEN-HEADEREND:event_jLabel2MouseClicked
        // TODO add your handling code here:
        navigator.goBack();    
    }//GEN-LAST:event_jLabel2MouseClicked

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLayeredPane layeredPane;
    // End of variables declaration//GEN-END:variables
}
