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
import Listeners.OrderItemDetailsListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import static javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION;

public class Entrees extends javax.swing.JPanel{

    Navigator navigator;
    ArrayList<Food> entrees;   
    DefaultListModel dlmEntreeItems, dlmIngredients, dlmOrder;//This lets you add items to a list after the list has been created 
    String selection;//Holds the value of the item selected from the list
    int index;//used for finding values in the entrees array
    Order order;//Holds the customers entire order
    ArrayList<JCheckBox> checkBoxes;//holds list of ingredient checkboxes
    

    
    
    /**CLASS CONSTRUCTOR
     * Creates new form EntreeItems
     */
    public Entrees(Navigator navigator, ArrayList<Food> entrees, Order order) {
        initComponents();
        scrollPane.getViewport().setOpaque(false);//this makes the scrollpane transparent
        removeFromOrder.setEnabled(false);
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
        scrollPane = new javax.swing.JScrollPane();
        orderDetails = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        foodList = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        itemName = new javax.swing.JLabel();
        itemDescription = new javax.swing.JTextArea();
        itemIngredients = new javax.swing.JPanel();
        addToOrder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        specialRequestTextField = new javax.swing.JTextField();
        removeFromOrder = new javax.swing.JButton();

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

        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setOpaque(false);

        orderDetails.setBackground(new java.awt.Color(204, 0, 0));
        orderDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        orderDetails.setOpaque(false);
        orderDetails.setLayout(new javax.swing.BoxLayout(orderDetails, javax.swing.BoxLayout.Y_AXIS));
        scrollPane.setViewportView(orderDetails);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(scrollPane))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));

        itemName.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        itemName.setForeground(new java.awt.Color(255, 255, 0));
        itemName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));

        itemDescription.setBackground(new java.awt.Color(204, 0, 0));
        itemDescription.setColumns(20);
        itemDescription.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        itemDescription.setForeground(new java.awt.Color(255, 255, 0));
        itemDescription.setLineWrap(true);
        itemDescription.setRows(5);
        itemDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        itemDescription.setEnabled(false);

        itemIngredients.setBackground(new java.awt.Color(204, 51, 0));
        itemIngredients.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        itemIngredients.setLayout(new javax.swing.BoxLayout(itemIngredients, javax.swing.BoxLayout.Y_AXIS));

        addToOrder.setText("ADD TO ORDER");
        addToOrder.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addToOrderActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Special Request");

        removeFromOrder.setText("REMOVE FROM ORDER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(addToOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeFromOrder)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(itemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(itemIngredients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(specialRequestTextField))))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addToOrder, removeFromOrder});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(specialRequestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeFromOrder)
                    .addComponent(addToOrder))
                .addGap(18, 18, 18))
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
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //MODIFY AND ORDER
    //Listens for when an OrderItemDetail's panel is clicked
    OrderItemDetailsListener listener = new OrderItemDetailsListener()
    {
        
        @Override
        public void modifyItem(Food item)
        {
            
            int z = 0;//Index holder
            
            addToOrder.setText("Modify Order");
            removeFromOrder.setEnabled(true);//Enable removeFromOrder button
            
            //Select the item in the foodList
            while(item.GetName() != foodList.getModel().getElementAt(z))
            {
                z++;
            }
            foodList.setSelectedIndex(z);
            
            
            //Select the checkboxes of all of the previously added ingredients
            for (int i = 0; i < item.getIngrediantArraySize(); i++)
            {
                z = 0;
                while(item.GetIngredients(i) != checkBoxes.get(z).getText())
                {
                    z++;
                }
                checkBoxes.get(z).setSelected(true);
            }
           
        }
    
    };
    
    
    /*DISPLAY INGREDIENTS
    //This method displays a food item's, name, description, and ingredient list
    //depending on what item is selected in the itemList
    */
    private void foodListValueChanged(javax.swing.event.ListSelectionEvent evt)//GEN-FIRST:event_foodListValueChanged
    {//GEN-HEADEREND:event_foodListValueChanged
        // TODO add your handling code here:
        
        //Prevents a known bug in Java
        if(!evt.getValueIsAdjusting()){}

        //Remove all items in ingredient list
        itemIngredients.removeAll();
        revalidate();
        repaint();
        
        
        dlmIngredients = new DefaultListModel();//Default List Model for the ingredient list

        selection = foodList.getSelectedValue();//Get the selected item
        index = findindex(selection);//Finds the index of the selected item from the entrees array
        itemName.setText(selection);//Set the itemName JLabel to display the selected item's name
        itemDescription.setText(entrees.get(index).GetDescription());//Set the itemDescription JLabel to display the selected item's description
       
        checkBoxes = new ArrayList<>();//create array of checkbox comoponents
        
        //create and add checkboxes to the checkbox array
        for (int i = 0; i < entrees.get(index).getIngrediantArraySize(); i++)
        {
            checkBoxes.add(new JCheckBox(entrees.get(index).GetIngredients(i)));          
        }
        
        //Creates checkboxes with selected food item's ingredients
        for (int i = 0; i < entrees.get(index).getIngrediantArraySize(); i++)
        {
            itemIngredients.add(checkBoxes.get(i));
        }

        

    }//GEN-LAST:event_foodListValueChanged

    /*POPULATE ORDER DETAILS
    //This method adds a food item's name and selected ingredients to a Food object
    //gives that Food object to an Order object,
    //and populates the Order Details section with information from the Order object
    */
    private void addToOrderActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addToOrderActionPerformed
    {//GEN-HEADEREND:event_addToOrderActionPerformed
        
        
        // TODO add your handling code here:
        
        //Remove all orders from Order Details
        orderDetails.removeAll();
        revalidate();
        repaint();
        
        //Create new Food object with name and price of selected item
        Food foodItem = new Food(selection, entrees.get(index).GetPrice(), Boolean.TRUE, Boolean.TRUE);
         
        
        //Add all selected checkboxes as ingredients to the Food object
        for(JCheckBox checkBox : checkBoxes)
        {
            if(checkBox.isSelected())
            {
                foodItem.SetIngredients(checkBox.getText());
            }   
        }
        
        //Check if there is a special request, if so, add it as an ingredient
        if(!specialRequestTextField.getText().isEmpty())
        {
            foodItem.SetIngredients(specialRequestTextField.getText());
        }
        
        //Give the Food object to the Order object
        order.setFoodItem(foodItem);//add food item to order
        
        //Create OrderItemDetailPanels for each Food object that has been given to the Order object
        for(Food item : order.getFoodItem())
        {
            orderDetails.add(new OrderItemDetails(item, listener));
        }
        
        //Update the order details panel
        orderDetails.revalidate();
        orderDetails.repaint();
       
        //Set the has added to order field to true
        order.setHasAddedToOrder(true);
        
        
        /*
        //The following "resets" the menu state
        */        
        foodList.clearSelection();//Deselect foodList item
        itemName.setText("");//Remove selected item name
        itemDescription.setText("");//Remove selected item description
        itemIngredients.removeAll();//Remove selected item ingredient list
        itemIngredients.revalidate();
        itemIngredients.repaint();
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_addToOrderActionPerformed
    
    //HELPER METHOD
    //This method finds where in the entrees array a Food item is stored
    public int findindex(String name)
    {
        int index = 0;
        while(entrees.get(index).GetName() != selection && index < entrees.size())
        {
            index++;
        }
        return index;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToOrder;
    private javax.swing.JList<String> foodList;
    private javax.swing.JTextArea itemDescription;
    private javax.swing.JPanel itemIngredients;
    private javax.swing.JLabel itemName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel orderDetails;
    private javax.swing.JButton removeFromOrder;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField specialRequestTextField;
    // End of variables declaration//GEN-END:variables



    
    

}
