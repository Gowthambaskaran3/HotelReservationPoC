<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css2?family=Lora&display=swap" rel="stylesheet">
<link rel="stylesheet" href="registerpage.css">

<title>Register Page</title>
</head>
<body class="container">
<h5><b>REGISTRATION PAGE</b></h5>
<form action="login.jsp">
First Name		<br><input type="text" placeholder="FirstName" name="firstName" required/><br>
Last Name		<br><input type="text" placeholder="LastName" name="lastName" required/><br>
User Name		<br><input type="text" placeholder="UserName" name="userName" required/><br>
Password		<br><input type="password" placeholder="Password" name="password" required/><br>
DOB				<br><input type="date" name="DoB" required/><br>
Mobile Number	<br><input type="number" placeholder="Mobile Number" name="mobileNo" required/><br>
Email 	        <br><input type="email" placeholder = "Email" name="email" required/><br><br>
<button type="submit">Register</button>
</form>
</body>
</html>