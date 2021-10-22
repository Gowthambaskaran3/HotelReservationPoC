package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.databaseConnection;

public class bookingRoom extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res){
	try {
	Connection con = databaseConnection.initializeDatabase();
	Statement stmt = con.createStatement();
    HttpSession session = req.getSession();
    String userName = (String) session.getAttribute("username");
	LocalDate date= LocalDate.now();
    String bookingDate = date.toString();
	String startDate = req.getParameter("from");
	String endDate = req.getParameter("to");
    String room = req.getParameter("room");
	String available = "available";
	String book = "booked";
	System.out.println(bookingDate);
	System.out.println(startDate);
	System.out.println(endDate);
	ResultSet resSet = stmt.executeQuery("select * from roomdetails where roomtype ='"+ room +"' and availability = '"+ available +"'" );
	if(resSet.next()) {
		String roomNo = resSet.getString("roomnumber");
		String roomType = resSet.getString("roomtype");
		System.out.println(roomNo+" "+roomType);
		PreparedStatement ps = con.prepareStatement("update roomdetails set availability= ? where roomnumber = ? ");
		ps.setString(1, book);
		ps.setString(2, roomNo);
		ps.executeUpdate();
		PreparedStatement stmnt = con.prepareStatement("insert into bookingdetails(username,roomnumber,roomtype,bookingdate,startdate,enddate) values(?,?,?,?,?,?)");
		stmnt.setString(1, userName);
		stmnt.setString(2, roomNo);
		stmnt.setString(3, roomType);
		stmnt.setString(4, bookingDate);
		stmnt.setString(5, startDate);
		stmnt.setString(6, endDate);
		
		stmnt.executeUpdate();
		RequestDispatcher rd = req.getRequestDispatcher("userPage.jsp");
		rd.forward(req, res);		
	}	
	else {
	RequestDispatcher rd = req.getRequestDispatcher("booking.jsp");
	rd.forward(req, res);
	}
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
