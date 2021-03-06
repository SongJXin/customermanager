/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame.insuranceJFrame;

import Dao.CustomerDao;
import Dao.InsuranceDao;
import JFrame.customJFrame.CustomerChooseJFrame;
import Po.Insurance;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 健鑫
 */
public class UpdateInsuranceJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddInsuranceJFrame
     */
    private Insurance insurance;
    public UpdateInsuranceJFrame(Insurance i) {
        insurance=i;
        jLabel=new javax.swing.JLabel();
        jLabel.setText(String.valueOf(i.getI_Custmoer_ID()));
        initComponents();
    }
    public UpdateInsuranceJFrame() {
        initComponents();
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
        updateInsurance_Number_TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        updateInsurance_PlantNumber_TextField = new javax.swing.JTextField();
        addInsurance_ChooseCustomer_Button = new javax.swing.JButton();
        updateInsurance_CustomerName_TextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        updateInsurance_Brand_TextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        updateInsurance_Type_TextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        updateInsurance_Money_TextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        updateInsurance_Tax_TextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        updateInsurance_Sum_TextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        updateInsurance_StartDate_TextField = new javax.swing.JTextField();
        updateInsurance_OK_Button = new javax.swing.JButton();
        updateInsurance_Cancel_Button = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        updateInsurance_Remark_TextArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        updateInsurance_Date_TextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("修改保单");
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("保单号：");

        updateInsurance_Number_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateInsurance_Number_TextField.setText(insurance.getI_Paper_ID());

        jLabel2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel2.setText("车牌号：");

        updateInsurance_PlantNumber_TextField.setEditable(false);
        updateInsurance_PlantNumber_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateInsurance_PlantNumber_TextField.setText(insurance.getI_Car_Number());

        addInsurance_ChooseCustomer_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        addInsurance_ChooseCustomer_Button.setText("选择被保险人");
        addInsurance_ChooseCustomer_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addInsurance_ChooseCustomer_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInsurance_ChooseCustomer_ButtonActionPerformed(evt);
            }
        });

        updateInsurance_CustomerName_TextField.setEditable(false);
        updateInsurance_CustomerName_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateInsurance_CustomerName_TextField.setText(insurance.getI_Customer_Name());

        jLabel3.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel3.setText("保险公司：");

        updateInsurance_Brand_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateInsurance_Brand_TextField.setText(insurance.getI_Brand());

        jLabel4.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel4.setText("保险类型：");

        updateInsurance_Type_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateInsurance_Type_TextField.setText(insurance.getI_Type());

        jLabel5.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel5.setText("保费：");

        updateInsurance_Money_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateInsurance_Money_TextField.setText(String.valueOf(insurance.getI_Money())
        );
        updateInsurance_Money_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                setSum(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel6.setText("税：");

        updateInsurance_Tax_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateInsurance_Tax_TextField.setText(String.valueOf(insurance.getI_Tax())
        );
        updateInsurance_Tax_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                updateInsurance_Tax_TextFieldFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel7.setText("总价：");

        updateInsurance_Sum_TextField.setEditable(false);
        updateInsurance_Sum_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateInsurance_Sum_TextField.setText(String.valueOf(Float.valueOf(updateInsurance_Money_TextField.getText())+Float.valueOf(updateInsurance_Tax_TextField.getText()))
        );

        jLabel8.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel8.setText("保单生效时间：");

        updateInsurance_StartDate_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateInsurance_StartDate_TextField.setText(String.valueOf(insurance.getI_Start_Date())
        );

        updateInsurance_OK_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateInsurance_OK_Button.setText("确定");
        updateInsurance_OK_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateInsurance_OK_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInsurance_OK_ButtonActionPerformed(evt);
            }
        });

        updateInsurance_Cancel_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateInsurance_Cancel_Button.setText("取消");
        updateInsurance_Cancel_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateInsurance_Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInsurance_Cancel_ButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel9.setText("备注");

        updateInsurance_Remark_TextArea.setColumns(20);
        updateInsurance_Remark_TextArea.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        updateInsurance_Remark_TextArea.setRows(5);
        updateInsurance_Remark_TextArea.setText(insurance.getI_Remark());
        jScrollPane1.setViewportView(updateInsurance_Remark_TextArea);

        jLabel10.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel10.setText("投保时间：");

        updateInsurance_Date_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateInsurance_Date_TextField.setText(String.valueOf(insurance.getI_Date())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(addInsurance_ChooseCustomer_Button)
                        .addGap(26, 26, 26)
                        .addComponent(updateInsurance_CustomerName_TextField))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateInsurance_Number_TextField)
                                    .addComponent(updateInsurance_PlantNumber_TextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(updateInsurance_OK_Button))
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateInsurance_StartDate_TextField)
                                    .addComponent(updateInsurance_Brand_TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(updateInsurance_Type_TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(updateInsurance_Sum_TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(updateInsurance_Tax_TextField)
                                    .addComponent(updateInsurance_Money_TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(updateInsurance_Cancel_Button)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(updateInsurance_Date_TextField))))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addInsurance_ChooseCustomer_Button)
                    .addComponent(updateInsurance_CustomerName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(updateInsurance_PlantNumber_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(updateInsurance_Number_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(updateInsurance_Brand_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(updateInsurance_Type_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(updateInsurance_Money_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(updateInsurance_Tax_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(updateInsurance_Sum_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(updateInsurance_StartDate_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(updateInsurance_Date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateInsurance_OK_Button)
                    .addComponent(updateInsurance_Cancel_Button))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setSum(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_setSum
        // TODO add your handling code here:
        updateInsurance_Sum_TextField.setText(String.valueOf(Float.valueOf(updateInsurance_Money_TextField.getText())+Float.valueOf(updateInsurance_Tax_TextField.getText()))
);
    }//GEN-LAST:event_setSum

    private void updateInsurance_Tax_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_updateInsurance_Tax_TextFieldFocusLost
        // TODO add your handling code here:
         updateInsurance_Sum_TextField.setText(String.valueOf(Float.valueOf(updateInsurance_Money_TextField.getText())+Float.valueOf(updateInsurance_Tax_TextField.getText()))
);
    }//GEN-LAST:event_updateInsurance_Tax_TextFieldFocusLost

    private void updateInsurance_Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInsurance_Cancel_ButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_updateInsurance_Cancel_ButtonActionPerformed

    private void addInsurance_ChooseCustomer_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInsurance_ChooseCustomer_ButtonActionPerformed
        // TODO add your handling code here:
        CustomerChooseJFrame customerChooseJFrame=new CustomerChooseJFrame(jLabel,updateInsurance_CustomerName_TextField);
        customerChooseJFrame.setVisible(true);
    }//GEN-LAST:event_addInsurance_ChooseCustomer_ButtonActionPerformed

    private void updateInsurance_OK_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInsurance_OK_ButtonActionPerformed
        // TODO add your handling code here:
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
        java.util.Date date=null;
        insurance.setI_Custmoer_ID(Integer.valueOf(jLabel.getText()));
        insurance.setI_Brand(updateInsurance_Brand_TextField.getText());
        insurance.setI_Customer_Name(updateInsurance_CustomerName_TextField.getText());
        String dstr=updateInsurance_Date_TextField.getText();  
        try { 
            date=sdf.parse(dstr);
        } catch (ParseException ex) {
            Logger.getLogger(UpdateInsuranceJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        insurance.setI_Date(date);
        insurance.setI_Money(Float.valueOf(updateInsurance_Money_TextField.getText()));
        insurance.setI_Paper_ID(updateInsurance_Number_TextField.getText());
        insurance.setI_Remark(updateInsurance_Remark_TextArea.getText());
        dstr=updateInsurance_StartDate_TextField.getText();  
        try { 
            date=sdf.parse(dstr);
        } catch (ParseException ex) {
            Logger.getLogger(UpdateInsuranceJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        insurance.setI_Start_Date(date);
        insurance.setI_Sum(Float.valueOf(updateInsurance_Sum_TextField.getText()));
        insurance.setI_Tax(Float.valueOf(updateInsurance_Tax_TextField.getText()));
        insurance.setI_Type(updateInsurance_Type_TextField.getText());
        new InsuranceDao().update(insurance, new CustomerDao().find(Integer.valueOf(jLabel.getText())));
        dispose();
        
    }//GEN-LAST:event_updateInsurance_OK_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateInsuranceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateInsuranceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateInsuranceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateInsuranceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateInsuranceJFrame().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel jLabel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addInsurance_ChooseCustomer_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField updateInsurance_Brand_TextField;
    private javax.swing.JButton updateInsurance_Cancel_Button;
    private javax.swing.JTextField updateInsurance_CustomerName_TextField;
    private javax.swing.JTextField updateInsurance_Date_TextField;
    private javax.swing.JTextField updateInsurance_Money_TextField;
    private javax.swing.JTextField updateInsurance_Number_TextField;
    private javax.swing.JButton updateInsurance_OK_Button;
    private javax.swing.JTextField updateInsurance_PlantNumber_TextField;
    private javax.swing.JTextArea updateInsurance_Remark_TextArea;
    private javax.swing.JTextField updateInsurance_StartDate_TextField;
    private javax.swing.JTextField updateInsurance_Sum_TextField;
    private javax.swing.JTextField updateInsurance_Tax_TextField;
    private javax.swing.JTextField updateInsurance_Type_TextField;
    // End of variables declaration//GEN-END:variables
}
