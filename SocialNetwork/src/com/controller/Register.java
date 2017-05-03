package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegDao;
import com.model.RegisterDTO;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("welcome to post Method");
	    PrintWriter out = response.getWriter();
	    
	    String fname = request.getParameter("firstname");
	    String lname = request.getParameter("lastname");
	    String birth = request.getParameter("dob");
	    String email = request.getParameter("email");
	    String mobile = request.getParameter("contact");
	    String address = request.getParameter("address");
	    String password = request.getParameter("password");
	    
		System.out.println(" parameter get");
	    RegisterDTO   regdto = new RegisterDTO();
	    
	    regdto.setFirstName(fname);
	    regdto.setLastName(lname);
	    regdto.setDob(birth);
	    regdto.setEmail(email);
	    regdto.setContact(mobile);
	    regdto.setAddress(address);
	    regdto.setPassword(password);
	    
	    RegDao regdao = new RegDao(); 
	    regdao.register(regdto);
	}

}
