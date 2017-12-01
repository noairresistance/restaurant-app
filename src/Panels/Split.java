/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Food.Food;
import Listeners.Navigator;
import Food.Order;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Birdman
 */
public class Split extends javax.swing.JPanel {

    private
    Navigator navigator;
    Order order;
    
    private ArrayList<Food> tab1;
    private ArrayList<Food> tab2;
    private ArrayList<Food> tab3; //needs to be implemented.
    private ArrayList<Food> tab4; 
    private DefaultListModel dlmTab1;
    private DefaultListModel dlmTab2;
    private DefaultListModel dlmTab3; //needs to be implemented.
    private DefaultListModel dlmTab4; 
    public double total1;
    public double total2;
    public double total3;
    public double total4;
    /**
     * Creates new form Split
     */
    public Split(Navigator navigator, Order order) {
        initComponents();
        setSize(1024, 768);
        this.navigator = navigator;
        this.order = order;
        
        tab1 = new ArrayList<Food>();
        tab2 = new ArrayList<Food>();
        tab3 = new ArrayList<Food>();
        tab4 = new ArrayList<Food>();
        dlmTab1 = new DefaultListModel();
        dlmTab2 = new DefaultListModel();
        dlmTab3 = new DefaultListModel();
        dlmTab4 = new DefaultListModel();
        total1 = 0;
        total2 = 0;
        total3 = 0;
        total4 = 0;
        
        populateTabs();
    
         listTab1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
         });
         listTab2.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
         });                 
        listTab3.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
         });     
         listTab4.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
         });        
    }
    private void populateTabs()
    {
        tab1.clear();
        tab2.clear();
        tab3.clear();
        tab3.clear();
        dlmTab1.clear();
        dlmTab2.clear();
        dlmTab3.clear();
        dlmTab4.clear();
        total1 = 0;
        total2 = 0;
        total3 = 0;
        total4 = 0;
        for(Food drink : order.getDrink())
        {
            switch(drink.GetTabNumber())
            {
                case 1:
                    tab1.add(drink);
                    dlmTab1.addElement(drink.GetName());
                    total1 = total1 + drink.GetItemPrice();
                    break;
                case 2:
                    tab2.add(drink);
                    dlmTab2.addElement(drink.GetName());
                    total2 = total2 + drink.GetItemPrice();
                    break;
                case 3:
                    tab3.add(drink);
                    dlmTab3.addElement(drink.GetName());
                    total3 = total3 + drink.GetItemPrice();
                    break;
                case 4:
                    tab4.add(drink);
                    dlmTab4.addElement(drink.GetName());
                    total4 = total4 + drink.GetItemPrice();
                     break;
                     
                default:
                   tab1.add(drink);
                   dlmTab1.addElement(drink.GetName());
                   total1 = total1 + drink.GetItemPrice();
                   break; 
                  
            }
        }
     
        for(Food item : order.getFoodItem())
        {
            switch(item.GetTabNumber())
            {
                case 1:
                    tab1.add(item);
                    dlmTab1.addElement(item.GetName());
                    total1 = total1 + item.GetItemPrice();
                    break;
                case 2:
                    tab2.add(item);
                    dlmTab2.addElement(item.GetName());
                    total2 = total2 + item.GetItemPrice();
                    break;
                case 3:
                    tab3.add(item);
                    dlmTab3.addElement(item.GetName());
                    total3 = total3 + item.GetItemPrice();
                    break;
                case 4:
                    tab4.add(item);
                    dlmTab4.addElement(item.GetName());
                    total4 = total4 + item.GetItemPrice();
                     break;
                     
                default:
                   tab1.add(item);
                   dlmTab1.addElement(item.GetName());
                   total1 = total1 + item.GetItemPrice();
                   break; 
                  
            }
        }
        listTab1.setModel(dlmTab1);
        listTab2.setModel(dlmTab2);
        listTab3.setModel(dlmTab3);
        listTab4.setModel(dlmTab4);
        totalTab1.setText(String.valueOf(total1));
        totalTab2.setText(String.valueOf(total2));
        totalTab3.setText(String.valueOf(total3));
        totalTab4.setText(String.valueOf(total4));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTab2 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTab3 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listTab1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listTab4 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        totalTab1 = new javax.swing.JLabel();
        totalTab2 = new javax.swing.JLabel();
        totalTab3 = new javax.swing.JLabel();
        totalTab4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tab 2");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Split Tabs");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(204, 0, 0));
        jLabel3.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tab 3");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(204, 0, 0));
        jLabel4.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("total");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(204, 0, 0));
        jLabel5.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tab 4");
        jLabel5.setOpaque(true);

        listTab2.setBackground(new java.awt.Color(204, 0, 0));
        listTab2.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        listTab2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listTab2);

        listTab3.setBackground(new java.awt.Color(204, 0, 0));
        listTab3.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        listTab3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listTab3);

        listTab1.setBackground(new java.awt.Color(204, 0, 0));
        listTab1.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        listTab1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listTab1);

        listTab4.setBackground(new java.awt.Color(204, 0, 0));
        listTab4.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        listTab4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listTab4);

        jButton1.setText("move to tab 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("move to tab 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("move to tab 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("move to tab 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(204, 0, 0));
        jLabel6.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tab 1");
        jLabel6.setOpaque(true);

        totalTab1.setBackground(new java.awt.Color(204, 0, 0));
        totalTab1.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        totalTab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalTab1.setText("$0.00");
        totalTab1.setOpaque(true);

        totalTab2.setBackground(new java.awt.Color(204, 0, 0));
        totalTab2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        totalTab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalTab2.setText("$0.00");
        totalTab2.setOpaque(true);

        totalTab3.setBackground(new java.awt.Color(204, 0, 0));
        totalTab3.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        totalTab3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalTab3.setText("$0.00");
        totalTab3.setOpaque(true);

        totalTab4.setBackground(new java.awt.Color(204, 0, 0));
        totalTab4.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        totalTab4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalTab4.setText("$0.00");
        totalTab4.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(totalTab1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalTab2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalTab3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalTab4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(440, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(388, 388, 388)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalTab1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalTab2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalTab3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalTab4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(672, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       if(listTab1.getSelectedIndex() != -1)
         tab1.get(listTab1.getSelectedIndex()).SetTabNumber(1);
       if(listTab2.getSelectedIndex() != -1)
        tab2.get(listTab2.getSelectedIndex()).SetTabNumber(1);
       if(listTab3.getSelectedIndex() != -1)
        tab3.get(listTab3.getSelectedIndex()).SetTabNumber(1);
       if(listTab4.getSelectedIndex() != -1)
        tab4.get(listTab4.getSelectedIndex()).SetTabNumber(1);
       
       
       populateTabs();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(listTab1.getSelectedIndex() != -1)
         tab1.get(listTab1.getSelectedIndex()).SetTabNumber(2);
       if(listTab2.getSelectedIndex() != -1)
        tab2.get(listTab2.getSelectedIndex()).SetTabNumber(2);
       if(listTab3.getSelectedIndex() != -1)
        tab3.get(listTab3.getSelectedIndex()).SetTabNumber(2);
       if(listTab4.getSelectedIndex() != -1)
        tab4.get(listTab4.getSelectedIndex()).SetTabNumber(2);
       
       
       
       populateTabs();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(listTab1.getSelectedIndex() != -1)
         tab1.get(listTab1.getSelectedIndex()).SetTabNumber(3);
       if(listTab2.getSelectedIndex() != -1)
        tab2.get(listTab2.getSelectedIndex()).SetTabNumber(3);
       if(listTab3.getSelectedIndex() != -1)
        tab3.get(listTab3.getSelectedIndex()).SetTabNumber(3);
       if(listTab4.getSelectedIndex() != -1)
        tab4.get(listTab4.getSelectedIndex()).SetTabNumber(3);
       
       populateTabs();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(listTab1.getSelectedIndex() != -1)
         tab1.get(listTab1.getSelectedIndex()).SetTabNumber(4);
       if(listTab2.getSelectedIndex() != -1)
        tab2.get(listTab2.getSelectedIndex()).SetTabNumber(4);
       if(listTab3.getSelectedIndex() != -1)
        tab3.get(listTab3.getSelectedIndex()).SetTabNumber(4);
       if(listTab4.getSelectedIndex() != -1)
        tab4.get(listTab4.getSelectedIndex()).SetTabNumber(4);
       
       populateTabs();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listTab1;
    private javax.swing.JList<String> listTab2;
    private javax.swing.JList<String> listTab3;
    private javax.swing.JList<String> listTab4;
    private javax.swing.JLabel totalTab1;
    private javax.swing.JLabel totalTab2;
    private javax.swing.JLabel totalTab3;
    private javax.swing.JLabel totalTab4;
    // End of variables declaration//GEN-END:variables
}
