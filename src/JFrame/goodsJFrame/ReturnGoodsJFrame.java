/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame.goodsJFrame;

import Dao.CustomerDao;
import Dao.GoodsDao;
import Dao.SailListDao;
import JFrame.customJFrame.CustomerChooseJFrame;
import Po.Customer;
import Po.Goods;
import Po.SailList;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author 健鑫
 */
public class ReturnGoodsJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ReturnGoodsJFrame
     */
    private Customer customer;
    private Goods goods;
    public ReturnGoodsJFrame() {
        initComponents();
    }
    public ReturnGoodsJFrame(Customer c,Goods g) {
        goods=g;
        customer=c; 
        initComponents();
        jLabel=new javax.swing.JLabel();
        if (customer!=null) {
            jLabel.setText(String.valueOf(customer.getC_ID()));
            jTextField1.setText(customer.getC_Name());
            jTextField2.setText(String.valueOf(customer.getC_Integration()));
            jTextField3.setText(String.valueOf(customer.getC_Cash()));
        }
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
        jLabel2 = new javax.swing.JLabel();
        return_Custom_Button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        return_Goods_Name_Label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        return_Goods_Number_Label = new javax.swing.JLabel();
        return_OK_Button = new javax.swing.JButton();
        return_Cancel_Button = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        return_Goods_Way_Label = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        return_Goods_Price_Label = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        SailGoods_number_TextField = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        remark = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("商品退回");
        setPreferredSize(new java.awt.Dimension(740, 550));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("客户名：");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel2.setText("积分：");

        return_Custom_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        return_Custom_Button.setText("选择客户");
        return_Custom_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        return_Custom_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_Custom_ButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel5.setText("商品名：");

        return_Goods_Name_Label.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        return_Goods_Name_Label.setText(goods.getG_Name());

        jLabel7.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel7.setText("库存量：");

        return_Goods_Number_Label.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        return_Goods_Number_Label.setText(String.valueOf(goods.getG_Inventory())
        );

        return_OK_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        return_OK_Button.setText("确定");
        return_OK_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        return_OK_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_OK_ButtonActionPerformed(evt);
            }
        });

        return_Cancel_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        return_Cancel_Button.setText("取消");
        return_Cancel_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        return_Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_Cancel_ButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel9.setText("余额：");

        jLabel11.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel11.setText("结算方式：");

        return_Goods_Way_Label.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        return_Goods_Way_Label.setText(goods.getG_Pricingway());

        jLabel13.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel13.setText("价格：");

        return_Goods_Price_Label.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        return_Goods_Price_Label.setText(String.valueOf(goods.getG_Price())
        );

        jLabel15.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel15.setText("数量：");

        SailGoods_number_TextField.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        SailGoods_number_TextField.setText("1");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jTextField1.setMinimumSize(new java.awt.Dimension(100, 35));
        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jTextField2.setMinimumSize(new java.awt.Dimension(100, 35));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jTextField3.setMinimumSize(new java.awt.Dimension(100, 35));

        jLabel3.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel3.setText("备注：");

        remark.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        remark.setMinimumSize(new java.awt.Dimension(100, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(return_OK_Button)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel15))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(return_Goods_Number_Label)
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(return_Cancel_Button)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(remark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(return_Goods_Price_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(return_Goods_Name_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(return_Goods_Way_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(230, 230, 230)
                                        .addComponent(return_Custom_Button)))))
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SailGoods_number_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(return_Custom_Button)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(return_Goods_Name_Label)
                    .addComponent(jLabel11)
                    .addComponent(return_Goods_Way_Label))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(return_Goods_Number_Label)
                    .addComponent(jLabel13)
                    .addComponent(return_Goods_Price_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(SailGoods_number_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(remark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(return_OK_Button)
                    .addComponent(return_Cancel_Button))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void return_Custom_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_Custom_ButtonActionPerformed
        jLabel=new javax.swing.JLabel();
        new CustomerChooseJFrame(jLabel,jTextField1).setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_return_Custom_ButtonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
        // TODO add your handling code here:
        Customer customer2=new CustomerDao().find(Integer.valueOf(jLabel.getText()));// TODO add your handling code here:
        jTextField2.setText(String.valueOf(customer2.getC_Integration()));
        jTextField3.setText(String.valueOf(customer2.getC_Cash()));
    }//GEN-LAST:event_jTextField1CaretUpdate

    private void return_Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_Cancel_ButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_return_Cancel_ButtonActionPerformed

    private void return_OK_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_OK_ButtonActionPerformed
        // TODO add your handling code here:
        SailList sailList=new SailList();
        sailList.setS_Number(Float.valueOf(SailGoods_number_TextField.getText()));
        sailList.setS_Buy_Or_Return("退货");
        sailList.setS_Customer_ID(Integer.valueOf(jLabel.getText()));
        sailList.setS_Customer_Name(new CustomerDao().find(Integer.valueOf(jLabel.getText())).getC_Name());
        sailList.setS_Date_Time(new Date());
        sailList.setS_Goods_ID(goods.getG_ID());
        sailList.setS_Goods_Name(goods.getG_Name());
        sailList.setS_Remark(remark.getText());
        new SailListDao().add(sailList);
        goods.setG_Inventory(goods.getG_Inventory()+Float.valueOf(SailGoods_number_TextField.getText()));
        new GoodsDao().update(goods);
        dispose();
        
    }//GEN-LAST:event_return_OK_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnGoodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnGoodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnGoodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnGoodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnGoodsJFrame().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel jLabel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SailGoods_number_TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField remark;
    private javax.swing.JButton return_Cancel_Button;
    private javax.swing.JButton return_Custom_Button;
    private javax.swing.JLabel return_Goods_Name_Label;
    private javax.swing.JLabel return_Goods_Number_Label;
    private javax.swing.JLabel return_Goods_Price_Label;
    private javax.swing.JLabel return_Goods_Way_Label;
    private javax.swing.JButton return_OK_Button;
    // End of variables declaration//GEN-END:variables
}
