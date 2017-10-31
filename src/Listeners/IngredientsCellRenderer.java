/*
 * CSCE 4444
 * 
 * 
 */
package Listeners;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;


//Requires IngredientsListener to be passes into it
//Custom cell render - it renders components for a jlist
public class IngredientsCellRenderer implements ListCellRenderer<String>
{
    private IngredientsListener ingredientsListener;
    
    
    public IngredientsCellRenderer(IngredientsListener ingredientsListener)
    {
        this.ingredientsListener = ingredientsListener;
    }

    //Returns the Componet (checkbox) that goes in the cell
    //Arguments:
    //list: the JList the cell is being rendered in
    //String: the value (ingredient)
    //Index: The index from the Ingredients list array
    //isSelected: yeah
    @Override
    public Component getListCellRendererComponent(JList<? extends String> list, String ingredient, int index, boolean isSelected, boolean cellHasFocus)
    {
        
        //Creates a check box with the ingredients name
        JCheckBox checkBox = new JCheckBox(ingredient);
        
        //Set if the checkbox is selected
        checkBox.setSelected(ingredientsListener.hasIngredient(ingredient));
        
        
        //Listens for mouse click on the newly created checkbox
        //When clicked the checkbox is toggling based on its current state
        //The ingredient will be either added depending on the box's state
        checkBox.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                checkBox.setSelected(!checkBox.isSelected());
                if(checkBox.isSelected())
                {
                    ingredientsListener.addIngredient(ingredient);
                }
                else
                {
                    ingredientsListener.removeIngredient(ingredient);
                }
            }

            
        });
        
        
        
        
        return checkBox;
    }
    
}
