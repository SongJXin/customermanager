/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame.insuranceJFrame;

import Dao.InsuranceDao;
import JFrame.goodsJFrame.*;
import Po.Insurance;

/**
 *
 * @author 健鑫
 */
public class DeleteInsuranceJFrame extends javax.swing.JFrame {

    /**
     * Creates new form deleteGoods
     */
    public DeleteInsuranceJFrame() {
        initComponents();
    }
    private Insurance insurance;
    public DeleteInsuranceJFrame(Insurance i) {
        insurance=i;
        initComponents();
        jLabel1.setText(jLabel1.getText()+insurance.getI_Car_Number());
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
        deleteInsurance_OKButton = new javax.swing.JButton();
        deleteInsurance_CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("删除商品");
        setLocation(new java.awt.Point(400, 200));
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("确定要删除保单");

        deleteInsurance_OKButton.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        deleteInsurance_OKButton.setText("确定");
        deleteInsurance_OKButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteInsurance_OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInsurance_OKButtonActionPerformed(evt);
            }
        });

        deleteInsurance_CancelButton.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        deleteInsurance_CancelButton.setText("取消");
        deleteInsurance_CancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteInsurance_CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInsurance_CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(deleteInsurance_OKButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteInsurance_CancelButton)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteInsurance_OKButton)
                    .addComponent(deleteInsurance_CancelButton))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteInsurance_OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInsurance_OKButtonActionPerformed
        // TODO add your handling code here:
        new InsuranceDao().delete(insurance);
        dispose();
    }//GEN-LAST:event_deleteInsurance_OKButtonActionPerformed

    private void deleteInsurance_CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInsurance_CancelButtonActionPerformed
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_deleteInsurance_CancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteInsuranceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteInsuranceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteInsuranceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteInsuranceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteInsuranceJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteInsurance_CancelButton;
    private javax.swing.JButton deleteInsurance_OKButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
