/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzeePackage;

/**
 *
 * @author go452180
 */
public class yahtzeeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form yahtzeeJFrame
     */
    public yahtzeeJFrame() {
        initComponents();
    }
    int diceNum = (int) Math.round(Math.random() * 5 + 1), diceNum2 = (int) Math.round(Math.random() * 5 + 1), diceNum3 = (int) Math.round(Math.random() * 5 + 1), diceNum4 = (int) Math.round(Math.random() * 5 + 1), diceNum5 = (int) Math.round(Math.random() * 5 + 1);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dice1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dice1Hold = new javax.swing.JButton();
        dice2 = new javax.swing.JLabel();
        dice2Hold = new javax.swing.JButton();
        dice3 = new javax.swing.JLabel();
        dice3Hold = new javax.swing.JButton();
        dice4Hold = new javax.swing.JButton();
        dice4 = new javax.swing.JLabel();
        dice5Hold = new javax.swing.JButton();
        dice5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Yahtzee");

        dice1.setText("0");

        jButton1.setText("Roll!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dice1Hold.setText("Hold");
        dice1Hold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dice1HoldActionPerformed(evt);
            }
        });

        dice2.setText("0");

        dice2Hold.setText("Hold");
        dice2Hold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dice2HoldActionPerformed(evt);
            }
        });

        dice3.setText("0");

        dice3Hold.setText("Hold");

        dice4Hold.setText("Hold");
        dice4Hold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dice4HoldActionPerformed(evt);
            }
        });

        dice4.setText("0");

        dice5Hold.setText("Hold");

        dice5.setText("0");

        jButton7.setText("Ones");

        jButton2.setText("Twos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(dice1)
                .addGap(53, 53, 53)
                .addComponent(dice2)
                .addGap(54, 54, 54)
                .addComponent(dice3)
                .addGap(50, 50, 50)
                .addComponent(dice4)
                .addGap(58, 58, 58)
                .addComponent(dice5)
                .addGap(98, 98, 98))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(dice1Hold)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dice2Hold)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dice3Hold)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dice4Hold)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dice5Hold))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dice1)
                    .addComponent(dice2)
                    .addComponent(dice3)
                    .addComponent(dice4)
                    .addComponent(dice5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dice1Hold)
                    .addComponent(dice2Hold)
                    .addComponent(dice3Hold)
                    .addComponent(dice4Hold)
                    .addComponent(dice5Hold))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dice2HoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dice2HoldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dice2HoldActionPerformed

    private void dice4HoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dice4HoldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dice4HoldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dice1.setText(Integer.toString(diceNum));
        dice2.setText(Integer.toString(diceNum2));
        dice3.setText(Integer.toString(diceNum3));
        dice4.setText(Integer.toString(diceNum4));
        dice5.setText(Integer.toString(diceNum5));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dice1HoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dice1HoldActionPerformed
        
    }//GEN-LAST:event_dice1HoldActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(yahtzeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yahtzeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yahtzeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yahtzeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yahtzeeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dice1;
    private javax.swing.JButton dice1Hold;
    private javax.swing.JLabel dice2;
    private javax.swing.JButton dice2Hold;
    private javax.swing.JLabel dice3;
    private javax.swing.JButton dice3Hold;
    private javax.swing.JLabel dice4;
    private javax.swing.JButton dice4Hold;
    private javax.swing.JLabel dice5;
    private javax.swing.JButton dice5Hold;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
