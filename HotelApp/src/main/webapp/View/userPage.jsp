<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/userPage.css" rel="stylesheet"/>
<link href="https://fonts.googleapis.com/css2?family=Lora&display=swap" rel="stylesheet">
<title>Insert title here</title>
</head>
<%
String name=(String)session.getAttribute("username");
%>
<body>
<h1 style="text-align: center; color: white">Welcome <%= name %> to Element INN</h1>
<nav>
<ul class="topnav" id="dropdownclick">
<li class="titlelogo">Element<span>INN</span></li>
<li class="topnav-right"><a href="logout.jsp">Logout</a></li>
<li class="topnav-right"><a href="myBooking.jsp">My Bookings</a></li>
<li class="topnav-right"><a href="booking.jsp">Book Your Room</a></li>
</ul>
</nav>
<br>
<h1>About US</h1>
<p>
With its awe-inspiring size and grandeur, Element INN is a veritable destination unto itself. Located in the heart of Chennai. There are four separate entry points, each with its distinct artistic identity. The hotel welcomes guests in 522 rooms and 78 serviced apartments, each of which is a triumph of design aesthetics. The ten food and beverage outlets bring regional, national and global cuisines to the cognoscenti. It offers one of the largest conference, banqueting and exhibition spaces in the country.
</p>

</body>
</html>