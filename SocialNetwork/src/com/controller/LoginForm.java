package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.LoginDao;
import com.model.LoginDTO;

@WebServlet("/LoginForm")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(email); 
		System.out.println(password); 
		
	
		LoginDTO login = new LoginDTO();
		
		login.setEmail(email);
		login.setPassword(password);
		
		
		LoginDao loginDao = new LoginDao();
		
		String loginSuccess = loginDao.loginInfo(login);
		
		System.out.println("Login success check");
		
		 if (loginSuccess.equals("SUCCESS"))
		
		 {
			 System.out.println(loginSuccess);
			 //request.setAttribute("userName", userName); //with setAttribute() you can define a "key" and value pair so that you can get it in future using getAttribute("key")
     		 // request.getRequestDispatcher("../Registration.html").forward(request, response);//RequestDispatcher is used to send the control to the invoked page.
			 response.sendRedirect("Success.html");
			 System.out.println("JJJJJJJ");
		      
		 }
			
		 else
			 {
			 //request.setAttribute("errMessage", userValidate); //If authenticateUser() function returnsother than SUCCESS string it will be sent to Login page again. Here the error message returned from function has been stored in a errMessage key.
			 request.getRequestDispatcher("../index.html").forward(request, response);//forwarding the request
			 }
		}
	
	}
	

