package FlowerApplication;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
import static FlowerApplication.HomeInterface.newOrder;
import classes.Cart;

public class CartInterface extends javax.swing.JFrame {

    public CartInterface() {
        initComponents();

        // To hide the addition confirmation sentence
        successfulAdditionLabel.setVisible(false);
        // Create object of Cart
        Cart c = new Cart(newOrder);
        // Display bill
        bill.setText(c.toString());
        // Display total
        TotalText.setText("    " + String.valueOf(c.calculateTotal()) + " SR");
        TotalTaxText.setText("    " + String.valueOf(c.calculateTax()) + " SR");

        // To change the appearance of the button
        JButton[] btns = {jButton3, jButton2, jButton1, confirmOrder};
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

        list = new java.awt.TextArea();
        jPanel1 = new javax.swing.JPanel();
        pageTitleLabel2 = new javax.swing.JLabel();
        flowerPicBackgroundLabel = new javax.swing.JLabel();
        pageTitleLabel1 = new javax.swing.JLabel();
        productLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        qtyLabel = new javax.swing.JLabel();
        subtotalLabel = new javax.swing.JLabel();
        TotalTaxText = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        TotalText = new javax.swing.JLabel();
        bill = new java.awt.TextArea();
        subtotalLabel3 = new javax.swing.JLabel();
        confirmOrder = new javax.swing.JButton();
        successfulAdditionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 642));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(225, 218, 211));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 524));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pageTitleLabel2.setFont(new java.awt.Font("Broadway", 0, 50)); // NOI18N
        pageTitleLabel2.setForeground(new java.awt.Color(176, 161, 191));
        pageTitleLabel2.setText("Cart ");
        jPanel1.add(pageTitleLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 59));

        flowerPicBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/Picture5.png"))); // NOI18N
        jPanel1.add(flowerPicBackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 118, 364, 490));

        pageTitleLabel1.setFont(new java.awt.Font("Broadway", 0, 50)); // NOI18N
        pageTitleLabel1.setForeground(new java.awt.Color(255, 255, 255));
        pageTitleLabel1.setText("My ");
        pageTitleLabel1.setAlignmentX(0.5F);
        jPanel1.add(pageTitleLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 56));

        productLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(productLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1026, 442, -1, 35));

        priceLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        priceLabel.setText("TOTAL WITH TAX 15%");
        jPanel1.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 152, -1));

        qtyLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(qtyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 146, -1, -1));

        subtotalLabel.setBackground(new java.awt.Color(255, 255, 255));
        subtotalLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        subtotalLabel.setForeground(new java.awt.Color(86, 71, 87));
        subtotalLabel.setText("Your Order Details");
        jPanel1.add(subtotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 153, -1, -1));

        TotalTaxText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(176, 161, 191)));
        jPanel1.add(TotalTaxText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 292, 37));

        menuPanel.setBackground(new java.awt.Color(207, 196, 199));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/icons8-shopping-cart-30.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/icons8-home-30_1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/icons8-sign-out-30.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jPanel1.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 192, 80, 470));

        TotalText.setBackground(new java.awt.Color(255, 255, 255));
        TotalText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(176, 161, 191)));
        jPanel1.add(TotalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 292, 37));

        bill.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 184, 432, 199));

        subtotalLabel3.setBackground(new java.awt.Color(255, 255, 255));
        subtotalLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtotalLabel3.setText("SUBTOTAL");
        jPanel1.add(subtotalLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 76, 23));

        confirmOrder.setForeground(new java.awt.Color(102, 102, 102));
        confirmOrder.setText("Confirm ");
        confirmOrder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        confirmOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmOrderActionPerformed(evt);
            }
        });
        jPanel1.add(confirmOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 111, 37));

        successfulAdditionLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        successfulAdditionLabel.setForeground(new java.awt.Color(114, 173, 85));
        successfulAdditionLabel.setText("Your order has been successfully sent.");
        jPanel1.add(successfulAdditionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1467, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // To navigate to the Home interface
        HomeInterface HomeInterface1 = null;
        if (HomeInterface1 == null) {
            HomeInterface1 = new HomeInterface();
        }
        HomeInterface1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // To navigate to the Login interface
        LoginInterface logintInterface3 = null;
        if (logintInterface3 == null) {
            logintInterface3 = new LoginInterface();
        }
        logintInterface3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void confirmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmOrderActionPerformed

        // Delet all info
        bill.setText(null);
        TotalText.setText(null);
        TotalTaxText.setText(null);
        // Clear all order info from array 
        newOrder.clear();
        successfulAdditionLabel.setVisible(true);
    }//GEN-LAST:event_confirmOrderActionPerformed

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
                new CartInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TotalTaxText;
    private javax.swing.JLabel TotalText;
    private java.awt.TextArea bill;
    private javax.swing.JButton confirmOrder;
    private javax.swing.JLabel flowerPicBackgroundLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextArea list;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel pageTitleLabel1;
    private javax.swing.JLabel pageTitleLabel2;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel productLabel;
    private javax.swing.JLabel qtyLabel;
    private javax.swing.JLabel subtotalLabel;
    private javax.swing.JLabel subtotalLabel3;
    private javax.swing.JLabel successfulAdditionLabel;
    // End of variables declaration//GEN-END:variables
}
