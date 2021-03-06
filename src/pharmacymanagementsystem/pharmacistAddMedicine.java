/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagementsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author chai
 */
public class pharmacistAddMedicine extends javax.swing.JFrame {
    Pharmacist client = new Pharmacist();
    private Medicine medicine;    
    
    /**
     * Creates new form menu
     * @param medicineID
     */
    public pharmacistAddMedicine() {       
        initComponents();

        session_nameLabel.setText(client.getName());
        session_roleLabel.setText(client.getRoleName());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        session_nameLabel = new javax.swing.JLabel();
        session_roleLabel = new javax.swing.JLabel();
        signOutButton = new javax.swing.JButton();
        inventoryButton = new javax.swing.JButton();
        addMedicineButton = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        IDField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        batchIDField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        unitField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        companyField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        doeField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quantityField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        domField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        navInventoryButton = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 153));

        jPanel1.setBackground(new java.awt.Color(143, 252, 220));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setMaximumSize(new java.awt.Dimension(165, 32767));

        session_nameLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        session_nameLabel.setText("Name");

        session_roleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        session_roleLabel.setText("Role");

        signOutButton.setText("Sign Out");
        signOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutButtonActionPerformed(evt);
            }
        });

        inventoryButton.setText("Inventory");
        inventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryButtonActionPerformed(evt);
            }
        });

        addMedicineButton.setBackground(new java.awt.Color(184, 207, 229));
        addMedicineButton.setText("Add New Medicine");
        addMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicineButtonActionPerformed(evt);
            }
        });

        accountButton.setText("Account Settings");
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inventoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMedicineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(session_nameLabel)
                            .addComponent(session_roleLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(session_nameLabel)
                .addGap(1, 1, 1)
                .addComponent(session_roleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accountButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(inventoryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addMedicineButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        header.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        header.setText("Add New Medicine");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Medicine ID");

        jLabel2.setText("Medicine Batch");

        jLabel5.setText("Medicine Name");

        jLabel6.setText("Medicine Unit");

        jLabel7.setText("Company");

        jLabel8.setText("Expiry Date");

        jLabel3.setText("Quantity in Stock");

        jLabel4.setText("Price");

        quantityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityFieldKeyReleased(evt);
            }
        });

        priceField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceFieldKeyReleased(evt);
            }
        });

        jLabel9.setText("Manufacture Date");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("ex: ABC0123");

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("eg: B001");

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("eg: Panadol ActiFast");

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("eg: Capsule, 100ML Liquid, Tablet");

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("(DD/MM/YYYY) ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("(DD/MM/YYYY) ");

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(domField, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(doeField)
                                    .addComponent(companyField)
                                    .addComponent(unitField)
                                    .addComponent(nameField)
                                    .addComponent(batchIDField)
                                    .addComponent(IDField)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priceField, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addComponent(quantityField))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(batchIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(unitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(companyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(doeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(domField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(createButton)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        navInventoryButton.setText("Return to Inventory");
        navInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navInventoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(header)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(navInventoryButton))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(header)
                    .addComponent(navInventoryButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(911, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutButtonActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", "We're sad to see you go...", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            String message = client.logout();

            new login(message).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_signOutButtonActionPerformed

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        new pharmacistAccountSettings().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_accountButtonActionPerformed

    private void priceFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldKeyReleased

    private void quantityFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldKeyReleased

    private void navInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navInventoryButtonActionPerformed
        this.setVisible(false);
        new pharmacistInventory().setVisible(true);
    }//GEN-LAST:event_navInventoryButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        String ID = IDField.getText();
        String batchID = batchIDField.getText();
        String name = nameField.getText();
        String unit = unitField.getText();
        String company = companyField.getText();
        String DOE = doeField.getText();
        String DOM = domField.getText();
        String price = priceField.getText();
        String quantity = quantityField.getText();
        
        if (Validation.isTrimEmpty(ID)) {
            JOptionPane.showMessageDialog(null, "Please enter Medicine ID.", "Opps!", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (client.isMedicineExist(ID)) {
            JOptionPane.showMessageDialog(null, "Medicine ID already exists. Please try another.", "Opps!", JOptionPane.ERROR_MESSAGE);            
            return;
        }
        
        if (Validation.isTrimEmpty(batchID)) {
            JOptionPane.showMessageDialog(null, "Please enter Medicine Batch ID.", "Opps!", JOptionPane.ERROR_MESSAGE);            
            return;
        }
        
        if (Validation.isTrimEmpty(name)) {
            JOptionPane.showMessageDialog(null, "Please enter Medicine Name.", "Opps!", JOptionPane.ERROR_MESSAGE);            
            return;
        }
        
        if (Validation.isTrimEmpty(unit)) {
            JOptionPane.showMessageDialog(null, "Please enter Medicine Unit.", "Opps!", JOptionPane.ERROR_MESSAGE);            
            return;
        }
        
        if (Validation.isTrimEmpty(company)) {
            JOptionPane.showMessageDialog(null, "Please enter Medicine Company.", "Opps!", JOptionPane.ERROR_MESSAGE);            
            return;
        }

        if (Validation.isTrimEmpty(DOE)) {
            JOptionPane.showMessageDialog(null, "Please enter Medicine Expiry Date.", "Opps!", JOptionPane.ERROR_MESSAGE);            
            return;
        } else if (!Validation.isDateFormatted(DOE)) {
            JOptionPane.showMessageDialog(null, "Medicine Expiry Date is invalid. \n\nPlease ensure the following: \n1. Date is valid. \n2. Meets the format (DD/MM/YYYY)", "Opps!", JOptionPane.ERROR_MESSAGE);            
            return;  
        }
        
        if (Validation.isTrimEmpty(DOM)) {
            JOptionPane.showMessageDialog(null, "Please enter Medicine Manufacture Date.", "Opps!", JOptionPane.ERROR_MESSAGE);            
            return;
        } else if (!Validation.isDateFormatted(DOM)) {
            JOptionPane.showMessageDialog(null, "Medicine Manufacture Date is invalid. \n\nPlease ensure the following: \n1. Date is valid. \n2. Meets the format (DD/MM/YYYY)", "Opps!", JOptionPane.ERROR_MESSAGE);            
            return;  
        }
        
         if (Validation.isTrimEmpty(price)) {
            JOptionPane.showMessageDialog(null, "Please enter Medicine Price.", "Opps!", JOptionPane.ERROR_MESSAGE);            
            return;
        } else if (!Validation.isDouble(price)) {
            JOptionPane.showMessageDialog(null, "Please ensure Medicine Price is a number.", "Opps!", JOptionPane.ERROR_MESSAGE);            
            return;  
        }
         
        if (Validation.isTrimEmpty(quantity)) {
            JOptionPane.showMessageDialog(null, "Please enter Medicine Quantity.", "Opps!", JOptionPane.ERROR_MESSAGE);            
            return;
        } else if (!Validation.isInteger(quantity)) {
            JOptionPane.showMessageDialog(null, "Please ensure Medicine Quantity is a whole number.", "Opps!", JOptionPane.ERROR_MESSAGE);            
            return;  
        }
        
        Medicine medicine = new Medicine(ID, batchID, name, unit, company, DOM, DOE, Double.parseDouble(price), Integer.parseInt(quantity));
        boolean result = client.addMedicine(medicine);
        if (result) {
            JOptionPane.showMessageDialog(null, "The medicine has been added to the record.", "Yay!", JOptionPane.INFORMATION_MESSAGE);   
        } else {
            JOptionPane.showMessageDialog(null, "Something went wrong...\nMedicine failed to be added.", "Opps!", JOptionPane.ERROR_MESSAGE);   
        }
        
    }//GEN-LAST:event_createButtonActionPerformed

    private void inventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButtonActionPerformed
        new pharmacistInventory().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inventoryButtonActionPerformed

    private void addMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedicineButtonActionPerformed

    }//GEN-LAST:event_addMedicineButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDField;
    private javax.swing.JButton accountButton;
    private javax.swing.JButton addMedicineButton;
    private javax.swing.JTextField batchIDField;
    private javax.swing.JTextField companyField;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField doeField;
    private javax.swing.JTextField domField;
    private javax.swing.JLabel header;
    private javax.swing.JButton inventoryButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton navInventoryButton;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField quantityField;
    private javax.swing.JLabel session_nameLabel;
    private javax.swing.JLabel session_roleLabel;
    private javax.swing.JButton signOutButton;
    private javax.swing.JTextField unitField;
    // End of variables declaration//GEN-END:variables
}
