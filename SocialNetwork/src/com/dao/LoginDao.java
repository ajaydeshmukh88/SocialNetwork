package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.Myconnection;
import com.model.LoginDTO;

public class LoginDao {
	

	Connection con =null;
	
	
	
	public String loginInfo(LoginDTO loginDTO) 
	{ 
		String uname = loginDTO.getEmail();
		String pass  = loginDTO.getPassword(); 
		
		String userDB="";
		String PassDB="";
		
		System.out.println("Login method");
		
		con = Myconnection.myConnection();
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("select * from tbl_register where email= ? and password =? ");
			
			ps.setString(1,uname);
			
			ps.setString(2, pass);
			
		    ResultSet rs = ps.executeQuery();
			
		    	while(rs.next())
		    	{
		    		System.out.println("Login data match method");
		    		userDB = rs.getString("email");
		    		PassDB  = rs.getString("password");
		    		
		    			if (uname.equals(userDB)  && (pass.equals(PassDB)))
		    			{
		    				 return "SUCCESS"; 
		    			}
		    	
		    		
		    	}
			}
		
		 catch (SQLException e) {
			
			e.printStackTrace();
		}
		//return false;
		return "Invald Detais";
		
	}

}
