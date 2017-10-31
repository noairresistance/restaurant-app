/*
 * CSCE 4444
 * 
 * 
 */
package Panels;
import Listeners.Navigator;
import javafx.scene.control.MenuButton;
import javax.swing.JLabel;

/*
CREATING A NEW PANEL
1> Navigator.Java class
        + Create new gotTo() method
            - This will create a problem in the App.Java class
2> App.Java class
        + Impliment all abstract methods
        + Add these methods:
            - setContentPane(new PanelObject(this)) 
            - repaint();
            -revalidate();
3> Create new Panel
        + Add Navigator field
        + Add Navigator object to the Panel's constructor argument
        + Set this.navigator = passed constructor argument
4> Add Listener to button in new Panel
        + In ButtonMouseClicked method:
            - Call navigator.goTo method for destination



*/

public class HomeScreen extends javax.swing.JPanel {
    
    private Navigator navigator;

    public HomeScreen(Navigator navigator) {
        initComponents();
        setSize(1024, 768);
        this.navigator = navigator;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuButton1 = new javax.swing.JLabel();
        gamesButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 0));
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));

        menuButton1.setBackground(new java.awt.Color(204, 0, 0));
        menuButton1.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        menuButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuButton1.setText("MENU");
        menuButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        menuButton1.setOpaque(true);
        menuButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButton1MouseClicked(evt);
            }
        });

        gamesButton.setBackground(new java.awt.Color(204, 0, 0));
        gamesButton.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        gamesButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gamesButton.setText("GAMES");
        gamesButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        gamesButton.setOpaque(true);
        gamesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gamesButtonMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PAY");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gamesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gamesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuButton1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_menuButton1MouseClicked
    {//GEN-HEADEREND:event_menuButton1MouseClicked
        // TODO add your handling code here:
        navigator.goToMenu();
    }//GEN-LAST:event_menuButton1MouseClicked

    private void gamesButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_gamesButtonMouseClicked
    {//GEN-HEADEREND:event_gamesButtonMouseClicked
        // TODO add your handling code here:
        navigator.goToGames();
    }//GEN-LAST:event_gamesButtonMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        navigator.goToPay();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gamesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel menuButton1;
    // End of variables declaration//GEN-END:variables
}
