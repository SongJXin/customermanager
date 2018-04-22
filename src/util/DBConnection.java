package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
public static final String URL=new XMLReaderClass().Reader("SQL.xml","url")+"?useUnicode=true&characterEncoding=utf-8&useSSL=false";
public static final String DRIVER=new XMLReaderClass().Reader("SQL.xml","driver"); 
public static final String USER=new XMLReaderClass().Reader("SQL.xml","user");
public static final String PASSWORD=new XMLReaderClass().Reader("SQL.xml","password");

		// TODO Auto-generated method stub
static{
	try {
		Class.forName(DRIVER);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static Connection getConnection(){
	Connection conn = null;
	try {
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
	} catch (Exception e) {
        e.printStackTrace();
	}
	return conn;
}
public static void closeRs(ResultSet rs){
	try {
		if(rs!=null){
			rs.close();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void closeStmt(Statement stmt){
	try {
		if(stmt!=null){
			stmt.close();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void closeConn(Connection conn){
	try {
		if(conn!=null){
			conn.close();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}