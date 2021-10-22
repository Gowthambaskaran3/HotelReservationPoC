package controller;

import java.sql.Connection;

import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.databaseConnection;

public class userInsert extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res){
	try {
	Connection con = databaseConnection.initializeDatabase();
	
	
	//String id=req.getParameter("id");
	String fname = req.getParameter("firstName");
	String lname = req.getParameter("lastName");
	String uname = req.getParameter("userName");
	String pass = req.getParameter("password");
	String dob = req.getParameter("DoB");
	String mobileNO = req.getParameter("mobileNo");
	String email = req.getParameter("email");
	String user = "user";
	PreparedStatement stmt = con.prepareStatement("Insert into userdetails values(?,?,?,?,?,?,?,?)");
	//stmt.setString(1, id);
	stmt.setString(1,fname);
	stmt.setString(2,lname);
	stmt.setString(3,uname);
	stmt.setString(4,pass);
	stmt.setString(5,dob);
	stmt.setString(6, mobileNO);
	stmt.setString(7,email);
	stmt.setString(8, user);
	stmt.executeUpdate();
	System.out.println("Records Inserted");
	
	RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
	rd.forward(req, res);

	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
