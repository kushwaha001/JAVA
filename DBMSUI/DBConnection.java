package DBMSUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection
{
    public static Connection getConnection()
    {
    	String driver="com.mysql.jdbc.Driver";
    	String url="jdbc:mysql://127.0.0.1:3306/test";
    	String user="root";
    	String password="root";
    	Connection con=null;
    	try
    	{
    		Class.forName(driver);
    		con = DriverManager.getConnection(url,user,password);
    	}
    	catch(ClassNotFoundException ex)
    	{
    		ex.printStackTrace();
    	}
    	catch(SQLException ex)
    	{
    		ex.printStackTrace();
    	}
    	return con;
    }
    public static void closeResourses(Connection con,Statement stmt)
    {
    	try
    	{
    		if(stmt!=null)
    		{
    			stmt.close();
    			stmt =null;
    		}
    		
    	}
    	catch(SQLException ex)
    	{
    		ex.printStackTrace();
    	}
    	try
    	{
    		if(con!=null)
    		{
    			con.close();
    			con =null;
    		}
    		
    	}
    	catch(SQLException ex)
    	{
    		ex.printStackTrace();
    	}
    }
}
