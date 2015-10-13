/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaceAdministrativeRole;

import Business.StoreDirectory;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    private StoreDirectory storeDirectory;
    
    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public AdminWorkAreaJPanel(JPanel userProcessContainer,SupplierDirectory supplierDirectory, StoreDirectory storeDirectory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.supplierDirectory=supplierDirectory;
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
        ManageSupplierJButton = new javax.swing.JButton();
        ManageStoreJButton = new javax.swing.JButton();
        BrowseJButton = new javax.swing.JButton();

        jLabel1.setText("Admin Work Area");

        ManageSupplierJButton.setText("Manage Suppliers");
        ManageSupplierJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageSupplierJButtonActionPerformed(evt);
            }
        });

        ManageStoreJButton.setText("Manage Stores");
        ManageStoreJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageStoreJButtonActionPerformed(evt);
            }
        });

        BrowseJButton.setText("Manage Drug Catalog");
        BrowseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ManageStoreJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageSupplierJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BrowseJButton))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(ManageSupplierJButton)
                .addGap(29, 29, 29)
                .addComponent(ManageStoreJButton)
                .addGap(29, 29, 29)
                .addComponent(BrowseJButton)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ManageSupplierJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageSupplierJButtonActionPerformed
        // TODO add your handling code here:
    ManageSuppliers ms = new ManageSuppliers(userProcessContainer, supplierDirectory);
    userProcessContainer.add("ManageSuppliers", ms);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageSupplierJButtonActionPerformed

    private void BrowseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseJButtonActionPerformed
        // TODO add your handling code here:
      BrowseInventory bi = new BrowseInventory(userProcessContainer, supplierDirectory, storeDirectory);
    userProcessContainer.add("BrowseInventoryJPanel", bi);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_BrowseJButtonActionPerformed

    private void ManageStoreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageStoreJButtonActionPerformed
        // TODO add your handling code here:
   
    ManageStores mss = new ManageStores(userProcessContainer, storeDirectory);
    userProcessContainer.add("ManageStores", mss);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageStoreJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseJButton;
    private javax.swing.JButton ManageStoreJButton;
    private javax.swing.JButton ManageSupplierJButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
