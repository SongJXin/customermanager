/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame.carJFrame;

import Dao.InsuranceDao;
import JFrame.insuranceJFrame.InsuranceDetailInfromationJFrame;
import Po.Vehicle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 健鑫
 */
public class DetaliInformationCarJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form AddCarJFrame
     */
    public DetaliInformationCarJFrame1() {
        initComponents();
        
        
    }
    private Vehicle vehicle;
    public DetaliInformationCarJFrame1(Vehicle v)
    {
        vehicle=v;
        initComponents();
         DefaultTableModel tableModel = (DefaultTableModel)CarDetail_Insurance_Table.getModel();
        //声明list
        ArrayList list=new ArrayList();
        //声明map
        Map rowDataMap=new HashMap();
        //声明dao
        InsuranceDao insuranceDao=new InsuranceDao();
        //查询
        list=insuranceDao.list(vehicle.getV_ID(),"", "", "", "");
        //没有查到结果时报错
        if(list==null){
             JOptionPane.showMessageDialog(null, "没有找到查询结果", "查询失败", JOptionPane.ERROR_MESSAGE); 
        }else{
            //计数器，记录第几行
            int i=0;
            //迭代器
            Iterator it1 = list.iterator();
            //重置table内容，避免第二次查询结果少于第一次时，第一次的内容依然存在
            tableModel.setRowCount(list.size());
            //遍历
            while(it1.hasNext()){
                rowDataMap=(Map) it1.next();
                //显示
//`i_paper_ID`, `i_car_ID`, `i_customer_ID`, `i_type`, `i_Tax`, `i_money`, `i_sum`, `i_start_date`, 
//`i_brand`, `i_car_number`, `i_customer_name`, `i_date``i_remark`
                tableModel.setValueAt(rowDataMap.get("i_id"), i,0);
                //tableModel.setValueAt(rowDataMap.get("i_paper_ID"), i, 1);
                //tableModel.setValueAt(rowDataMap.get("i_car_number"), i, 2);
                //tableModel.setValueAt(rowDataMap.get("i_customer_name"), i, 3);
                tableModel.setValueAt(rowDataMap.get("i_type"), i, 2);
                tableModel.setValueAt(rowDataMap.get("i_brand"), i, 1);
                tableModel.setValueAt(rowDataMap.get("i_sum"), i, 6);
                tableModel.setValueAt(rowDataMap.get("i_money"), i, 4);
                tableModel.setValueAt(rowDataMap.get("i_Tax"), i, 5);
                tableModel.setValueAt(rowDataMap.get("i_start_date"), i, 3);
                //tableModel.setValueAt(rowDataMap.get("i_date"), i, 8);
                //tableModel.setValueAt(rowDataMap.get("i_remark"), i, 9);
                
                i++;
            } 
            //显示条目数量
            CarDetaliNumber.setText(String.valueOf(i));
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
        CarDetail_PlantNumber_TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CarDetail_Remark_TextArea = new javax.swing.JTextArea();
        CarDetail_RegisterDate_TextField = new javax.swing.JTextField();
        CarDetail_EngineNumber_TextField = new javax.swing.JTextField();
        CarDetail_VIN_TextField = new javax.swing.JTextField();
        CarDetail_Model_TextField = new javax.swing.JTextField();
        CarDetail_UserCharactor_TextField = new javax.swing.JTextField();
        CarDetail_Type_TextField = new javax.swing.JTextField();
        CarDetail_GiveDate_TextField = new javax.swing.JTextField();
        CarDetail_OK_Button = new javax.swing.JButton();
        CarDetail_Cancel_Button = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        CarDetail_OwnerName_TextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        CarDetail_Insurance_Table = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CarDetaliNumber = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Detail_InsuranceDetail_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("详细信息");

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("车牌号：");

        CarDetail_PlantNumber_TextField.setEditable(false);
        CarDetail_PlantNumber_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        CarDetail_PlantNumber_TextField.setText(vehicle.getV_Plante_Nomber());

        jLabel2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel2.setText("注册日期：");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel3.setText("发证日期：");

        jLabel4.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel4.setText("发动机号：");

        jLabel5.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel5.setText("识别代码：");

        jLabel6.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel6.setText("品牌型号：");

        jLabel7.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel7.setText("使用性质：");

        jLabel8.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel8.setText("车辆类型：");

        jLabel9.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel9.setText("备注：");

        CarDetail_Remark_TextArea.setEditable(false);
        CarDetail_Remark_TextArea.setColumns(20);
        CarDetail_Remark_TextArea.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        CarDetail_Remark_TextArea.setRows(5);
        CarDetail_Remark_TextArea.setText(vehicle.getV_Remark());
        jScrollPane1.setViewportView(CarDetail_Remark_TextArea);

        CarDetail_RegisterDate_TextField.setEditable(false);
        CarDetail_RegisterDate_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        CarDetail_RegisterDate_TextField.setText(String.valueOf(vehicle.getV_Register_Date())
        );

        CarDetail_EngineNumber_TextField.setEditable(false);
        CarDetail_EngineNumber_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        CarDetail_EngineNumber_TextField.setText(vehicle.getV_Engine_Nomber());

        CarDetail_VIN_TextField.setEditable(false);
        CarDetail_VIN_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        CarDetail_VIN_TextField.setText(vehicle.getV_VIN());

        CarDetail_Model_TextField.setEditable(false);
        CarDetail_Model_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        CarDetail_Model_TextField.setText(vehicle.getV_Model());

        CarDetail_UserCharactor_TextField.setEditable(false);
        CarDetail_UserCharactor_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        CarDetail_UserCharactor_TextField.setText(vehicle.getV_User_Character());

        CarDetail_Type_TextField.setEditable(false);
        CarDetail_Type_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        CarDetail_Type_TextField.setText(vehicle.getV_Vehicle_Type());

        CarDetail_GiveDate_TextField.setEditable(false);
        CarDetail_GiveDate_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        CarDetail_GiveDate_TextField.setText(String.valueOf(vehicle.getV_Give_Date())
        );

        CarDetail_OK_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        CarDetail_OK_Button.setText("确定");
        CarDetail_OK_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CarDetail_OK_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarDetail_OK_ButtonActionPerformed(evt);
            }
        });

        CarDetail_Cancel_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        CarDetail_Cancel_Button.setText("取消");
        CarDetail_Cancel_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CarDetail_Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarDetail_Cancel_ButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel10.setText("车主姓名：");

        CarDetail_OwnerName_TextField.setEditable(false);
        CarDetail_OwnerName_TextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        CarDetail_OwnerName_TextField.setText(vehicle.getV_Owner_Name());

        CarDetail_Insurance_Table.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        CarDetail_Insurance_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "保险公司", "保险类型", "到期日", "保险价格", "税", "总价"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CarDetail_Insurance_Table.setRowHeight(24);
        jScrollPane2.setViewportView(CarDetail_Insurance_Table);
        if (CarDetail_Insurance_Table.getColumnModel().getColumnCount() > 0) {
            CarDetail_Insurance_Table.getColumnModel().getColumn(0).setPreferredWidth(2);
        }

        jLabel11.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel11.setText("保险详情：");

        jLabel12.setText("共");

        CarDetaliNumber.setText("99");

        jLabel14.setText("条记录");

        Detail_InsuranceDetail_Button.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        Detail_InsuranceDetail_Button.setText("详细信息");
        Detail_InsuranceDetail_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Detail_InsuranceDetail_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Detail_InsuranceDetail_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CarDetail_OK_Button)
                                .addGap(128, 128, 128)
                                .addComponent(CarDetail_Cancel_Button)
                                .addGap(229, 229, 229))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CarDetail_VIN_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(CarDetail_PlantNumber_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CarDetail_GiveDate_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CarDetail_OwnerName_TextField, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(CarDetail_UserCharactor_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(CarDetail_Type_TextField))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(CarDetail_RegisterDate_TextField))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(CarDetail_Model_TextField))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(CarDetail_EngineNumber_TextField))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CarDetaliNumber)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(426, 426, 426)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(55, 55, 55)
                                .addComponent(Detail_InsuranceDetail_Button)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CarDetail_RegisterDate_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(CarDetail_OwnerName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CarDetail_EngineNumber_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(CarDetail_PlantNumber_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CarDetail_Model_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(CarDetail_GiveDate_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CarDetail_Type_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(CarDetail_VIN_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(CarDetail_UserCharactor_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(Detail_InsuranceDetail_Button)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CarDetaliNumber)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel12))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CarDetail_OK_Button)
                            .addComponent(CarDetail_Cancel_Button))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(242, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Detail_InsuranceDetail_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Detail_InsuranceDetail_ButtonActionPerformed
        // TODO add your handling code here:
                int row=CarDetail_Insurance_Table.getSelectedRow();
        if (CarDetail_Insurance_Table.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择查看的详细信息的条目</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
        } else {
            if (null == CarDetail_Insurance_Table.getValueAt(row, 0)) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h1>选择的条目无内容</h1></html>"), "选择条目", JOptionPane.ERROR_MESSAGE);
            } else {
                 new InsuranceDetailInfromationJFrame(new InsuranceDao().find(Integer.valueOf(String.valueOf(CarDetail_Insurance_Table.getValueAt(row, 0))))).setVisible(true);
            }
        }
    }//GEN-LAST:event_Detail_InsuranceDetail_ButtonActionPerformed

    private void CarDetail_OK_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarDetail_OK_ButtonActionPerformed
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_CarDetail_OK_ButtonActionPerformed

    private void CarDetail_Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarDetail_Cancel_ButtonActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_CarDetail_Cancel_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DetaliInformationCarJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetaliInformationCarJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetaliInformationCarJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetaliInformationCarJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetaliInformationCarJFrame1().setVisible(true);
                 //获取table的model
      
      
    


            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CarDetail_Cancel_Button;
    private javax.swing.JTextField CarDetail_EngineNumber_TextField;
    private javax.swing.JTextField CarDetail_GiveDate_TextField;
    private javax.swing.JTable CarDetail_Insurance_Table;
    private javax.swing.JTextField CarDetail_Model_TextField;
    private javax.swing.JButton CarDetail_OK_Button;
    private javax.swing.JTextField CarDetail_OwnerName_TextField;
    private javax.swing.JTextField CarDetail_PlantNumber_TextField;
    private javax.swing.JTextField CarDetail_RegisterDate_TextField;
    private javax.swing.JTextArea CarDetail_Remark_TextArea;
    private javax.swing.JTextField CarDetail_Type_TextField;
    private javax.swing.JTextField CarDetail_UserCharactor_TextField;
    private javax.swing.JTextField CarDetail_VIN_TextField;
    private javax.swing.JLabel CarDetaliNumber;
    private javax.swing.JButton Detail_InsuranceDetail_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
