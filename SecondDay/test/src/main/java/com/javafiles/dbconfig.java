package com.javafiles;

	import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javafiles.databaseConnection;
	  
	
	public class dbconfig extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	  
	    protected void doGet(HttpServletRequest req, HttpServletResponse res)
	        throws ServletException, IOException
	    {
	    	

	    	try {
	  
	            Connection con = databaseConnection.initializeDatabase();
	            Statement stmt = null;
	            stmt = con.createStatement();
	            
	  
	            
	            ResultSet resset = null;
	            resset=stmt.executeQuery("select * from roomdetails");

	            HttpSession session = req.getSession();
	            String user = (String) session.getAttribute("username");
	          
	            PrintWriter out = res.getWriter();

	            out.println("Welcome "+user+" to Element Home Page <br>");
	            while(resset.next()) {
	            	 String roomid = resset.getString("roomnumber");
	                 String roomname = resset.getString("roomtype");
	                 out.println(roomid+"-"+roomname+"<br>");
	            }

		out.println("<a href="
	            		+ "/test/login.jsp>");
	            out.println("LogOut");
	            out.println("</a>");
	            session.invalidate();
	            session.removeAttribute("username");	
		con.close();
	            	  
	    	}
	  
	    	catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
