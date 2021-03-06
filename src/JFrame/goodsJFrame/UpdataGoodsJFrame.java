/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame.goodsJFrame;

import Dao.GoodsDao;
import Po.Goods;

/**
 *
 * @author 健鑫
 */
public class UpdataGoodsJFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdataGoods
     */
    public UpdataGoodsJFrame() {
        initComponents();
    }
    private Goods goods;
    public UpdataGoodsJFrame(Goods g) {
        goods=g;
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

        jPanel1 = new javax.swing.JPanel();
        g_updata_Name_TextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        g_updata_Inventory_TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        g_updata_PricingWay_ComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        g_updata_Price_TextField = new javax.swing.JTextField();
        g_updata_Brand_TextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        g_updata_Remark_TextArea = new javax.swing.JTextArea();
        updateGoods_OK_Button = new javax.swing.JButton();
        updateGoods_CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("修改商品信息");
        setLocation(new java.awt.Point(400, 200));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(550, 700));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(540, 600));
        jPanel1.setRequestFocusEnabled(false);

        g_updata_Name_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        g_updata_Name_TextField.setText(goods.getG_Name());

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("商品名：");

        g_updata_Inventory_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        g_updata_Inventory_TextField.setText(String.valueOf(goods.getG_Inventory())
        );

        jLabel2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel2.setText("品牌：");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel3.setText("计费方式：");

        g_updata_PricingWay_ComboBox.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        g_updata_PricingWay_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "积分", "现金" }));
        g_updata_PricingWay_ComboBox.setSelectedItem(goods.getG_Pricingway());
        g_updata_PricingWay_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_updata_PricingWay_ComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel4.setText("备注：");

        g_updata_Price_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        g_updata_Price_TextField.setText(String.valueOf(goods.getG_Price())
        );

        g_updata_Brand_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        g_updata_Brand_TextField.setText(goods.getG_Brand());

        jLabel5.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel5.setText("库存量：");

        jLabel6.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel6.setText("价格：");

        g_updata_Remark_TextArea.setColumns(20);
        g_updata_Remark_TextArea.setRows(5);
        g_updata_Remark_TextArea.setText(goods.getG_Remark());
        jScrollPane1.setViewportView(g_updata_Remark_TextArea);

        updateGoods_OK_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateGoods_OK_Button.setText("确定");
        updateGoods_OK_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateGoods_OK_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateGoods_OK_ButtonActionPerformed(evt);
            }
        });

        updateGoods_CancelButton.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateGoods_CancelButton.setText("取消");
        updateGoods_CancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateGoods_CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateGoods_CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(g_updata_Inventory_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(g_updata_Name_TextField)
                    .addComponent(g_updata_PricingWay_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g_updata_Price_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(g_updata_Brand_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updateGoods_OK_Button)
                .addGap(103, 103, 103)
                .addComponent(updateGoods_CancelButton)
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g_updata_Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(g_updata_Brand_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(g_updata_PricingWay_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(g_updata_Inventory_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(g_updata_Price_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateGoods_OK_Button)
                    .addComponent(updateGoods_CancelButton))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void g_updata_PricingWay_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_updata_PricingWay_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g_updata_PricingWay_ComboBoxActionPerformed

    private void updateGoods_CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateGoods_CancelButtonActionPerformed
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_updateGoods_CancelButtonActionPerformed

    private void updateGoods_OK_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateGoods_OK_ButtonActionPerformed
        // TODO add your handling code here:
        goods.setG_Brand(g_updata_Brand_TextField.getText());
        goods.setG_Inventory(Float.valueOf(g_updata_Inventory_TextField.getText()));
        goods.setG_Name(g_updata_Name_TextField.getText());
        goods.setG_Price(Float.valueOf(g_updata_Price_TextField.getText()));
        goods.setG_Pricingway(String.valueOf(g_updata_PricingWay_ComboBox.getSelectedItem()));
        goods.setG_Remark(g_updata_Remark_TextArea.getText());
        new GoodsDao().update(goods);
        dispose();
    }//GEN-LAST:event_updateGoods_OK_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdataGoodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdataGoodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdataGoodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdataGoodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdataGoodsJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField g_updata_Brand_TextField;
    private javax.swing.JTextField g_updata_Inventory_TextField;
    private javax.swing.JTextField g_updata_Name_TextField;
    private javax.swing.JTextField g_updata_Price_TextField;
    private javax.swing.JComboBox<String> g_updata_PricingWay_ComboBox;
    private javax.swing.JTextArea g_updata_Remark_TextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateGoods_CancelButton;
    private javax.swing.JButton updateGoods_OK_Button;
    // End of variables declaration//GEN-END:variables
}
