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
	
	import com.javafiles.databaseConnection;
	  
	@WebServlet("/print")
	public class dbconfig extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	  
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException
	    {
	    	try {
	  
	            // Initialize the database
	            Connection con = databaseConnection.initializeDatabase();
	            Statement stmt = null;
	            stmt = con.createStatement();
	            
	  
	            
	            // Create a SQL query to insert data into demo table
	            // demo table consists of two columns, so two '?' is used
//	            PreparedStatement st = con
//	                   .prepareStatement("insert into demo values(?, ?)");
//	  
	            // For the first parameter,
	            // get the data using request object
	            // sets the data to st pointer
	  //          st.setInt(1, Integer.valueOf(request.getParameter("id")));
	  
	            // Same for second parameter
	  //          st.setString(2, request.getParameter("string"));
	  
	            // Execute the insert command using executeUpdate()
	            // to make changes in database
	  //          st.executeUpdate();
	  
	            // Close all the connections
	//            st.close();
	  
	            ResultSet resset = null;
	            resset=stmt.executeQuery("select * from roomdetails");
	            
	            PrintWriter out = response.getWriter();

	            // Get a writer pointer 
	            // to display the successful result
	            while(resset.next()) {
//	            out.println("<html><body><b>Successfully Inserted"
//	                        + "</b></body></html>");
	            	 String roomid = resset.getString("roomnumber");
	                 String roomname = resset.getString("roomtype");
	                 out.println(roomid+"-"+roomname+"<br>");
	            }
	            con.close();
	            	  
	    	}
	  
	    	catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
