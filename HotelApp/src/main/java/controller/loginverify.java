package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.databaseConnection;

public class loginverify extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res){
		try {
		Connection con = databaseConnection.initializeDatabase();
		
		String uname = req.getParameter("userName");
		String pass = req.getParameter("password");
		
		Statement stmt = con.createStatement();
		ResultSet resSet = stmt.executeQuery("select * from userdetails where userName='"+uname+"'and password='"+pass+"'");
		

		if(resSet.next()){
			if(((resSet.getString("user")).equals("user")))			{
			HttpSession session = req.getSession();
			session.setAttribute("username", uname);
			session.setAttribute("password", pass);
			res.sendRedirect("userPage.jsp");}
			else {
				HttpSession session = req.getSession();
				session.setAttribute("username", uname);
				session.setAttribute("password", pass);
				res.sendRedirect("admin.jsp");}
			}
		else {
			RequestDispatcher login = req.getRequestDispatcher("login.jsp");
			login.forward(req, res);
		}

		
		}catch(Exception e) {
			e.printStackTrace();
		}
		}	

}
