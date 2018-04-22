/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame.goodsJFrame;

import Dao.GoodsDao;
import JFrame.help.AboutJFrame;
import Po.Customer;
import Po.Goods;
import customermanager.WelcomeJFrame;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class GoodsJFrame extends javax.swing.JFrame {

    /**
     * Creates new form Goods
     */
    private Customer customer;

    public GoodsJFrame(Customer c) {
        initComponents();
        customer = c;
        //获取table的model
        DefaultTableModel tableModel = (DefaultTableModel) goodsListTabel.getModel();
        //声明list
        ArrayList list = new ArrayList();
        //声明map
        Map rowDataMap = new HashMap();
        //声明dao
        GoodsDao goodsDao = new GoodsDao();
        //查询
        list = goodsDao.list("", "", "", "", "", "", "");
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
                tableModel.setValueAt(rowDataMap.get("g_id"), i, 0);
                tableModel.setValueAt(rowDataMap.get("g_name"), i, 1);
                tableModel.setValueAt(rowDataMap.get("g_brand"), i, 2);
                tableModel.setValueAt(rowDataMap.get("g_price"), i, 3);
                tableModel.setValueAt(rowDataMap.get("g_inventory"), i, 4);
                tableModel.setValueAt(rowDataMap.get("g_pricingway"), i, 5);
                tableModel.setValueAt(rowDataMap.get("g_remark"), i, 6);

                i++;
            }
            //显示条目数量
            goods_Number.setText(String.valueOf(i));
        }

    }

    public GoodsJFrame() {
        initComponents();
        //获取table的model
        DefaultTableModel tableModel = (DefaultTableModel) goodsListTabel.getModel();
        //声明list
        ArrayList list = new ArrayList();
        //声明map
        Map rowDataMap = new HashMap();
        //声明dao
        GoodsDao goodsDao = new GoodsDao();
        //查询
        list = goodsDao.list("", "", "", "", "", "", "");
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
                tableModel.setValueAt(rowDataMap.get("g_id"), i, 0);
                tableModel.setValueAt(rowDataMap.get("g_name"), i, 1);
                tableModel.setValueAt(rowDataMap.get("g_brand"), i, 2);
                tableModel.setValueAt(rowDataMap.get("g_price"), i, 3);
                tableModel.setValueAt(rowDataMap.get("g_inventory"), i, 4);
                tableModel.setValueAt(rowDataMap.get("g_pricingway"), i, 5);
                tableModel.setValueAt(rowDataMap.get("g_remark"), i, 6);

                i++;
            }
            //显示条目数量
            goods_Number.setText(String.valueOf(i));
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
        addGoods_Button = new javax.swing.JButton();
        deleteGoods_Button = new javax.swing.JButton();
        updateGoods_Button = new javax.swing.JButton();
        goodsDetailInformateion_Button = new javax.swing.JButton();
        findGoods_Button = new javax.swing.JButton();
        saleGoods_Button = new javax.swing.JButton();
        returnGoods_Button = new javax.swing.JButton();
        addNumberGoods_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        goodsListTabel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        goods_Number = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_Menu = new javax.swing.JMenu();
        exmportOut_MenuItem = new javax.swing.JMenuItem();
        help_Menu = new javax.swing.JMenu();
        useHelp_MenuItem = new javax.swing.JMenuItem();
        about_MenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("商品列表\n");
        setLocation(new java.awt.Point(400, 200));
        setLocationByPlatform(true);
        setResizable(false);

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        addGoods_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        addGoods_Button.setText("添加商品");
        addGoods_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addGoods_Button.setFocusable(false);
        addGoods_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addGoods_Button.setIconTextGap(10);
        addGoods_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addGoods_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGoods_ButtonActionPerformed(evt);
            }
        });
        jToolBar3.add(addGoods_Button);

        deleteGoods_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        deleteGoods_Button.setText("删除商品");
        deleteGoods_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteGoods_Button.setFocusable(false);
        deleteGoods_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteGoods_Button.setIconTextGap(10);
        deleteGoods_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteGoods_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGoods_ButtonActionPerformed(evt);
            }
        });
        jToolBar3.add(deleteGoods_Button);

        updateGoods_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateGoods_Button.setText("修改信息");
        updateGoods_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateGoods_Button.setFocusable(false);
        updateGoods_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateGoods_Button.setIconTextGap(10);
        updateGoods_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        updateGoods_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateGoods_ButtonActionPerformed(evt);
            }
        });
        jToolBar3.add(updateGoods_Button);

        goodsDetailInformateion_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        goodsDetailInformateion_Button.setText("查看详细信息");
        goodsDetailInformateion_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goodsDetailInformateion_Button.setFocusable(false);
        goodsDetailInformateion_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        goodsDetailInformateion_Button.setIconTextGap(10);
        goodsDetailInformateion_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        goodsDetailInformateion_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodsDetailInformateion_ButtonActionPerformed(evt);
            }
        });
        jToolBar3.add(goodsDetailInformateion_Button);

        findGoods_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        findGoods_Button.setText("查找");
        findGoods_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        findGoods_Button.setFocusable(false);
        findGoods_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        findGoods_Button.setIconTextGap(10);
        findGoods_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        findGoods_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findGoods_ButtonActionPerformed(evt);
            }
        });
        jToolBar3.add(findGoods_Button);

        saleGoods_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        saleGoods_Button.setText("出售");
        saleGoods_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saleGoods_Button.setFocusable(false);
        saleGoods_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saleGoods_Button.setIconTextGap(10);
        saleGoods_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saleGoods_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleGoods_ButtonActionPerformed(evt);
            }
        });
        jToolBar3.add(saleGoods_Button);

        returnGoods_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        returnGoods_Button.setText("退回");
        returnGoods_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnGoods_Button.setFocusable(false);
        returnGoods_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        returnGoods_Button.setIconTextGap(10);
        returnGoods_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        returnGoods_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnGoods_ButtonActionPerformed(evt);
            }
        });
        jToolBar3.add(returnGoods_Button);

        addNumberGoods_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        addNumberGoods_Button.setText("进货");
        addNumberGoods_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addNumberGoods_Button.setFocusable(false);
        addNumberGoods_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addNumberGoods_Button.setIconTextGap(10);
        addNumberGoods_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addNumberGoods_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNumberGoods_ButtonActionPerformed(evt);
            }
        });
        jToolBar3.add(addNumberGoods_Button);

        goodsListTabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        goodsListTabel.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        goodsListTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "商品名", "品牌", "价格", "库存", "计费方式", "备注"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        goodsListTabel.setRowHeight(24);
        jScrollPane1.setViewportView(goodsListTabel);
        if (goodsListTabel.getColumnModel().getColumnCount() > 0) {
            goodsListTabel.getColumnModel().getColumn(0).setPreferredWidth(2);
            goodsListTabel.getColumnModel().getColumn(3).setPreferredWidth(4);
            goodsListTabel.getColumnModel().getColumn(4).setPreferredWidth(4);
            goodsListTabel.getColumnModel().getColumn(5).setPreferredWidth(8);
        }

        jLabel1.setText("共");

        goods_Number.setText("99");

        jLabel3.setText("条");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goods_Number)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(goods_Number)
                            .addComponent(jLabel3)))
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(207, 50));

        file_Menu.setText("文件");
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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnGoods_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnGoods_ButtonActionPerformed
        int row = goodsListTabel.getSelectedRow();
        if (goodsListTabel.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择条目</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
        } else {
            if (null == goodsListTabel.getValueAt(row, 0)) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择的条目无内容</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
            } else {
                new ReturnGoodsJFrame(customer, new GoodsDao().find(Integer.valueOf(String.valueOf(goodsListTabel.getValueAt(row, 0))))).setVisible(true);// TODO add your handling code here:
            }
        }
    }//GEN-LAST:event_returnGoods_ButtonActionPerformed

    private void useHelp_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useHelp_MenuItemActionPerformed
        try {
            java.awt.Desktop.getDesktop().open(new File("帮助文档.CHM"));
        } catch (IOException ex) {
            Logger.getLogger(WelcomeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_useHelp_MenuItemActionPerformed

    private void addGoods_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGoods_ButtonActionPerformed
        new AddGoodsJFrame().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_addGoods_ButtonActionPerformed

    private void deleteGoods_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteGoods_ButtonActionPerformed
        int row = goodsListTabel.getSelectedRow();
        if (goodsListTabel.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择条目</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
        } else {
            if (null == goodsListTabel.getValueAt(row, 0)) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择的条目无内容</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
            } else {
                new DeleteGoodsJFrame(new GoodsDao().find(Integer.valueOf(String.valueOf(goodsListTabel.getValueAt(row, 0))))).setVisible(true);
            }
        }
    }//GEN-LAST:event_deleteGoods_ButtonActionPerformed

    private void updateGoods_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateGoods_ButtonActionPerformed
        int row = goodsListTabel.getSelectedRow();
        if (goodsListTabel.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择条目</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
        } else {
            if (null == goodsListTabel.getValueAt(row, 0)) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择的条目无内容</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
            } else {
                new UpdataGoodsJFrame(new GoodsDao().find(Integer.valueOf(String.valueOf(goodsListTabel.getValueAt(row, 0))))).setVisible(true);
            }
        }
    }//GEN-LAST:event_updateGoods_ButtonActionPerformed

    private void goodsDetailInformateion_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodsDetailInformateion_ButtonActionPerformed
        int row = goodsListTabel.getSelectedRow();
        Goods goods = new Goods();
        GoodsDao goodsDao = new GoodsDao();
        if (goodsListTabel.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择条目</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
        } else {
            if (null == goodsListTabel.getValueAt(row, 0)) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择的条目无内容</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
            } else {
                goods = goodsDao.find(Integer.valueOf(String.valueOf(goodsListTabel.getValueAt(row, 0))));
                DetailInformateionGoodsJFrame detailInformateionGoodsJFrame = new DetailInformateionGoodsJFrame(goods);
                detailInformateionGoodsJFrame.setVisible(true);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_goodsDetailInformateion_ButtonActionPerformed
    private void findGoodsDisplay(FindGoodsJFrame findGoodsJFrame) {
        findGoodsJFrame.setVisible(true);
    }
    private void findGoods_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findGoods_ButtonActionPerformed
        FindGoodsJFrame findGoodsJFrame = new FindGoodsJFrame(goodsListTabel, goods_Number);
        findGoodsJFrame.setVisible(true);

    }//GEN-LAST:event_findGoods_ButtonActionPerformed

    private void saleGoods_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleGoods_ButtonActionPerformed
        int row = goodsListTabel.getSelectedRow();
        if (goodsListTabel.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择条目</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
        } else {
            if (null == goodsListTabel.getValueAt(row, 0)) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择的条目无内容</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
            } else {
                //System.out.println(customer.getC_Name());
                new SailGoodsJFrame(customer, new GoodsDao().find(Integer.valueOf(String.valueOf(goodsListTabel.getValueAt(row, 0))))).setVisible(true);// TODO add your handling code here:
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_saleGoods_ButtonActionPerformed

    private void addNumberGoods_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNumberGoods_ButtonActionPerformed
        // TODO add your handling code here:
        int row = goodsListTabel.getSelectedRow();
        if (goodsListTabel.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择条目</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
        } else {
            if (null == goodsListTabel.getValueAt(row, 0)) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择的条目无内容</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
            } else {
                new AddGoodsNumberJFrame(new GoodsDao().find(Integer.valueOf(String.valueOf(goodsListTabel.getValueAt(row, 0))))).setVisible(true);// TODO add your handling code here:
            }
        }
    }//GEN-LAST:event_addNumberGoods_ButtonActionPerformed

    private void exmportOut_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exmportOut_MenuItemActionPerformed
        // TODO add your handling code here:
        new JTableExportToExcel().chooseFile(goodsListTabel, "//库存清单.xls");
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
            java.util.logging.Logger.getLogger(GoodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoodsJFrame().setVisible(true);
            }
        });
    }
    private ResultSet rs = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about_MenuItem;
    private javax.swing.JButton addGoods_Button;
    private javax.swing.JButton addNumberGoods_Button;
    private javax.swing.JButton deleteGoods_Button;
    private javax.swing.JMenuItem exmportOut_MenuItem;
    private javax.swing.JMenu file_Menu;
    private javax.swing.JButton findGoods_Button;
    private javax.swing.JButton goodsDetailInformateion_Button;
    private javax.swing.JTable goodsListTabel;
    private javax.swing.JLabel goods_Number;
    private javax.swing.JMenu help_Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JButton returnGoods_Button;
    private javax.swing.JButton saleGoods_Button;
    private javax.swing.JButton updateGoods_Button;
    private javax.swing.JMenuItem useHelp_MenuItem;
    // End of variables declaration//GEN-END:variables
}
