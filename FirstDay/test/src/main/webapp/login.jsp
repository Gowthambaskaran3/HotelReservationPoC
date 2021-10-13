<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css2?family=Lora&display=swap" rel="stylesheet">
<link rel="stylesheet" href="loginpage.css">
</head>
<body class="container">
<h5><b>LOGIN PAGE</b></h5>
<form action="./print" method="post">
User Name		<br><input type="text" name="userName"/><br>
Password		<br><input type="password" name="password"/><br>
<button type="submit">Login</button>
</form>
</body>
</html>