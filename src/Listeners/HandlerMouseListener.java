/*
 * CSCE 4444
 * 
 * 
 */
package Listeners;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class HandlerMouseListener extends MouseAdapter{
    
    HashMap<JLabel, JPanel> componentMap;
    JFrame frame;
    JLabel labelClicked;
    JPanel currentPanel;
    
    
    public HandlerMouseListener(JFrame frame, JPanel panel, HashMap map) {
            
        this.frame = frame;
        currentPanel = panel;
        componentMap = map;
    }
    
    public void mouseClicked(MouseEvent e)
    {
        labelClicked = (JLabel)e.getSource();
        frame.remove(currentPanel);
        currentPanel = componentMap.get(labelClicked);
        frame.setContentPane(currentPanel);
        frame.repaint();
        frame.validate();
        
        
        
    }
    
    public void setCurrentPanel(JPanel panel){
        currentPanel = panel;
    }
    public JPanel getCurrentPanel(){
        return currentPanel;
    }
    
}
