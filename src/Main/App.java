/*
 * CSCE 4444
 * 
 * 
 */
package Main;

import Food.MasterFoodItemList;
import Food.Order;
import Info.ConfirmOrderInfo;
import Info.GameInfo;
import Info.HomeScreenInfo;
import Info.ItemInfo;
import Info.MenuInfo;
import Info.PayInfo;
import Info.RefillInfo;
import Info.SurveyInfo;
import Listeners.Navigator;
import Manager.Authenticate;
import Manager.CompItem;
import Manager.CompedItemReport;
import Manager.Manager;
import Panels.*;
import java.awt.BorderLayout;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import Table.*;
import javax.naming.ldap.ManageReferralControl;
import javax.swing.JFrame;


public class App extends javax.swing.JFrame {

    Stack<JPanel> history;//stores all panels visited from the homescreen
    MasterFoodItemList masterFoodItemList;
    Order order;
    Table table1;
    int managerCode;
    int waiterID;
    Split split = null;
    
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
            manager.setVisible(true);
            history.clear();//when going to the home screen, clear the stack
            swapPanel(new HomeScreen(this,table1.getOrder()));
        }

        @Override
        public void goToPay()
        {
            manager.setVisible(false);
            swapPanel(new Pay(this, table1));
        }
        
        @Override
        public void goToCard()
        {
            manager.setVisible(false);
             
            
            swapPanel(new Card(this, table1.getOrder()));

            //table1.OrderPaidByCard();
            //goToSurvey();
            
        }
        
        @Override
        public void goToTip()
        {
            manager.setVisible(false);
            swapPanel(new Tip(this, table1.getOrder()));
        }
        
        @Override
        public void goToSplit()
        {
            manager.setVisible(false);
            split = new Split(this, table1.getOrder());
            swapPanel(split);
        }
        
        @Override
        public void goToMenu() 
        {
            //if the menu button is selected a new order object is created
            //order object is set to null for cheking if items have been addded to the order
            manager.setVisible(false);
            swapPanel(new Menu(this,table1));
            
        }

        @Override
        public void goToEntrees() 
        {
            //swapPanel(new Entrees(this));
            //check if there is a panel to remove
            
            manager.setVisible(false);
            if(masterFoodItemList == null)
            {
                System.out.println("so null");
            }
            
            if(current != null)
            {
                layeredPane.remove(current);//remove the current screen    
            }
            
            current = new Entrees(this, masterFoodItemList.entries, table1.getOrder());//set current to the new panel
            
            
            history.push(current);//push the new panel onto the stack
            layeredPane.add(current);//add the new panel to the screen
            repaint();
            validate();
        }

               
        @Override
        public void goToDrinks()
        {
            
            manager.setVisible(false);
            if(current != null)
            {
                layeredPane.remove(current);//remove the current screen    
            }
            
            current = new Drinks(this, masterFoodItemList.drinks, table1.getOrder());//set current to the new panel
            

            history.push(current);//push the new panel onto the stack
            layeredPane.add(current);//add the new panel to the screen
            repaint();
            validate();
           
        }

        @Override
        public void goToGames()
        {
            swapPanel(new Games(table1));
        }

        @Override
        public void goBack()
        {
            manager.setVisible(false);
            if(history.size() >= 2)
            {
                history.pop();
                swapPanel(history.pop());
            }
                
            
        }
        
        @Override
        public void goToAppetizers()
        {
            manager.setVisible(false);
            if(current != null)
            {
                layeredPane.remove(current);//remove the current screen    
            }
            
            current = new Appetizers(this, masterFoodItemList.appetizers, table1.getOrder());//set current to the new panel
            

            history.push(current);//push the new panel onto the stack
            layeredPane.add(current);//add the new panel to the screen
            repaint();
            validate();
           
        }
        
        @Override
        public void goToDesserts()
        {
            manager.setVisible(false);
            if(current != null)
            {
                layeredPane.remove(current);//remove the current screen    
            }
            
            current = new Desserts(this, masterFoodItemList.desserts, table1.getOrder());//set current to the new panel
            

            history.push(current);//push the new panel onto the stack
            layeredPane.add(current);//add the new panel to the screen
            repaint();
            validate();
        }

        @Override
        public void goToConfirmOrder()
        {
            manager.setVisible(false);
            swapPanel(new ConfirmOrder(this, table1));
        }
        
        
        @Override
        public void goToWelcome()
        {
            history.clear();//when going to the home screen, clear the stack
            manager.setVisible(false);
            swapPanel(new Welcome(this, table1.getOrder()));
        }
        
        @Override
        public void goToRefill()
        {
            manager.setVisible(false);
            swapPanel(new Refill(this, table1));
        }

        @Override
        public JPanel getCurrent() {
            return current;
        }
        @Override
        public void goToCash()
        {
            manager.setVisible(false);
            swapPanel(new Cash(this));
        }
        
        @Override
        public void goToTogobox()
        {
            manager.setVisible(false);
            swapPanel(new Togobox(this));
        }

        @Override
        public void goToManager()
        {
            manager.setVisible(false);         
            swapPanel(new Manager(order, this));
        }

        @Override
        public void goToAuthenticate()
        {
            manager.setVisible(false);
            JFrame authenticate = new Authenticate(this);
            authenticate.setVisible(true);
        }

        @Override
        public void goToCompedItem()
        {
            swapPanel(new CompItem(table1.getOrder()));
            
        }

        @Override
        public void goToCompedItemReport()
        {
            swapPanel(new CompedItemReport(table1.getOrder().getCompedItems(), table1.getOrder().getCompedItemTotal()));
        }
        @Override
        public void goToSurvey()
        {
            table1.OrderPaidByCard();
            swapPanel(new Survey(this));
        }
        @Override
        public void goToMerch()
        {
             if(current != null)
            {
                layeredPane.remove(current);//remove the current screen    
            }
            
            current = new Merch(this, masterFoodItemList.merchandise, table1.getOrder());//set current to the new panel
            

            history.push(current);//push the new panel onto the stack
            layeredPane.add(current);//add the new panel to the screen
            repaint();
            validate();
        }

        @Override
        public void goToConfirmOrderInfo() {
             swapPanel(new ConfirmOrderInfo());
        }

        @Override
        public void goToGameInfo() {
            swapPanel(new GameInfo());
        }

        @Override
        public void goToHomeScreenInfo() {
            swapPanel(new HomeScreenInfo());
        }

        @Override
        public void goToItemInfo() {
            swapPanel(new ItemInfo());
        }

        @Override
        public void goToMenuInfo() {
            swapPanel(new MenuInfo());
        }

        @Override
        public void goToPayInfo() {
           swapPanel(new PayInfo());
        }

        @Override
        public void goToRefillInfo() {
            swapPanel(new RefillInfo());
        }

        @Override
        public void goToSurveyInfo() {
            swapPanel(new SurveyInfo());
        }

        @Override
        public void goToPaySplitCheck()
        {
            swapPanel(new PaySplitCheck(this,split));
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
        
        table1 = new Table();//Create new table
        table1.Handshake();//Connect table to the server
        
        //Weak fix to Table/Server thread issue
        try
        {
            Thread.sleep(1000);
            
        } catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        
        masterFoodItemList = table1.getMasterFoodItemList();//gets the Menu from the Table class
       
        //Open the homescreen
        navigator.goToWelcome();

              
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layeredPane = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        manager = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1024, 768));

        layeredPane.setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanel1.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/home-icon-48x48.png"))); // NOI18N
        jLabel1.setText("HOME");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/back-icon-48x48.png"))); // NOI18N
        jLabel2.setText("BACK");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/refill-icon-48x48.png"))); // NOI18N
        jLabel3.setText("REFILL");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/waiter-icon-48x48.png"))); // NOI18N
        jLabel4.setText("WAITER");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/tutorial-icon-48x48.png"))); // NOI18N
        jLabel5.setText("INFO");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        layeredPane.setLayer(jPanel1, javax.swing.JLayeredPane.PALETTE_LAYER);
        layeredPane.add(jPanel1);
        jPanel1.setBounds(620, 0, 400, 90);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));
        layeredPane.add(jPanel2);
        jPanel2.setBounds(920, 670, 50, 100);

        manager.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        manager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/settings.png"))); // NOI18N
        manager.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                managerMouseClicked(evt);
            }
        });
        layeredPane.add(manager);
        manager.setBounds(0, 0, 48, 48);

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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        navigator.goToRefill();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel4MouseClicked
    {//GEN-HEADEREND:event_jLabel4MouseClicked
        table1.RequestHelp();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void managerMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_managerMouseClicked
    {//GEN-HEADEREND:event_managerMouseClicked

        navigator.goToAuthenticate();
    }//GEN-LAST:event_managerMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        
 
        String[] parsedString;
        String delims = "[.\\[]";
       
        parsedString= history.peek().toString().split(delims);//finds the name of the panel and stores it in the 2nd index in parsed strings
        
        //System.out.println(parsedString[1]);
        
        switch(parsedString[1])
        {
            case "HomeScreen":
                navigator.goToHomeScreenInfo();
                break;
                
            case "Appetizers":
            case "Desserts":
            case "Entrees":
            case "Merch":
            case "Drinks":
                navigator.goToItemInfo();
                break;
                
            case "Games":
                navigator.goToGameInfo();
                break;
                
            case "ConfirmOrder":
                navigator.goToConfirmOrderInfo();
                 break;
            case  "Pay":
                navigator.goToPayInfo();
                break;
            case "Survey":
                navigator.goToSurveyInfo();
                break;
            case "Menu":
                navigator.goToMenuInfo();
                break;
            case "Refill":
                navigator.goToRefillInfo();
                break;
            default:
                break;
                
        }
        
        
    }//GEN-LAST:event_jLabel5MouseClicked

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JLabel manager;
    // End of variables declaration//GEN-END:variables
}
