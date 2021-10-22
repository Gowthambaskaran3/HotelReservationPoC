<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/booking.css" rel="stylesheet"/>
<title>Booking</title>
</head>
<body>
<h1>Booking Your Room</h1>
<form action="book" method="post">
From
<input type="date" name="from" placeholder="from" required/><br>
To
<input type="date" name="to" placeholder="to" required/><br><br>
<input type="radio" name="room" value="singleroom"/>Single Room<br>
<input type="radio" name="room" value="doubleroom"/>Double Room<br>
<input type="radio" name="room" value="deluxeroom"/>Deluxe Room<br>
<input type="radio" name="room" value="studio"/>Studio<br>
<input type="radio" name="room" value="suite"/>Suite<br>
<input type="submit" value="Book"/> 
</form>
</body>
</html>