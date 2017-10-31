/*
 * CSCE 4444
 * 
 * 
 */
package Listeners;

//Allows the checkboxes to communicate with the entrees component
public interface IngredientsListener
{
    void addIngredient(String ingredient);
    void removeIngredient(String ingredient);
    boolean hasIngredient(String ingredient);
    
}
