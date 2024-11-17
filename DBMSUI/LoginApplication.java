package DBMSUI;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class LoginApplication extends JFrame implements ActionListener, FocusListener
{
   public static void main(String[] args) 
   {
	   LoginApplication lp  = new LoginApplication();
	   lp.setVisible(true);
	   lp.setSize(500, 500);
	   lp.pack();
	   lp.setTitle("Login Application");
	   
	   
   }
   JLabel luser,lpassword;
   JTextField tuser,tpass;
   JButton login,reset;
   Font f =null;
   public LoginApplication() 
   {
	 setLayout(new FlowLayout());
	 f =new  Font("TimenewRoman",Font.ITALIC,20);
	 luser = new JLabel("UserName");
	 luser.setFont(f);
	 luser.setBackground(Color.lightGray);
	 lpassword = new JLabel("Password");
	 lpassword.setFont(f);
	 lpassword.setBackground(Color.lightGray);
	 tuser  = new JTextField(10);
	 tuser.setBackground(Color.green);
	 tpass  = new JTextField(10);
	 tpass.setBackground(Color.green);
	 add(luser);
	 add(tuser);
	 add(lpassword);
	 add(tpass);
	 login = new JButton("Login");
	 reset = new JButton("Reset");
	 add(login);
	 add(reset);
	 login.addActionListener(this);
	 //reset.addActionListener(this);
	 reset.addFocusListener(this);
	 
   }
   @Override
	public void actionPerformed(ActionEvent e) 
    {
	   /*
	    if(e.getSource()==login)
	    {
	    	if(tuser.getText().equals("gsv") && tpass.getText().equals("aids"))
	    		{
	    			JOptionPane.showMessageDialog(this,"Welcome "+tuser.getText());
	    		}
	    }
	    if(e.getSource()==reset)
	    {
	    	
	    }
	    */
	  
	   Connection con =null;
	   Statement stmt  =null;
	   try
	   {
		   con  =  DBConnection.getConnection();
		    stmt  =null;
		   String sqlq= "select *from login1 where username1='"+tuser.getText()+"' and password1='"+tpass.getText()+"'";
		    System.out.println(sqlq);
		   stmt  = con.createStatement();
		   ResultSet rs = stmt.executeQuery(sqlq);
		   if(rs.next())
		   {
			   System.out.println("Welcome "+tuser.getText());
			   JOptionPane.showMessageDialog(this, "Welcome "+tuser.getText());
			}
		   else
		   {
			   System.out.println("Login fail ");
		   }
		   
	   }
	   catch(SQLException ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		    DBConnection.closeResourses(con,stmt);
	   }
	   
	}
   @Override
	public void focusGained(FocusEvent e) 
    {
	    System.out.println("Focus Gain");
	    Container c = getContentPane();
		c.setBackground(Color.red);
		
	}
   @Override
	public void focusLost(FocusEvent e) 
    {
		// TODO Auto-generated method stub
	   System.out.println("Focus Lost");
	   
	   tpass.setBackground(Color.blue);
		
	}
}
