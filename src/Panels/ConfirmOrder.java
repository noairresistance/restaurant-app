/*
 * CSCE 4444
 * 
 * 
 */
package Panels;

import Food.*;
import Listeners.Navigator;
import Listeners.OrderItemDetailsListener;
import Table.Table;


public class ConfirmOrder extends javax.swing.JPanel
{
    Navigator navigator;
    Table table;
    double entreecount = 0;
    double temp_entreecount = 0;
    double drinkcount = 0;
    double combocount = 0;
    double cookiecount = 0;
    double temp_cookiecount = 0;
    double dealcount = 0;
    
    
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

    public ConfirmOrder(Navigator navigator, Table table)
    {
        initComponents();
        setSize(1024, 768);
        drinkScrollPane.getViewport().setOpaque(false);//this makes the scrollpane transparent
        appetizerScrollPane.getViewport().setOpaque(false);//this makes the scrollpane transparent
        entreeScrollPane.getViewport().setOpaque(false);//this makes the scrollpane transparent
        dessertScrollPane.getViewport().setOpaque(false);//this makes the scrollpane transparent
        
        this.navigator = navigator;
        this.table = table;
       
        clearAllPanels();//Clear panels of all information
        
        populateAllPanels();//Populate all panels
        
        subTotal.setText(setSubTotal());
        tax.setText(setTax());
        grandTotal.setText(setGrandTotal());
        comboDiscount.setText(setComboDiscount());
        //dealDiscount.setText(setDealDiscount());
        
    }
    
    
    
    //******************* HELPER METHODS ********************************//
    
    //Clear panels of all information
    public void clearAllPanels()
    {
        drinkDetails.removeAll();
        drinkDetails.revalidate();
        drinkDetails.repaint();
        
        appetizerDetails.removeAll();
        appetizerDetails.revalidate();
        appetizerDetails.repaint();
        
        entreeDetails.removeAll();
        entreeDetails.revalidate();
        entreeDetails.repaint();
        
        dessertDetails.removeAll();
        dessertDetails.revalidate();
        dessertDetails.repaint();
    }
    
    //Populates each panel with a category of a menu item
    public void populateAllPanels()
    {   
        clearAllPanels();//Clear panels of all information
        
        //Populate Drinks
        for(Food drink : table.getOrder().getDrink())
        {
            drinkDetails.add(new OrderItemDetails(drink, listener, navigator));
            drinkcount++;
        }
        
        //Populate Appetizers, Entrees, and Desserts
        for(Food item : table.getOrder().getFoodItem())
        {
            if(item.getItemCatagory().equals("appetizer"))
            {
                appetizerDetails.add(new OrderItemDetails(item, listener, navigator));
            }
            if(item.getItemCatagory().equals("entree")||item.getItemCatagory().equals("kidsmeal"))
            {
                entreeDetails.add(new OrderItemDetails(item, listener, navigator));
                entreecount++;
            }
            if(item.getItemCatagory().equals( "dessert"))
            {
/*                if(item.GetName().equals("Holiday Cookie")) //this works, but only if entree is ordered first.
                {
                    cookiecount++;
                    temp_cookiecount = cookiecount;
                    if(cookiecount > 0 && entreecount > 0)
                    {    
                        item.SetPrice(1.00);
                        //dealcount++;
                        cookiecount--;
                        entreecount--;
                    }
                }*/
                dessertDetails.add(new OrderItemDetails(item, listener, navigator));
            }
        }
        
        drinkDetails.revalidate();
        drinkDetails.repaint();
        
        appetizerDetails.revalidate();
        appetizerDetails.repaint();
        
        entreeDetails.revalidate();
        entreeDetails.repaint();
        
        dessertDetails.revalidate();
        dessertDetails.repaint();
        
    }

    //Calculates subtotal an returns it as a string
    public String setSubTotal()
    {
        temp_entreecount = entreecount;
        
        while(entreecount > 0 && drinkcount > 0)
        {
            combocount++;
            entreecount--;
            drinkcount--;
            
        }
      /*  
        while(entreecount > 0 && temp_cookiecount > 0) //issue here. If this code triggers and there was a combo, then combo is overwritten.
        {
            dealcount++;
            temp_entreecount--;
            temp_cookiecount--;
            
        }
        */
    
        table.getOrder().calculateSubTotal();//Calculate the total price of the order
        return String.format("%.02f", table.getOrder().getSubTotal() - combocount);
    }
    
    public String setComboDiscount()
    {
        return String.format("%.02f", combocount);
    }
    /*
    public String setDealDiscount()
    {
        return String.format("%.02f", dealcount*2);
    }*/
    public String setTax()
    {
        table.getOrder().calculateTax();
        return String.format("%.02f", table.getOrder().getTax());
    }
    
    public String setGrandTotal()
    {
        table.getOrder().calculateTotalPrice();
        return String.format("%.02f", table.getOrder().getTotalPrice());
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemGroup = new javax.swing.JPanel();
        drinks = new javax.swing.JPanel();
        drinkScrollPane = new javax.swing.JScrollPane();
        drinkDetails = new javax.swing.JPanel();
        appetizers = new javax.swing.JPanel();
        appetizerScrollPane = new javax.swing.JScrollPane();
        appetizerDetails = new javax.swing.JPanel();
        entrees = new javax.swing.JPanel();
        entreeScrollPane = new javax.swing.JScrollPane();
        entreeDetails = new javax.swing.JPanel();
        desserts = new javax.swing.JPanel();
        dessertScrollPane = new javax.swing.JScrollPane();
        dessertDetails = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        placeOrder = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        subTotal = new javax.swing.JLabel();
        tax = new javax.swing.JLabel();
        grandTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboDiscount = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 0, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        setPreferredSize(new java.awt.Dimension(1024, 768));

        itemGroup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        itemGroup.setOpaque(false);
        itemGroup.setLayout(new java.awt.GridLayout(2, 2));

        drinks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        drinks.setOpaque(false);

        drinkScrollPane.setOpaque(false);

        drinkDetails.setOpaque(false);
        drinkDetails.setLayout(new javax.swing.BoxLayout(drinkDetails, javax.swing.BoxLayout.Y_AXIS));
        drinkScrollPane.setViewportView(drinkDetails);
        drinkDetails.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout drinksLayout = new javax.swing.GroupLayout(drinks);
        drinks.setLayout(drinksLayout);
        drinksLayout.setHorizontalGroup(
            drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drinkScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        drinksLayout.setVerticalGroup(
            drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drinkScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        itemGroup.add(drinks);

        appetizers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        appetizers.setOpaque(false);

        appetizerScrollPane.setOpaque(false);

        appetizerDetails.setOpaque(false);
        appetizerDetails.setLayout(new javax.swing.BoxLayout(appetizerDetails, javax.swing.BoxLayout.Y_AXIS));
        appetizerScrollPane.setViewportView(appetizerDetails);

        javax.swing.GroupLayout appetizersLayout = new javax.swing.GroupLayout(appetizers);
        appetizers.setLayout(appetizersLayout);
        appetizersLayout.setHorizontalGroup(
            appetizersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appetizerScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        appetizersLayout.setVerticalGroup(
            appetizersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appetizerScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        itemGroup.add(appetizers);

        entrees.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        entrees.setOpaque(false);

        entreeScrollPane.setOpaque(false);

        entreeDetails.setOpaque(false);
        entreeDetails.setLayout(new javax.swing.BoxLayout(entreeDetails, javax.swing.BoxLayout.Y_AXIS));
        entreeScrollPane.setViewportView(entreeDetails);

        javax.swing.GroupLayout entreesLayout = new javax.swing.GroupLayout(entrees);
        entrees.setLayout(entreesLayout);
        entreesLayout.setHorizontalGroup(
            entreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entreeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        entreesLayout.setVerticalGroup(
            entreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entreeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        itemGroup.add(entrees);

        desserts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        desserts.setOpaque(false);

        dessertScrollPane.setOpaque(false);

        dessertDetails.setOpaque(false);
        dessertDetails.setLayout(new javax.swing.BoxLayout(dessertDetails, javax.swing.BoxLayout.Y_AXIS));
        dessertScrollPane.setViewportView(dessertDetails);

        javax.swing.GroupLayout dessertsLayout = new javax.swing.GroupLayout(desserts);
        desserts.setLayout(dessertsLayout);
        dessertsLayout.setHorizontalGroup(
            dessertsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dessertScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        dessertsLayout.setVerticalGroup(
            dessertsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dessertScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        itemGroup.add(desserts);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONFIRM ORDER");

        placeOrder.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        placeOrder.setForeground(new java.awt.Color(255, 255, 0));
        placeOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        placeOrder.setText("***PLACE ORDER***");
        placeOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        placeOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                placeOrderMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("SubTotal");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Tax");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Grand Total");

        subTotal.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        subTotal.setForeground(new java.awt.Color(255, 255, 0));
        subTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTotal.setText("0.00");

        tax.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        tax.setForeground(new java.awt.Color(255, 255, 0));
        tax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tax.setText("0.00");

        grandTotal.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        grandTotal.setForeground(new java.awt.Color(255, 255, 0));
        grandTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grandTotal.setText("0.00");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Combo Discount: ");

        comboDiscount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboDiscount.setForeground(new java.awt.Color(255, 255, 0));
        comboDiscount.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                                    .addComponent(jLabel3))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(subTotal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tax)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(grandTotal)
                                .addGap(72, 72, 72)))
                        .addComponent(placeOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(placeOrder)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(subTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tax))
                            .addComponent(grandTotal))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboDiscount))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    //CONFIRM ORDER
    private void placeOrderMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_placeOrderMouseClicked
    {//GEN-HEADEREND:event_placeOrderMouseClicked
         
        table.SendOrder();
        placeOrder.setText("ORDER HAS BEEN PLACED!");
    }//GEN-LAST:event_placeOrderMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appetizerDetails;
    private javax.swing.JScrollPane appetizerScrollPane;
    private javax.swing.JPanel appetizers;
    private javax.swing.JLabel comboDiscount;
    private javax.swing.JPanel dessertDetails;
    private javax.swing.JScrollPane dessertScrollPane;
    private javax.swing.JPanel desserts;
    private javax.swing.JPanel drinkDetails;
    private javax.swing.JScrollPane drinkScrollPane;
    private javax.swing.JPanel drinks;
    private javax.swing.JPanel entreeDetails;
    private javax.swing.JScrollPane entreeScrollPane;
    private javax.swing.JPanel entrees;
    private javax.swing.JLabel grandTotal;
    private javax.swing.JPanel itemGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel placeOrder;
    private javax.swing.JLabel subTotal;
    private javax.swing.JLabel tax;
    // End of variables declaration//GEN-END:variables
}
