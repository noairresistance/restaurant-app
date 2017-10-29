/*
 * CSCE 4444
 * 
 * 
 */
package Panels;

import Food.Food;
import Food.Order;
import Listeners.IngredientsCellRenderer;
import Listeners.IngredientsListener;
import Listeners.Navigator;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import static javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION;

public class Entrees extends javax.swing.JPanel implements IngredientsListener{

    Navigator navigator;
    ArrayList<Food> entrees;   
    DefaultListModel dlmEntreeItems, dlmIngredients;//This lets you add items to a list after the list has been created 
    String selection;//Holds the value of the item selected from the list
    int iterator;//used for finding values in the entrees array
    Order order;//Holds the customers entire order
    
    /**
     * Creates new form EntreeItems
     */
    public Entrees(Navigator navigator, ArrayList<Food> entrees, Order order) {
        initComponents();
        this.navigator = navigator;
        this.entrees = entrees;
        this.order = order;

        dlmEntreeItems = new DefaultListModel();//Create new Default List Model for list of entree items
        
        
        //Add item names from the entrees array to the dlm
        for (int i = 0; i < entrees.size(); i++)
        {
            dlmEntreeItems.addElement(entrees.get(i).GetName());
        }
        
        //Add the dlm to the list
        foodList.setModel(dlmEntreeItems);
        
        //Creates Ingredient Cell Renderer
        //Setting this render to the list
        itemIngredients.setCellRenderer(new IngredientsCellRenderer(this));
        
        
              
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        foodList = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        itemName = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        itemDescription = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        itemIngredients = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 0));
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setSize(new java.awt.Dimension(1024, 768));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ORDER DETAILS");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BURGERS");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));

        foodList.setBackground(new java.awt.Color(204, 0, 0));
        foodList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        foodList.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        foodList.setForeground(new java.awt.Color(255, 255, 0));
        foodList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        foodList.addListSelectionListener(new javax.swing.event.ListSelectionListener()
        {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt)
            {
                foodListValueChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(foodList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodList, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));

        itemName.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        itemName.setForeground(new java.awt.Color(255, 255, 0));
        itemName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        itemDescription.setBackground(new java.awt.Color(204, 0, 0));
        itemDescription.setColumns(20);
        itemDescription.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        itemDescription.setForeground(new java.awt.Color(255, 255, 0));
        itemDescription.setLineWrap(true);
        itemDescription.setRows(5);
        jScrollPane3.setViewportView(itemDescription);

        itemIngredients.setBackground(new java.awt.Color(204, 0, 0));
        itemIngredients.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        itemIngredients.setForeground(new java.awt.Color(255, 255, 0));
        itemIngredients.addListSelectionListener(new javax.swing.event.ListSelectionListener()
        {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt)
            {
                itemIngredientsValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(itemIngredients);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(itemName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void itemIngredientsValueChanged(javax.swing.event.ListSelectionEvent evt)//GEN-FIRST:event_itemIngredientsValueChanged
    {//GEN-HEADEREND:event_itemIngredientsValueChanged
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_itemIngredientsValueChanged

    private void foodListValueChanged(javax.swing.event.ListSelectionEvent evt)//GEN-FIRST:event_foodListValueChanged
    {//GEN-HEADEREND:event_foodListValueChanged
        // TODO add your handling code here:
        iterator = 0;//Holds the index of the selected item in the entrees array
        dlmIngredients = new DefaultListModel();//Default List Model for the ingredient list

        selection = foodList.getSelectedValue();//Get the selected item
        itemName.setText(selection);//Set the itemName JLabel to display the selected item's name

        //Finds the index of the selected item from the entrees array
        //Iterator will be with index number
        while(entrees.get(iterator).GetName() != selection)
        {
            iterator++;
        }

        itemDescription.setText(entrees.get(iterator).GetDescription());//Set the itemDescription JLabel to display the selected item's description

        //Add ingredients to dlmIngrdients
        for (int i = 0; i < entrees.get(iterator).getIngrediantArraySize(); i++)
        {
            dlmIngredients.addElement(entrees.get(iterator).GetIngredients(i));

        }

        itemIngredients.setModel(dlmIngredients);

    }//GEN-LAST:event_foodListValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> foodList;
    private javax.swing.JTextArea itemDescription;
    private javax.swing.JList<String> itemIngredients;
    private javax.swing.JLabel itemName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

    
    
    //Where ingredients will be added or removed from the 3rd list
    @Override
    public void addIngredient(String ingredient)
    {
        
    }

    @Override
    public void removeIngredient(String ingredient)
    {
        
    }

    @Override
    public boolean hasIngredient(String ingredient)
    {
        return false;
    }
}
