package DBMSUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection
{
   public static Connection getConnection()
   {
	   String driver="com.mysql.jdbc.Driver";
	   String url="jdbc:mysql://127.0.0.1:3306/test";
	   Connection con=null;
	   Statement stmt =null;
	   String query=null;
	   try
	   {
		   Class.forName(driver);
		   con  = DriverManager.getConnection(url,"root","root");
		   //stmt  = con.createStatement();
		   //return stmt;
		   return con;
		   
		   
	   }
	   catch(ClassNotFoundException ex)
	   {
		   ex.printStackTrace();
		   return con;
	   }
	   catch(SQLException ex)
	   {
		   ex.printStackTrace();
		   return con;
	   }
	   
	   
   }
}
