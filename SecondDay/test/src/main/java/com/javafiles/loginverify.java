package com.javafiles;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginverify extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res){
		try {
		Connection con = databaseConnection.initializeDatabase();
		
		String uname = req.getParameter("userName");
		String pass = req.getParameter("password");
		Statement stmt = con.createStatement();
		ResultSet resSet = stmt.executeQuery("select * from userdetails where userName='"+uname+"'and password='"+pass+"'");
		
		if(resSet.next()){
//			RequestDispatcher home = req.getRequestDispatcher("home");
//			home.forward(req, res);	}
			HttpSession session = req.getSession();
			session.setAttribute("username", uname);
			session.setAttribute("password", pass);
			res.sendRedirect("home");}
		else {
			RequestDispatcher login = req.getRequestDispatcher("login.jsp");
			login.forward(req, res);
		}
//		while(resSet.next()) {
//			if(uname.equals(resSet.getString("userName"))) {
//				if(pass.equals(resSet.getString("password"))) {
//				
//				RequestDispatcher home = req.getRequestDispatcher("home");
//				home.forward(req, res);
////				HttpSession session = req.getSession();
////				session.setAttribute("username", uname);
////				session.setAttribute("password", pass);
////				res.sendRedirect("home");
//				
//				System.out.println("User Logged In");
//				}
//				else{
//					RequestDispatcher login = req.getRequestDispatcher("login.jsp");
//					login.forward(req, res);
//					System.out.println("Invalid Password");
//				}
//			}
//			else{
//				RequestDispatcher login = req.getRequestDispatcher("login.jsp");
//				login.forward(req, res);	
//				System.out.println("Invalid User");
//			}
//		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		}	

}
