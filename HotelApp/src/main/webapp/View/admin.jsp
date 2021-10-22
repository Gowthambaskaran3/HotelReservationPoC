<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<link rel="stylesheet" href="css/admin.css">
</head>
<body>
<h1>Booked Rooms</h1>
	<div class="sqlDB">
			<sql:setDataSource var="drivers" driver="com.mysql.jdbc.Driver"
				url="jdbc:mysql://localhost:3306/test" user="gowtham"
				password="gowvim@03" />
			<sql:query dataSource="${drivers}" var="result">
         SELECT * FROM testing.bookingdetails;
      </sql:query>

			<table class="table" border="1">
				<tr>
					<th>UserName</th>
					<th>RoomNumber</th>
					<th>RoomType</th>
					<th>BookingDate</th>
					<th>From</th>
					<th>To</th>
				</tr>

				<c:forEach var="row" items="${result.rows}">
					<tr>
						<td><c:out value="${row.username}"/></td> 
						<td><c:out value="${row.roomnumber}" /></td>
						<td><c:out value="${row.roomtype}" /></td>
						<td><c:out value="${row.bookingdate}" /></td>
						<td><c:out value="${row.startdate}" /></td>
						<td><c:out value="${row.enddate}" /></td>						
												
					</tr>
				</c:forEach>
			</table>
		</div>

</body>
</html>