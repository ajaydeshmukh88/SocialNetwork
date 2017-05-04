package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import com.connection.Myconnection;
import com.model.RegisterDTO;

public class RegDao {
	

	Connection con =null;
	
	
	public boolean register(RegisterDTO registerDTO) 
	{ System.out.println("register method");
		int i=0;
		con = Myconnection.myConnection();
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("insert into tbl_register() values(?,?,?,?,?,?,?)");
			ps.setString(1, registerDTO.getFirstName());
			ps.setString(2, registerDTO.getLastName());
			ps.setString(3, registerDTO.getDob());
			ps.setString(4, registerDTO.getEmail());
			ps.setString(5, registerDTO.getContact());
			ps.setString(6, registerDTO.getAddress());
			ps.setString(7, registerDTO.getPassword());
			
		 i = ps.executeUpdate();
			
			}
		
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (i>0)
		{
			return true;
			
		}
		else
		{
		return false;
		}
	}}