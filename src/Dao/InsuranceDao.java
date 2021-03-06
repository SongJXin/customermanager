package Dao;


//import Po.Date;
import Po.Customer;
import Po.Insurance;
import Po.Vehicle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import util.DBConnection;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : customermanager
//  @ File Name : InsuranceDao.java
//  @ Date : 2017/7/9
//  @ Author : 宋健鑫
//
//




public class InsuranceDao {
    /**
     * 添加保单
     * 
     * @param insurance 保险
     * @param customer 客户
     * @param vehicle 车辆
     * @return  int
     */
	public int add(Insurance insurance,Customer customer,Vehicle vehicle) {
          int i=0;
            Connection connection=null;
            PreparedStatement preparedStatement=null;
            String sqlString="INSERT INTO `customermanager`.`insurance` (`i_paper_ID`, `i_car_ID`, `i_customer_ID`, `i_type`, `i_Tax`, `i_money`, `i_sum`, `i_start_date`, `i_remark`, `i_brand`, `i_car_number`, `i_customer_name`, `i_date`) VALUES (?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?);";
            try {
                connection = DBConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlString);
                preparedStatement.setString(1, insurance.getI_Paper_ID());
                preparedStatement.setInt(2, vehicle.getV_ID());
                preparedStatement.setInt(3, customer.getC_ID());
                preparedStatement.setString(4, insurance.getI_Type());
                preparedStatement.setFloat(5, insurance.getI_Tax());
                preparedStatement.setFloat(6, insurance.getI_Money());
                preparedStatement.setFloat(7, insurance.getI_Sum());
                preparedStatement.setDate(8, new java.sql.Date (insurance.getI_Start_Date().getTime()));
                preparedStatement.setString(9,insurance.getI_Remark());
                preparedStatement.setString(10, insurance.getI_Brand());
                preparedStatement.setString(11, vehicle.getV_Plante_Nomber());
                preparedStatement.setString(12, customer.getC_Name());
                preparedStatement.setDate(13, new java.sql.Date( insurance.getI_Date().getTime()));
                i = preparedStatement.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "SQL ERROR", JOptionPane.ERROR_MESSAGE); 
            } finally{
                DBConnection.closeConn(connection);
                DBConnection.closeStmt(preparedStatement);
            }
            return i;
	}
	/**
         * 删除保单
         * 
         * @param insurance 保险
         * @return int 
         */
	public int delete(Insurance insurance) {
            int i=0;
            Connection connection=null;
            PreparedStatement preparedStatement=null;
            String sqlString="delete from `customermanager`.`insurance` where i_ID=?;";
            try {
                connection=DBConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlString);
                preparedStatement.setInt(1, insurance.getI_ID());
                i=preparedStatement.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "SQL ERROR", JOptionPane.ERROR_MESSAGE); 
            }finally{
                DBConnection.closeConn(connection);
                DBConnection.closeStmt(preparedStatement);
            }
            return i;
	
	}
//UPDATE `customermanager`.`insurance` SET `i_paper_ID`=?, `i_customer_ID`=?, `i_type`=?, `i_Tax`=?, `i_money`=?, `i_sum`=?, `i_start_date`=?, `i_remark`=?, `i_brand`=?, `i_customer_name`=?, `i_date`=? WHERE `i_ID`=?;
	/**
         * 修改保单信息
         * 
         * @param insurance 保险
         * @param customer 客户
         * @return int
         */
	public int update(Insurance insurance,Customer customer) {
            int i=0;
            Connection connection=null;
            PreparedStatement preparedStatement=null;
            String sqlString=" UPDATE `customermanager`.`insurance` SET `i_paper_ID`=?, `i_customer_ID`=?, `i_type`=?, `i_Tax`=?, `i_money`=?, `i_sum`=?, `i_start_date`=?, `i_remark`=?, `i_brand`=?, `i_customer_name`=?, `i_date`=? WHERE `i_ID`=?;";
            try {
                connection=DBConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlString);
                preparedStatement.setString(1, insurance.getI_Paper_ID());
                preparedStatement.setInt(2, customer.getC_ID());
                preparedStatement.setString(3, insurance.getI_Type());
                preparedStatement.setFloat(4, insurance.getI_Tax());
                preparedStatement.setFloat(5, insurance.getI_Money());
                preparedStatement.setFloat(6, insurance.getI_Sum());
                preparedStatement.setDate(7, new java.sql.Date(insurance.getI_Start_Date().getTime()));
                preparedStatement.setString(8,insurance.getI_Remark());
                preparedStatement.setString(9, insurance.getI_Brand());
                preparedStatement.setString(10, customer.getC_Name()); 
                preparedStatement.setDate(11, new java.sql.Date(insurance.getI_Date().getTime()));
                preparedStatement.setInt(12, insurance.getI_ID());
                
                i=preparedStatement.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "SQL ERROR", JOptionPane.ERROR_MESSAGE); 
            }finally{
                DBConnection.closeConn(connection);
                DBConnection.closeStmt(preparedStatement);
            }
            return i;
	
	}
	/**
         * 根据id查找保单
         * 
         * @param id id
         * @return  保险信息
         */
	public Insurance find(int id) {
            Insurance insurance=new Insurance();
            Connection connection=null;
            PreparedStatement preparedStatement=null;
            String sqlString="select * from `customermanager`.`insurance` WHERE `i_id`=?;";
            try {
                connection = DBConnection.getConnection();
                preparedStatement=connection.prepareStatement(sqlString);
                preparedStatement.setInt(1, id);
                ResultSet rs = preparedStatement.executeQuery();
                insurance.setI_ID(id);
                if(rs.next()){
                //`i_paper_ID`, `i_car_ID`, `i_customer_ID`, `i_type`, `i_Tax`, `i_money`, `i_sum`, `i_start_date`, `i_remark`, `i_brand`, `i_car_number`, `i_customer_name`, `i_date`
                insurance.setI_Brand(rs.getString("i_brand"));
                insurance.setI_Car_ID(rs.getInt("i_car_ID"));
                insurance.setI_Car_Number(rs.getString("i_car_number"));
                insurance.setI_Custmoer_ID(rs.getInt("i_customer_ID"));
                insurance.setI_Customer_Name(rs.getString("i_customer_name"));
                insurance.setI_Date(rs.getDate("i_date"));
                insurance.setI_Money(rs.getFloat("i_money"));
                insurance.setI_Paper_ID(rs.getString("i_paper_ID"));
                insurance.setI_Remark(rs.getString("i_remark"));
                insurance.setI_Start_Date(rs.getDate("i_start_date"));
                insurance.setI_Sum(rs.getFloat("i_sum"));
                insurance.setI_Tax(rs.getFloat("i_Tax"));
                insurance.setI_Type(rs.getString("i_type"));
                }else{
                    JOptionPane.showMessageDialog(null, new JLabel("<html><h1>没有找到记录</h1></html>"), "查无此项", JOptionPane.ERROR_MESSAGE); 
                }
            } catch (SQLException e) {
               // System.out.println(e.getMessage());
                 JOptionPane.showMessageDialog(null, e.getMessage(), "SQL ERROR", JOptionPane.ERROR_MESSAGE); 
            }finally{
                DBConnection.closeConn(connection);
                DBConnection.closeStmt(preparedStatement);
            }
            return insurance;
	}
	/**
         * 按条件检索保单
         * 
         * @param id id
         * @param date 保险日期小于
         * @param brandString 保险公司
         * @param customerString 客户姓名
         * @param carString 车牌号
         * @return  list
         */
	public ArrayList list(int id,String date, String brandString,String customerString,String carString) {
            ResultSet resultSet = null;
            Connection connection=null;

            ArrayList<HashMap<String,Object>> list=new ArrayList<>();
            PreparedStatement preparedStatement=null;
            //初始化sql语句
            String sqlString="SELECT * FROM customermanager.insurance where ";
            if(id!=-1)
                sqlString+="i_id = "+id+" and ";
            if(!"".equals(date))
                sqlString+="i_start_date < '"+date+"' and ";
            if(!"".equals(brandString))
                sqlString+="i_brand like '%"+brandString+"%' and ";
            if(!"".equals(customerString))
                sqlString+="i_customer_name like '%"+customerString+"%' and ";
            if(!"".equals(carString))
                sqlString+="i_car_number  like '%"+carString+"%' and ";
            sqlString+=" 1 = 1;";
           // System.out.println(sqlString);
            try {
                connection=DBConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlString);
                resultSet=preparedStatement.executeQuery();
               //结果保存到list
                ResultSetMetaData mdData=resultSet.getMetaData();
                int columnCount=mdData.getColumnCount();
                while (resultSet.next()) {
                    HashMap<String,Object> rowDataMap=new HashMap();
                    //`i_paper_ID`, `i_car_ID`, `i_customer_ID`, `i_type`, `i_Tax`, `i_money`, `i_sum`, `i_start_date`, `i_remark`
                    //`i_brand`, `i_car_number`, `i_customer_name`, `i_date`
                    rowDataMap.put("i_id", resultSet.getInt("i_id"));
                    rowDataMap.put("i_paper_ID", resultSet.getString("i_paper_ID"));
                    rowDataMap.put("i_type", resultSet.getString("i_type"));
                    rowDataMap.put("i_start_date", resultSet.getDate("i_start_date"));
                    rowDataMap.put("i_Tax", resultSet.getFloat("i_Tax"));
                    rowDataMap.put("i_money", resultSet.getFloat("i_money"));
                    rowDataMap.put("i_sum", resultSet.getFloat("i_sum"));
                    rowDataMap.put("i_remark", resultSet.getString("i_remark"));
                    rowDataMap.put("i_brand", resultSet.getString("i_brand"));
                    rowDataMap.put("i_car_number", resultSet.getString("i_car_number"));
                    rowDataMap.put("i_customer_name", resultSet.getString("i_customer_name"));
                    rowDataMap.put("i_date", resultSet.getDate("i_date"));
                    list.add(rowDataMap);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "SQL ERROR", JOptionPane.ERROR_MESSAGE); 
            }finally{
                DBConnection.closeConn(connection);
                DBConnection.closeStmt(preparedStatement);
                DBConnection.closeRs(resultSet);
            }
            return list;
	}
}
