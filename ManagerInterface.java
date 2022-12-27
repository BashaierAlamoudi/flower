package FlowerApplication;

import classes.Admin;
import classes.Flower;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

public class ManagerInterface extends javax.swing.JFrame {

    public ManagerInterface() {
        initComponents();

        // To hide the addition confirmation sentence
        successfulAdditionLabel.setVisible(false);

        // To change the appearance of the button
        JButton[] btns = {signOutButton, doneButton};
        for (JButton btn : btns) {
            btn.setBackground(new Color(207, 196, 199));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent me) {
                }

                @Override
                public void mousePressed(MouseEvent me) {
                }

                @Override
                public void mouseReleased(MouseEvent me) {

                }

                @Override
                public void mouseEntered(MouseEvent me) {
                    btn.setBackground(new Color(209, 190, 190));
                }

                @Override
                public void mouseExited(MouseEvent me) {
                    btn.setBackground(new Color(207, 196, 199));
                }
            });
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pageTitleLabel2 = new javax.swing.JLabel();
        flowerPicBackgroundLabel = new javax.swing.JLabel();
        pageTitleLabel1 = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        signOutButton = new javax.swing.JButton();
        addFlowerPanel = new javax.swing.JPanel();
        flowerNameTextField = new javax.swing.JTextField();
        flowerQTYTextField = new javax.swing.JTextField();
        flowerPriceTextField = new javax.swing.JTextField();
        flowerPriceLabel = new javax.swing.JLabel();
        flowerQTYLabel = new javax.swing.JLabel();
        flowerNameLabel = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();
        successfulAdditionLabel = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 642));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(225, 218, 211));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 524));

        pageTitleLabel2.setFont(new java.awt.Font("Broadway", 0, 55)); // NOI18N
        pageTitleLabel2.setForeground(new java.awt.Color(176, 161, 191));
        pageTitleLabel2.setText(" Page");

        flowerPicBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/Picture5.png"))); // NOI18N

        pageTitleLabel1.setFont(new java.awt.Font("Broadway", 0, 55)); // NOI18N
        pageTitleLabel1.setForeground(new java.awt.Color(255, 255, 255));
        pageTitleLabel1.setText("Manager");

        menuPanel.setBackground(new java.awt.Color(207, 196, 199));

        signOutButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signOutButton.setForeground(new java.awt.Color(255, 255, 255));
        signOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/icons8-sign-out-30.png"))); // NOI18N
        signOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(signOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addFlowerPanel.setBackground(new java.awt.Color(207, 196, 199));
        addFlowerPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 196, 199)));
        addFlowerPanel.setPreferredSize(new java.awt.Dimension(185, 283));

        flowerNameTextField.setBackground(new java.awt.Color(240, 240, 240));
        flowerNameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 240, 240)));
        flowerNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flowerNameTextFieldMouseClicked(evt);
            }
        });
        flowerNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flowerNameTextFieldActionPerformed(evt);
            }
        });

        flowerQTYTextField.setBackground(new java.awt.Color(240, 240, 240));
        flowerQTYTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 240, 240)));
        flowerQTYTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flowerQTYTextFieldMouseClicked(evt);
            }
        });
        flowerQTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flowerQTYTextFieldActionPerformed(evt);
            }
        });

        flowerPriceTextField.setBackground(new java.awt.Color(240, 240, 240));
        flowerPriceTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 240, 240)));
        flowerPriceTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flowerPriceTextFieldMouseClicked(evt);
            }
        });
        flowerPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flowerPriceTextFieldActionPerformed(evt);
            }
        });

        flowerPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        flowerPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        flowerPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        flowerPriceLabel.setText("FLOWER PRICE");

        flowerQTYLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        flowerQTYLabel.setForeground(new java.awt.Color(255, 255, 255));
        flowerQTYLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        flowerQTYLabel.setText("FLOWER QUANTITY");

        flowerNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        flowerNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        flowerNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        flowerNameLabel.setText(" FLOWER NAME");

        doneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/icons8-checkmark-45.png"))); // NOI18N
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        successfulAdditionLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        successfulAdditionLabel.setForeground(new java.awt.Color(114, 173, 85));
        successfulAdditionLabel.setText("The flower has been added successfully");

        javax.swing.GroupLayout addFlowerPanelLayout = new javax.swing.GroupLayout(addFlowerPanel);
        addFlowerPanel.setLayout(addFlowerPanelLayout);
        addFlowerPanelLayout.setHorizontalGroup(
            addFlowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFlowerPanelLayout.createSequentialGroup()
                .addGroup(addFlowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addFlowerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(successfulAdditionLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addFlowerPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(addFlowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flowerQTYLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addFlowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(flowerQTYTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                .addComponent(flowerNameTextField)
                                .addComponent(flowerPriceTextField))
                            .addComponent(flowerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(flowerPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addFlowerPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doneButton)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        addFlowerPanelLayout.setVerticalGroup(
            addFlowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFlowerPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(flowerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flowerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(flowerQTYLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(flowerQTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(flowerPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(flowerPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(successfulAdditionLabel)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        subtitleLabel.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        subtitleLabel.setForeground(new java.awt.Color(102, 102, 102));
        subtitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel.setText("ADD FLOWER TO THE STORE ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pageTitleLabel1)
                .addContainerGap(861, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(flowerPicBackgroundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(pageTitleLabel2)
                        .addGap(253, 253, 253)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addFlowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(subtitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                .addContainerGap(335, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pageTitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pageTitleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtitleLabel))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(flowerPicBackgroundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 18, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addFlowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1143, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void signOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutButtonActionPerformed

        // To navigate to the Login interface
        LoginInterface logintInterface4 = null;
        if (logintInterface4 == null) {
            logintInterface4 = new LoginInterface();
        }
        logintInterface4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signOutButtonActionPerformed


    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed

        // Read flower type from admin
        String flowerType = flowerNameTextField.getText();
        // Read number of flower from admin
        int flowerQuantity = Integer.parseInt(flowerQTYTextField.getText());
        // Read the price of one flower from admin
        double flowerPrice = Double.parseDouble(flowerPriceTextField.getText());
        // Create the new flower 
        Flower flower = new Flower(flowerType, flowerQuantity, flowerPrice);
        // Add flower to the store
        Admin.addFlower(flower);
        successfulAdditionLabel.setVisible(true);
        flowerNameTextField.setText(null);
        flowerQTYTextField.setText(null);
        flowerPriceTextField.setText(null);
    }//GEN-LAST:event_doneButtonActionPerformed

    private void flowerNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flowerNameTextFieldActionPerformed
    
    }//GEN-LAST:event_flowerNameTextFieldActionPerformed

    private void flowerQTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flowerQTYTextFieldActionPerformed
    
    }//GEN-LAST:event_flowerQTYTextFieldActionPerformed

    private void flowerPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flowerPriceTextFieldActionPerformed
         
    }//GEN-LAST:event_flowerPriceTextFieldActionPerformed

    private void flowerNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flowerNameTextFieldMouseClicked
          successfulAdditionLabel.setVisible(false);
    }//GEN-LAST:event_flowerNameTextFieldMouseClicked

    private void flowerQTYTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flowerQTYTextFieldMouseClicked
         successfulAdditionLabel.setVisible(false);
    }//GEN-LAST:event_flowerQTYTextFieldMouseClicked

    private void flowerPriceTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flowerPriceTextFieldMouseClicked
         successfulAdditionLabel.setVisible(false);
    }//GEN-LAST:event_flowerPriceTextFieldMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addFlowerPanel;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel flowerNameLabel;
    private javax.swing.JTextField flowerNameTextField;
    private javax.swing.JLabel flowerPicBackgroundLabel;
    private javax.swing.JLabel flowerPriceLabel;
    private javax.swing.JTextField flowerPriceTextField;
    private javax.swing.JLabel flowerQTYLabel;
    private javax.swing.JTextField flowerQTYTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel pageTitleLabel1;
    private javax.swing.JLabel pageTitleLabel2;
    private javax.swing.JButton signOutButton;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel successfulAdditionLabel;
    // End of variables declaration//GEN-END:variables
}
