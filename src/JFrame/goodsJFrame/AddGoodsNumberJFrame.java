/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame.goodsJFrame;

import Dao.BuyListDao;
import Dao.GoodsDao;
import Po.BuyList;
import Po.Goods;
import java.util.Date;

/**
 *
 * @author 健鑫
 */
public class AddGoodsNumberJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddGoodsNumber
     */
    private Goods goods;
    public AddGoodsNumberJFrame(Goods g) {
        goods=g;
        initComponents();
    }
    public AddGoodsNumberJFrame() {
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

        jLabel5 = new javax.swing.JLabel();
        addGoodsNumber_Name_Label = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        addGoodsNumber_Way_Label = new javax.swing.JLabel();
        addGoodsNumber_Price_Label = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        addGoodsNumber_Number_Label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        addGoodsNumber_number_TextField = new javax.swing.JTextField();
        addGoodsNumber_OK_Button = new javax.swing.JButton();
        addGoodsNumber_Cancel_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        remark = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("进货");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(570, 340));
        setResizable(false);

        jLabel5.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel5.setText("商品名：");

        addGoodsNumber_Name_Label.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        addGoodsNumber_Name_Label.setText(goods.getG_Name());

        jLabel11.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel11.setText("结算方式：");

        addGoodsNumber_Way_Label.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        addGoodsNumber_Way_Label.setText(goods.getG_Pricingway());

        addGoodsNumber_Price_Label.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        addGoodsNumber_Price_Label.setText(String.valueOf(goods.getG_Price())
        );

        jLabel13.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel13.setText("价格：");

        addGoodsNumber_Number_Label.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        addGoodsNumber_Number_Label.setText(String.valueOf(goods.getG_Inventory()));

        jLabel7.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel7.setText("库存量：");

        jLabel15.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel15.setText("数量：");

        addGoodsNumber_number_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        addGoodsNumber_number_TextField.setText("1");

        addGoodsNumber_OK_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        addGoodsNumber_OK_Button.setText("确定");
        addGoodsNumber_OK_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addGoodsNumber_OK_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGoodsNumber_OK_ButtonActionPerformed(evt);
            }
        });

        addGoodsNumber_Cancel_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        addGoodsNumber_Cancel_Button.setText("取消");
        addGoodsNumber_Cancel_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addGoodsNumber_Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGoodsNumber_Cancel_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("备注：");

        remark.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addGoodsNumber_number_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addGoodsNumber_Name_Label)
                            .addComponent(addGoodsNumber_Number_Label)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(addGoodsNumber_OK_Button)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(67, 67, 67)
                                .addComponent(addGoodsNumber_Price_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addGoodsNumber_Cancel_Button)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addComponent(addGoodsNumber_Way_Label)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(remark, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addGoodsNumber_Way_Label)
                    .addComponent(jLabel11)
                    .addComponent(addGoodsNumber_Name_Label)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addGoodsNumber_Price_Label)
                    .addComponent(jLabel13)
                    .addComponent(addGoodsNumber_Number_Label)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(remark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addGoodsNumber_number_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addGoodsNumber_Cancel_Button)
                    .addComponent(addGoodsNumber_OK_Button))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addGoodsNumber_Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGoodsNumber_Cancel_ButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_addGoodsNumber_Cancel_ButtonActionPerformed

    private void addGoodsNumber_OK_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGoodsNumber_OK_ButtonActionPerformed
        // TODO add your handling code here:
        BuyList buyList=new BuyList();
        buyList.setB_Date_Time(new Date());
        buyList.setB_Goods_Brand(goods.getG_Brand());
        buyList.setB_Goods_ID(goods.getG_ID());
        buyList.setB_Goods_Name(goods.getG_Name());
        buyList.setB_Number(Float.valueOf(addGoodsNumber_number_TextField.getText()));
        buyList.setB_Remark(remark.getText());
        new BuyListDao().add(buyList);
        goods.setG_Inventory(goods.getG_Inventory()+Float.valueOf(addGoodsNumber_number_TextField.getText()));
        new GoodsDao().update(goods);
        dispose();
                
    }//GEN-LAST:event_addGoodsNumber_OK_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddGoodsNumberJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddGoodsNumberJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddGoodsNumberJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddGoodsNumberJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGoodsNumberJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGoodsNumber_Cancel_Button;
    private javax.swing.JLabel addGoodsNumber_Name_Label;
    private javax.swing.JLabel addGoodsNumber_Number_Label;
    private javax.swing.JButton addGoodsNumber_OK_Button;
    private javax.swing.JLabel addGoodsNumber_Price_Label;
    private javax.swing.JLabel addGoodsNumber_Way_Label;
    private javax.swing.JTextField addGoodsNumber_number_TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField remark;
    // End of variables declaration//GEN-END:variables
}
