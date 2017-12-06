/*
 * CSCE 4444
 * 
 * 
 */
package Listeners;

import javax.swing.JPanel;


public interface Navigator {
    
    void goToHomeScreen();
    void goToMenu();
    void goToEntrees();
    void goToDrinks();
    void goToGames();
    void goToPay();
    void goToCard();
    void goToTip();
    void goToSplit();
    void goBack();
    void goToAppetizers();
    void goToDesserts();
    void goToConfirmOrder();
    void goToWelcome();
    void goToRefill();
    JPanel getCurrent();
    void goToCash();
    void goToTogobox();
    void goToSurvey();
    void goToMerch();
    void goToConfirmOrderInfo();
    void goToGameInfo();
    void goToHomeScreenInfo();
    void goToItemInfo();
    void goToMenuInfo();
    void goToPayInfo();
    void goToPaySplitCheck();
    void goToRefillInfo();
    void goToSurveyInfo();

    void goToManager();
    void goToAuthenticate();
    void goToCompedItem();
    void goToCompedItemReport();
    
    
}
