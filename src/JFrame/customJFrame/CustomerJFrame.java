/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame.customJFrame;

import Dao.CustomerDao;
import Dao.VehicleDao;
import JFrame.carJFrame.DetaliInformationCarJFrame1;
import JFrame.goodsJFrame.GoodsJFrame;
import JFrame.help.AboutJFrame;
import customermanager.WelcomeJFrame;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.JTableExportToExcel;

/**
 *
 * @author 健鑫
 */
public class CustomerJFrame extends javax.swing.JFrame {

    /**
     * Creates new form customer
     */
    public CustomerJFrame() {
        initComponents();

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        //声明list
        ArrayList list = new ArrayList();
        //声明map
        Map rowDataMap = new HashMap();
        //查询
        list = new CustomerDao().list("", "", "", "");
        //没有查到结果时报错
        if (list == null) {
            JOptionPane.showMessageDialog(null, "没有找到查询结果", "查询失败", JOptionPane.ERROR_MESSAGE);
        } else {
            //计数器，记录第几行
            int i = 0;
            //迭代器
            Iterator it1 = list.iterator();
            //重置table内容，避免第二次查询结果少于第一次时，第一次的内容依然存在
            tableModel.setRowCount(list.size());
            //遍历
            while (it1.hasNext()) {
                rowDataMap = (Map) it1.next();
                //显示
//`c_name`, `c_card_number`, `c_integration`, `c_tell`, `c_sex`, `c_address`, `c_cash`, `c_remark`
                tableModel.setValueAt(rowDataMap.get("c_id"), i, 0);
                tableModel.setValueAt(rowDataMap.get("c_name"), i, 1);
                tableModel.setValueAt(rowDataMap.get("c_card_number"), i, 2);
                tableModel.setValueAt(rowDataMap.get("c_tell"), i, 3);
                tableModel.setValueAt(rowDataMap.get("c_sex"), i, 4);
                tableModel.setValueAt(rowDataMap.get("c_integration"), i, 5);
                tableModel.setValueAt(rowDataMap.get("c_cash"), i, 6);
                tableModel.setValueAt(rowDataMap.get("c_address"), i, 7);
                tableModel.setValueAt(rowDataMap.get("c_remark"), i, 8);

                i++;
            }
            //显示条目数量
            customer_Number.setText(String.valueOf(i));
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

        jPanel3 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        addCustomer_Button = new javax.swing.JButton();
        deleteCustomer_Button = new javax.swing.JButton();
        updateCustomer_Button = new javax.swing.JButton();
        customerDetailedInformation_Button = new javax.swing.JButton();
        findCustomer_Button = new javax.swing.JButton();
        buyGoods_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        customer_Number = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_Menu = new javax.swing.JMenu();
        exmportOut_MenuItem = new javax.swing.JMenuItem();
        help_Menu = new javax.swing.JMenu();
        useHelp_MenuItem = new javax.swing.JMenuItem();
        about_MenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("客户列表");
        setLocation(new java.awt.Point(400, 200));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(870, 640));
        setResizable(false);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        addCustomer_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        addCustomer_Button.setText("添加客户");
        addCustomer_Button.setActionCommand("添加");
        addCustomer_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCustomer_Button.setFocusable(false);
        addCustomer_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addCustomer_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addCustomer_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomer_ButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(addCustomer_Button);

        deleteCustomer_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        deleteCustomer_Button.setText("删除客户");
        deleteCustomer_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteCustomer_Button.setFocusable(false);
        deleteCustomer_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteCustomer_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteCustomer_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomer_ButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(deleteCustomer_Button);

        updateCustomer_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateCustomer_Button.setText("修改信息");
        updateCustomer_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateCustomer_Button.setFocusable(false);
        updateCustomer_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateCustomer_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        updateCustomer_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomer_ButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(updateCustomer_Button);

        customerDetailedInformation_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        customerDetailedInformation_Button.setText("查看详细信息");
        customerDetailedInformation_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerDetailedInformation_Button.setFocusable(false);
        customerDetailedInformation_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        customerDetailedInformation_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        customerDetailedInformation_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerDetailedInformation_ButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(customerDetailedInformation_Button);

        findCustomer_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        findCustomer_Button.setText("查找");
        findCustomer_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        findCustomer_Button.setFocusable(false);
        findCustomer_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        findCustomer_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        findCustomer_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCustomer_ButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(findCustomer_Button);

        buyGoods_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        buyGoods_Button.setText("购买商品");
        buyGoods_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyGoods_Button.setFocusable(false);
        buyGoods_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buyGoods_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buyGoods_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyGoods_ButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(buyGoods_Button);

        jLabel1.setText("共");

        customer_Number.setText("99");

        jLabel3.setText("条");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 601, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customer_Number)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(customer_Number)
                        .addComponent(jLabel3))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "姓名", "身份证号", "手机号", "性别", "积分", "现金", "地址", "备注"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(24);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(2);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(4);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(4);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(4);
        }

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        file_Menu.setText("文件");
        file_Menu.setBorderPainted(true);
        file_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        file_Menu.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        file_Menu.setIconTextGap(16);

        exmportOut_MenuItem.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        exmportOut_MenuItem.setText("导出");
        exmportOut_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exmportOut_MenuItemActionPerformed(evt);
            }
        });
        file_Menu.add(exmportOut_MenuItem);

        jMenuBar1.add(file_Menu);

        help_Menu.setText("帮助");
        help_Menu.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        help_Menu.setIconTextGap(16);

        useHelp_MenuItem.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        useHelp_MenuItem.setText("使用说明");
        useHelp_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useHelp_MenuItemActionPerformed(evt);
            }
        });
        help_Menu.add(useHelp_MenuItem);

        about_MenuItem.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        about_MenuItem.setText("关于");
        about_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_MenuItemActionPerformed(evt);
            }
        });
        help_Menu.add(about_MenuItem);

        jMenuBar1.add(help_Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void useHelp_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useHelp_MenuItemActionPerformed
        try {
            java.awt.Desktop.getDesktop().open(new File("帮助文档.CHM"));
        } catch (IOException ex) {
            Logger.getLogger(WelcomeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_useHelp_MenuItemActionPerformed

    private void findCustomer_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCustomer_ButtonActionPerformed
        // TODO add your handling code here:
        new FindCustomerJFrame(jTable1, customer_Number).setVisible(true);
    }//GEN-LAST:event_findCustomer_ButtonActionPerformed

    private void customerDetailedInformation_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerDetailedInformation_ButtonActionPerformed
        int row = jTable1.getSelectedRow();
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择条目</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
        } else {
            if (null == jTable1.getValueAt(row, 0)) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择的条目无内容</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
            } else {
                new CustomerDetailInformationJFrame(new CustomerDao().find(Integer.valueOf(String.valueOf(jTable1.getValueAt(row, 0))))).setVisible(true);
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_customerDetailedInformation_ButtonActionPerformed

    private void deleteCustomer_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomer_ButtonActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择条目</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
        } else {
            if (null == jTable1.getValueAt(row, 0)) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择的条目无内容</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
            } else {
                new DeleteCustomerJFrame(new CustomerDao().find(Integer.valueOf(String.valueOf(jTable1.getValueAt(row, 0))))).setVisible(true);
            }
        }
    }//GEN-LAST:event_deleteCustomer_ButtonActionPerformed

    private void buyGoods_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyGoods_ButtonActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择条目</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
        } else {
            if (null == jTable1.getValueAt(row, 0)) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择的条目无内容</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
            } else {
                new GoodsJFrame(new CustomerDao().find(Integer.valueOf(String.valueOf(jTable1.getValueAt(row, 0))))).setVisible(true);
            }
        }

    }//GEN-LAST:event_buyGoods_ButtonActionPerformed

    private void updateCustomer_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomer_ButtonActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择条目</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
        } else {
            if (null == jTable1.getValueAt(row, 0)) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择的条目无内容</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
            } else {
                new UpdateCustomerJFrame(new CustomerDao().find(Integer.valueOf(String.valueOf(jTable1.getValueAt(row, 0))))).setVisible(true);
            }
        }
    }//GEN-LAST:event_updateCustomer_ButtonActionPerformed

    private void addCustomer_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomer_ButtonActionPerformed
        // TODO add your handling code here:
        new AddCustomerJFrame().setVisible(true);
    }//GEN-LAST:event_addCustomer_ButtonActionPerformed

    private void exmportOut_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exmportOut_MenuItemActionPerformed
        // TODO add your handling code here:
        new JTableExportToExcel().chooseFile(jTable1, "//客户列表.xls");
    }//GEN-LAST:event_exmportOut_MenuItemActionPerformed

    private void about_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_MenuItemActionPerformed
        // TODO add your handling code here:
        new AboutJFrame().setVisible(true);
    }//GEN-LAST:event_about_MenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about_MenuItem;
    private javax.swing.JButton addCustomer_Button;
    private javax.swing.JButton buyGoods_Button;
    private javax.swing.JButton customerDetailedInformation_Button;
    private javax.swing.JLabel customer_Number;
    private javax.swing.JButton deleteCustomer_Button;
    private javax.swing.JMenuItem exmportOut_MenuItem;
    private javax.swing.JMenu file_Menu;
    private javax.swing.JButton findCustomer_Button;
    private javax.swing.JMenu help_Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton updateCustomer_Button;
    private javax.swing.JMenuItem useHelp_MenuItem;
    // End of variables declaration//GEN-END:variables
}
