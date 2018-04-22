/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame.insuranceJFrame;

import Dao.InsuranceDao;
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
public class InsuranceJFrame extends javax.swing.JFrame {

    /**
     * Creates new form Insurance
     */
    public InsuranceJFrame() {
        initComponents();
        //获取table的model
        DefaultTableModel tableModel = (DefaultTableModel) insurance_Table.getModel();
        //声明list
        ArrayList list = new ArrayList();
        //声明map
        Map rowDataMap = new HashMap();
        //声明dao
        InsuranceDao insuranceDao = new InsuranceDao();
        //查询
        list = insuranceDao.list(-1, "", "", "", "");
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
//`i_paper_ID`, `i_car_ID`, `i_customer_ID`, `i_type`, `i_Tax`, `i_money`, `i_sum`, `i_start_date`, 
//`i_brand`, `i_car_number`, `i_customer_name`, `i_date``i_remark`
                tableModel.setValueAt(rowDataMap.get("i_id"), i, 0);
                tableModel.setValueAt(rowDataMap.get("i_paper_ID"), i, 1);
                tableModel.setValueAt(rowDataMap.get("i_car_number"), i, 2);
                tableModel.setValueAt(rowDataMap.get("i_customer_name"), i, 3);
                tableModel.setValueAt(rowDataMap.get("i_type"), i, 4);
                tableModel.setValueAt(rowDataMap.get("i_brand"), i, 5);
                tableModel.setValueAt(rowDataMap.get("i_sum"), i, 6);
                tableModel.setValueAt(rowDataMap.get("i_start_date"), i, 7);
                tableModel.setValueAt(rowDataMap.get("i_date"), i, 8);
                tableModel.setValueAt(rowDataMap.get("i_remark"), i, 9);

                i++;
            }
            //显示条目数量
            insurance_Number.setText(String.valueOf(i));
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
        jToolBar3 = new javax.swing.JToolBar();
        updateInsurance_Button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        insuranceDetialInformation_Button = new javax.swing.JButton();
        findInsurance_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        insurance_Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        insurance_Number = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_Menu = new javax.swing.JMenu();
        exmportOut_MenuItem = new javax.swing.JMenuItem();
        help_Menu = new javax.swing.JMenu();
        useHelp_MenuItem = new javax.swing.JMenuItem();
        about_MenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("保险列表");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(400, 200));
        setLocationByPlatform(true);
        setResizable(false);

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        updateInsurance_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateInsurance_Button.setText("修改信息");
        updateInsurance_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateInsurance_Button.setFocusable(false);
        updateInsurance_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateInsurance_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        updateInsurance_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInsurance_ButtonActionPerformed(evt);
            }
        });
        jToolBar3.add(updateInsurance_Button);

        jButton1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jButton1.setText("删除保单");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton1);

        insuranceDetialInformation_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        insuranceDetialInformation_Button.setText("查看详细信息");
        insuranceDetialInformation_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insuranceDetialInformation_Button.setFocusable(false);
        insuranceDetialInformation_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        insuranceDetialInformation_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        insuranceDetialInformation_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insuranceDetialInformation_ButtonActionPerformed(evt);
            }
        });
        jToolBar3.add(insuranceDetialInformation_Button);

        findInsurance_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        findInsurance_Button.setText("查找");
        findInsurance_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        findInsurance_Button.setFocusable(false);
        findInsurance_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        findInsurance_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        findInsurance_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findInsurance_ButtonActionPerformed(evt);
            }
        });
        jToolBar3.add(findInsurance_Button);

        insurance_Table.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        insurance_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "保单号", "车牌号", "姓名", "类型", "公司", "总价", "生效日", "出单日", "备注"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        insurance_Table.setRowHeight(24);
        jScrollPane1.setViewportView(insurance_Table);
        if (insurance_Table.getColumnModel().getColumnCount() > 0) {
            insurance_Table.getColumnModel().getColumn(0).setPreferredWidth(2);
        }

        jLabel1.setText("共");

        insurance_Number.setText("99");

        jLabel3.setText("条");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(521, 521, 521)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insurance_Number)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(insurance_Number)
                            .addComponent(jLabel3)))
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        file_Menu.setText("文件");
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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void insuranceDetialInformation_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insuranceDetialInformation_ButtonActionPerformed
        int row = insurance_Table.getSelectedRow();
        if (insurance_Table.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择条目</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
        } else {
            if (null == insurance_Table.getValueAt(row, 0)) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择的条目无内容</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
            } else {
                new InsuranceDetailInfromationJFrame(new InsuranceDao().find(Integer.valueOf(String.valueOf(insurance_Table.getValueAt(row, 0))))).setVisible(true);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_insuranceDetialInformation_ButtonActionPerformed

    private void findInsurance_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findInsurance_ButtonActionPerformed
        new FindInsuranceJFrame(insurance_Table, insurance_Number).setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_findInsurance_ButtonActionPerformed

    private void updateInsurance_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInsurance_ButtonActionPerformed
        // TODO add your handling code here:
        int row = insurance_Table.getSelectedRow();
        if (insurance_Table.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择条目</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
        } else {
            if (null == insurance_Table.getValueAt(row, 0)) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择的条目无内容</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
            } else {
                new UpdateInsuranceJFrame(new InsuranceDao().find(Integer.valueOf(String.valueOf(insurance_Table.getValueAt(row, 0))))).setVisible(true);
            }
        }
    }//GEN-LAST:event_updateInsurance_ButtonActionPerformed

    private void exmportOut_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exmportOut_MenuItemActionPerformed
        // TODO add your handling code here:
        new JTableExportToExcel().chooseFile(insurance_Table, "\\保险记录.xls");
    }//GEN-LAST:event_exmportOut_MenuItemActionPerformed

    private void about_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_MenuItemActionPerformed
        // TODO add your handling code here:
        new AboutJFrame().setVisible(true);
    }//GEN-LAST:event_about_MenuItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = insurance_Table.getSelectedRow();
        if (insurance_Table.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择条目</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
        } else {
            if (null == insurance_Table.getValueAt(row, 0)) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择的条目无内容</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
            } else {
                new DeleteInsuranceJFrame(new InsuranceDao().find(Integer.valueOf(String.valueOf(insurance_Table.getValueAt(row, 0))))).setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InsuranceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsuranceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsuranceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsuranceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsuranceJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about_MenuItem;
    private javax.swing.JMenuItem exmportOut_MenuItem;
    private javax.swing.JMenu file_Menu;
    private javax.swing.JButton findInsurance_Button;
    private javax.swing.JMenu help_Menu;
    private javax.swing.JButton insuranceDetialInformation_Button;
    private javax.swing.JLabel insurance_Number;
    private javax.swing.JTable insurance_Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JButton updateInsurance_Button;
    private javax.swing.JMenuItem useHelp_MenuItem;
    // End of variables declaration//GEN-END:variables
}