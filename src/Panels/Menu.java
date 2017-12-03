/*
 * CSCE 4444
 * 
 * 
 */
package Panels;

import Food.Order;
import Listeners.Navigator;
import Food.Food;
import javax.swing.JLabel;
import Listeners.OrderItemDetailsListener;
import Table.Table;
import java.awt.GridLayout;
import javax.swing.JScrollPane;

/**
 *
 * @author Buckwheat
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form menu
     */
    private Navigator navigator;
    private Order order;
    private Table table;
    
    
      OrderItemDetailsListener listener = new OrderItemDetailsListener() 
        {
            @Override
            public void modifyItem(Food item)
            {

            }

            @Override
            public void recallItem()
            {

            }
        };

    public Menu(Navigator navigator,Table table) {
        
        initComponents();
        setSize(1024,768);
        this.navigator = navigator;
        this.table = table;
        
        jScrollPane1.getViewport().setOpaque(false);//this makes the scrollpane transparent
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        orderDetails.setLayout(new GridLayout(0,1));
        clearOrderDetails();
        populateOrderPanel();
        
        subTotal.setText(setSubTotal());
  
    }
    
    public void clearOrderDetails()
    {
        orderDetails.removeAll();
        orderDetails.revalidate();
        orderDetails.repaint();  
    }
    
   public void populateOrderPanel()//populates the order
    {
        clearOrderDetails();
         for(Food drink : table.getOrder().getDrink())
        {
            orderDetails.add(new OrderItemDetails(drink, listener,navigator));
        }
        
        //Populate Appetizers, Entrees, and Desserts
        for(Food item : table.getOrder().getFoodItem())
        {
            if(item.getItemCatagory().equals("appetizer"))
            {
                orderDetails.add(new OrderItemDetails(item, listener,navigator));
            }
            if(item.getItemCatagory().equals("entree") || item.getItemCatagory().equals("kidsmeal"))
            {
                orderDetails.add(new OrderItemDetails(item, listener,navigator));
            }
            if(item.getItemCatagory().equals( "dessert"))
            {
                orderDetails.add(new OrderItemDetails(item, listener,navigator));
            }
            orderDetails.revalidate();
            orderDetails.repaint();
        }
    }
    public String setSubTotal()
    {
        //Calculate the total price of the order
 
        table.getOrder().calculateSubTotal();
        
        return String.format("%.02f", table.getOrder().getSubTotal());
    }
    
    public String setTax()
    {
        table.getOrder().calculateTax();
        return String.format("%.02f", table.getOrder().getTax());
    }
    
 /*   
    public JLabel getEntreeButton(){
        return entreesButton;
    }
*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drinksButton = new javax.swing.JLabel();
        entreesButton = new javax.swing.JLabel();
        DESSERTS = new javax.swing.JLabel();
        APPETIZERS = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        subTotal1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderDetails = new javax.swing.JPanel();
        Details = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        subTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 0));
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));

        drinksButton.setBackground(new java.awt.Color(204, 0, 0));
        drinksButton.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        drinksButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        drinksButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuButtons/drinks.png"))); // NOI18N
        drinksButton.setLabelFor(drinksButton);
        drinksButton.setText("DRINKS");
        drinksButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        drinksButton.setMaximumSize(new java.awt.Dimension(228, 62));
        drinksButton.setMinimumSize(new java.awt.Dimension(228, 62));
        drinksButton.setOpaque(true);
        drinksButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drinksButtonMouseClicked(evt);
            }
        });

        entreesButton.setBackground(new java.awt.Color(204, 0, 0));
        entreesButton.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        entreesButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entreesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuButtons/burger.png"))); // NOI18N
        entreesButton.setText("ENTREES");
        entreesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        entreesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entreesButtonMouseClicked(evt);
            }
        });

        DESSERTS.setBackground(new java.awt.Color(204, 0, 0));
        DESSERTS.setFont(new java.awt.Font("Lucida Fax", 1, 48)); // NOI18N
        DESSERTS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DESSERTS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuButtons/desserts.png"))); // NOI18N
        DESSERTS.setLabelFor(DESSERTS);
        DESSERTS.setText("DESSERTS");
        DESSERTS.setToolTipText("");
        DESSERTS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DESSERTS.setMaximumSize(new java.awt.Dimension(228, 62));
        DESSERTS.setMinimumSize(new java.awt.Dimension(228, 62));
        DESSERTS.setOpaque(true);
        DESSERTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DESSERTSMouseClicked(evt);
            }
        });

        APPETIZERS.setBackground(new java.awt.Color(204, 0, 0));
        APPETIZERS.setFont(new java.awt.Font("Lucida Fax", 1, 48)); // NOI18N
        APPETIZERS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        APPETIZERS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuButtons/appetizer.png"))); // NOI18N
        APPETIZERS.setLabelFor(APPETIZERS);
        APPETIZERS.setText("APPETIZERS");
        APPETIZERS.setToolTipText("");
        APPETIZERS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        APPETIZERS.setMaximumSize(new java.awt.Dimension(228, 62));
        APPETIZERS.setMinimumSize(new java.awt.Dimension(228, 62));
        APPETIZERS.setOpaque(true);
        APPETIZERS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                APPETIZERSMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDER");
        jLabel1.setOpaque(true);

        subTotal1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subTotal1.setForeground(new java.awt.Color(255, 255, 0));

        orderDetails.setBackground(new java.awt.Color(204, 0, 0));
        orderDetails.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane1.setViewportView(orderDetails);

        Details.setBackground(new java.awt.Color(204, 0, 0));

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel2.setText("Subtotal:");

        subTotal.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        subTotal.setText("subtotal");

        jLabel3.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONFIRM ORDER");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DetailsLayout = new javax.swing.GroupLayout(Details);
        Details.setLayout(DetailsLayout);
        DetailsLayout.setHorizontalGroup(
            DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailsLayout.createSequentialGroup()
                .addGroup(DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(subTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DetailsLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        DetailsLayout.setVerticalGroup(
            DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailsLayout.createSequentialGroup()
                .addGroup(DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drinksButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entreesButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DESSERTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(APPETIZERS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(476, 476, 476)
                    .addComponent(subTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(508, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(APPETIZERS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drinksButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DESSERTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entreesButton))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(376, 376, 376)
                    .addComponent(subTotal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(376, 376, 376)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void drinksButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinksButtonMouseClicked
        // TODO add your handling code here:
        navigator.goToDrinks();
        //send request to server
    }//GEN-LAST:event_drinksButtonMouseClicked

    private void entreesButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_entreesButtonMouseClicked
    {//GEN-HEADEREND:event_entreesButtonMouseClicked
        // TODO add your handling code here:
        navigator.goToEntrees();
    }//GEN-LAST:event_entreesButtonMouseClicked

    private void DESSERTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DESSERTSMouseClicked
        // TODO add your handling code here:
        navigator.goToDesserts();  
    }//GEN-LAST:event_DESSERTSMouseClicked

    private void APPETIZERSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APPETIZERSMouseClicked
        // TODO add your handling code here:
        navigator.goToAppetizers();
    }//GEN-LAST:event_APPETIZERSMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        navigator.goToConfirmOrder();
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel APPETIZERS;
    private javax.swing.JLabel DESSERTS;
    private javax.swing.JPanel Details;
    private javax.swing.JLabel drinksButton;
    private javax.swing.JLabel entreesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel orderDetails;
    private javax.swing.JLabel subTotal;
    private javax.swing.JLabel subTotal1;
    // End of variables declaration//GEN-END:variables
}
