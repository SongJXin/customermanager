package Dao;


import Po.Vehicle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import util.DBConnection;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : customermanager
//  @ File Name : VehicleDao.java
//  @ Date : 2017/7/9
//  @ Author : 宋健鑫
//
//




public class VehicleDao {
//INSERT INTO `customermanager`.`vehicle` (`V_owner_id`, `V_plante_nomber`, 
//`V_register_date`, `V_give_date`, `V_engine_nomber`, `V_VIN`, `V_model`, 
//`V_use_character`, `V_Vehicle_type`, `V_remark`,`V_owner_name`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?);
    /**
     * 添加车辆
     * 
     * @param vehicle 车辆信息
     * @return  int
     */
    public int add(Vehicle vehicle) {
            int i=0;
            Connection connection=null;
            PreparedStatement preparedStatement=null;
            String sqlString="INSERT INTO `customermanager`.`vehicle` (`V_owner_id`, `V_plante_nomber`, `V_register_date`, `V_give_date`, `V_engine_nomber`, `V_VIN`, `V_model`, `V_use_character`, `V_Vehicle_type`, `V_remark`,`V_owner_name`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?);" ;
            try {
                connection=DBConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlString);
                preparedStatement.setInt(1, vehicle.getV_Owner_ID());
                preparedStatement.setString(2, vehicle.getV_Plante_Nomber());
                preparedStatement.setDate(3, new java.sql.Date( vehicle.getV_Register_Date().getTime()));
                preparedStatement.setDate(4, new java.sql.Date( vehicle.getV_Give_Date().getTime()));
                preparedStatement.setString(5, vehicle.getV_Engine_Nomber());
                preparedStatement.setString(6, vehicle.getV_VIN());
                preparedStatement.setString(7, vehicle.getV_Model());
                preparedStatement.setString(8, vehicle.getV_User_Character());
                preparedStatement.setString(9, vehicle.getV_Vehicle_Type());
                preparedStatement.setString(10, vehicle.getV_Remark());
                preparedStatement.setString(11, vehicle.getV_Owner_Name());
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
         * 删除车辆
         * 
         * @param vehicle 车辆信息
         * @return int
         */
	public int delete(Vehicle vehicle) {
            int i=0;
            Connection connection=null;
            PreparedStatement preparedStatement=null;
            String sqlString="delete from `customermanager`.`vehicle` where V_ID = ?" ;
            try {
                connection=DBConnection.getConnection();
                preparedStatement=connection.prepareStatement(sqlString);
                preparedStatement.setInt(1, vehicle.getV_ID());
                i=preparedStatement.executeUpdate();
            } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null, e.getMessage(), "SQL ERROR", JOptionPane.ERROR_MESSAGE); 
            }finally{
                DBConnection.closeConn(connection);
                DBConnection.closeStmt(preparedStatement);
            }
            return i;
	
	}
//UPDATE `customermanager`.`vehicle` SET  `V_owner_id`=?, `V_plante_nomber`=?, `V_register_date`=?, `V_give_date`=?, `V_engine_nomber`=?, `V_VIN`=?, `V_model`=?, `V_use_character`=?, `V_Vehicle_type`=?, `V_remark`=?,`V_owner_name`=? WHERE `V_ID`='1';	
	/**
         * 修改车辆信息
         * 
         * @param vehicle 车辆信息
         * @return int
         */
        public int update(Vehicle vehicle) {
            int i=0;
            Connection connection=null;
            PreparedStatement preparedStatement=null;
            String sqlString="UPDATE `customermanager`.`vehicle` SET  `V_owner_id`=?, `V_plante_nomber`=?, `V_register_date`=?, `V_give_date`=?, `V_engine_nomber`=?, `V_VIN`=?, `V_model`=?, `V_use_character`=?, `V_Vehicle_type`=?, `V_remark`=?,`V_owner_name`=? WHERE `V_ID`=?;";
             try {
                connection=DBConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlString);
                preparedStatement.setInt(1, vehicle.getV_Owner_ID());
                preparedStatement.setString(2, vehicle.getV_Plante_Nomber());
                preparedStatement.setDate(3, new java.sql.Date( vehicle.getV_Register_Date().getTime()));
                preparedStatement.setDate(4, new java.sql.Date( vehicle.getV_Give_Date().getTime()));
                preparedStatement.setString(5, vehicle.getV_Engine_Nomber());
                preparedStatement.setString(6, vehicle.getV_VIN());
                preparedStatement.setString(7, vehicle.getV_Model());
                preparedStatement.setString(8, vehicle.getV_User_Character());
                preparedStatement.setString(9, vehicle.getV_Vehicle_Type());
                preparedStatement.setString(10, vehicle.getV_Remark());
                preparedStatement.setString(11, vehicle.getV_Owner_Name());
                preparedStatement.setInt(12, vehicle.getV_ID());
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
         * 根据id查找车辆
         * 
         * @param id id
         * @return 车辆信息
         */
	public Vehicle find(int id) {
            Vehicle vehicle=new Vehicle();
            ResultSet rs=null;
            Connection connection=null;
            PreparedStatement preparedStatement=null;
            String sqlString="select * from `customermanager`.`vehicle` where V_ID = ?" ;
            try {
                connection=DBConnection.getConnection();
                preparedStatement=connection.prepareStatement(sqlString);
                preparedStatement.setInt(1, id);
                rs=preparedStatement.executeQuery();
                vehicle.setV_ID(id);
                //`V_owner_id`, `V_plante_nomber`, 
                //`V_register_date`, `V_give_date`, `V_engine_nomber`, `V_VIN`, `V_model`, 
                //`V_use_character`, `V_Vehicle_type`, `V_remark`,`V_owner_name`
                if (rs.next()) {
                    vehicle.setV_Engine_Nomber(rs.getString("V_engine_nomber"));
                    vehicle.setV_Give_Date(rs.getDate("V_give_date"));
                    vehicle.setV_Model(rs.getString("V_model"));
                    vehicle.setV_Owner_ID(rs.getInt("V_owner_id"));
                    vehicle.setV_Owner_Name(rs.getString("V_owner_name"));
                    vehicle.setV_Plante_Nomber(rs.getString("V_plante_nomber"));
                    vehicle.setV_Register_Date(rs.getDate("V_register_date"));
                    vehicle.setV_Remark(rs.getString("V_remark"));
                    vehicle.setV_User_Character(rs.getString("V_use_character"));
                    vehicle.setV_VIN(rs.getString("V_VIN"));
                    vehicle.setV_Vehicle_Type(rs.getString("V_Vehicle_type"));
                }
                
            } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null, e.getMessage(), "SQL ERROR", JOptionPane.ERROR_MESSAGE); 
            }finally{
                DBConnection.closeConn(connection);
                DBConnection.closeStmt(preparedStatement);
                DBConnection.closeRs(rs);
            }
            
            return vehicle;
	
	}
	/**
         * 按条件检索车辆
         * 
         * @param id id
         * @param begindataString 审车日期大于
         * @param enddataString 审车日期小于
         * @param nameString 客户名
         * @param numberString 车牌号
         * @return list
         */
	public ArrayList list(int id,String begindataString,String enddataString,String nameString,String numberString) {
            Connection connection=null;
            PreparedStatement preparedStatement=null;
            ResultSet resultSet = null;
            ArrayList<HashMap<String,Object>> list=new ArrayList<>();
            String sqlString="select * from `customermanager`.`vehicle` where ";
            if(id!=-1)
            {
                sqlString=sqlString+"V_owner_id ="+id+" and ";
            }
            if (!"".equals(begindataString)) {
                sqlString=sqlString+"V_register_date > '"+begindataString+"' and ";
            }
            if(!"".equals(enddataString)){
                sqlString+="V_register_date < '"+enddataString+"' and ";
            }
            if(!"".equals(nameString)){
                sqlString+="V_owner_name like '%"+nameString+"%' and ";
            }
            if(!"".equals(numberString)){
                sqlString+="V_plante_nomber like '%"+numberString+"%' and ";
            }
            sqlString+="1=1;";
            //System.out.println(sqlString);
            try {
                connection=DBConnection.getConnection();
                preparedStatement = connection.prepareStatement(sqlString);
                resultSet=preparedStatement.executeQuery();
                ResultSetMetaData mdData=resultSet.getMetaData();
                int columnCount=mdData.getColumnCount();
                while (resultSet.next()) {
                    HashMap<String,Object> rowDataMap=new HashMap();
//`V_owner_id`, `V_plante_nomber`, 
//`V_register_date`, `V_give_date`, `V_engine_nomber`, `V_VIN`, `V_model`, 
//`V_use_character`, `V_Vehicle_type`, `V_remark`,`V_owner_name`
                    rowDataMap.put("V_ID", resultSet.getInt("V_ID"));
                    rowDataMap.put("V_owner_id", resultSet.getInt("V_owner_id"));
                    rowDataMap.put("V_plante_nomber", resultSet.getString("V_plante_nomber"));
                    rowDataMap.put("V_register_date", resultSet.getDate("V_register_date"));
                    rowDataMap.put("V_give_date", resultSet.getDate("V_give_date"));
                    rowDataMap.put("V_engine_nomber", resultSet.getString("V_engine_nomber"));
                    rowDataMap.put("V_VIN", resultSet.getString("V_VIN"));
                    rowDataMap.put("V_model", resultSet.getString("V_model"));
                    rowDataMap.put("V_use_character", resultSet.getString("V_use_character"));
                    rowDataMap.put("V_Vehicle_type", resultSet.getString("V_Vehicle_type"));
                    rowDataMap.put("V_remark", resultSet.getString("V_remark"));
                    rowDataMap.put("V_owner_name", resultSet.getString("V_owner_name"));
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