package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Myconnection {
	
	public static Connection myConnection()  
	{Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/socialNetwork","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (con!=null)
		{
		
		return con;
		}
		else
		{
		return null;
		}
		
	}
	

}
