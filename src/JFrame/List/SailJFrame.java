/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame.List;

import Dao.SailListDao;
import JFrame.help.AboutJFrame;
import Po.SailList;
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
public class SailJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SailJFrame
     */
    public SailJFrame() {
        initComponents();

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        //声明list
        ArrayList list = new ArrayList();
        //声明map
        Map rowDataMap = new HashMap();
        //声明dao
        SailListDao sailListDao = new SailListDao();
        //获得查询结果
        //System.out.println("JFrame.List.BuyFindJFrame.buyFind_OK_ButtonActionPerformed()");
        list = sailListDao.list("", "", "", "", "");
        //判断空值
        if (list == null) {
            JOptionPane.showMessageDialog(null, "没有找到查询结果", "查询失败", JOptionPane.ERROR_MESSAGE);
        } else {
            //计数，第几行显示
            int i = 0;
            //迭代器
            Iterator it1 = list.iterator();
            //重置table内容，避免第二次查询结果少于第一次时，第一次的内容依然存在
            tableModel.setRowCount(list.size());
            //遍历
            while (it1.hasNext()) {

                rowDataMap = (Map) it1.next();
                //  s_customer_id`, `s_goods_id`, `s_buy_or_return`, `s_data_time`, `s_number`,
//`s_remark`, `s_customer_name`, `s_goods_name`
                //显示
                tableModel.setValueAt(rowDataMap.get("s_id"), i, 0);
                //tableModel.setValueAt(1, i,0);
                tableModel.setValueAt(rowDataMap.get("s_goods_name"), i, 1);
                tableModel.setValueAt(rowDataMap.get("s_customer_name"), i, 2);
                tableModel.setValueAt(rowDataMap.get("s_buy_or_return"), i, 3);
                tableModel.setValueAt(rowDataMap.get("s_data_time"), i, 4);
                tableModel.setValueAt(rowDataMap.get("s_number"), i, 5);
                tableModel.setValueAt(rowDataMap.get("s_remark"), i, 6);

                i++;
            }
            //显示条目数量
            sail_Number.setText(String.valueOf(i));
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

        jToolBar3 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        sail_Number = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_Menu = new javax.swing.JMenu();
        exmportOut_MenuItem = new javax.swing.JMenuItem();
        help_Menu = new javax.swing.JMenu();
        useHelp_MenuItem = new javax.swing.JMenuItem();
        about_MenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("销售记录");
        setLocationByPlatform(true);

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        jButton1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jButton1.setText("查看详细信息");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton1);

        jButton2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jButton2.setText("查找");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton2);

        jTable1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "商品名", "客户名", "退换or购买", "时间", "数量", "备注"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(24);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(2);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(8);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(4);
        }

        jLabel1.setText("共");

        sail_Number.setText("99");

        jLabel3.setText("条");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sail_Number)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(sail_Number)
                        .addComponent(jLabel3))
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void useHelp_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useHelp_MenuItemActionPerformed
        // TODO add your handling code here:
        try {
            java.awt.Desktop.getDesktop().open(new File("帮助文档.CHM"));
        } catch (IOException ex) {
            Logger.getLogger(WelcomeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_useHelp_MenuItemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new SailFindJFrame(jTable1, sail_Number).setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SailList sailList = new SailList();

        int row = jTable1.getSelectedRow();
        SailListDao sailListDao = new SailListDao();
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择查看的详细信息的条目</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
        } else {
            if (null == jTable1.getValueAt(row, 0)) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择的条目无内容</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
            } else {
                sailList = sailListDao.find(Integer.valueOf(String.valueOf(jTable1.getValueAt(row, 0))));
                new SailDetailInformationJFrame(sailList).setVisible(true);
            }
        }
        // TODO add your handling code here:

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exmportOut_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exmportOut_MenuItemActionPerformed
        // TODO add your handling code here:
        new JTableExportToExcel().chooseFile(jTable1, "//销售记录.xls");
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
            java.util.logging.Logger.getLogger(SailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SailJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about_MenuItem;
    private javax.swing.JMenuItem exmportOut_MenuItem;
    private javax.swing.JMenu file_Menu;
    private javax.swing.JMenu help_Menu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JLabel sail_Number;
    private javax.swing.JMenuItem useHelp_MenuItem;
    // End of variables declaration//GEN-END:variables
}