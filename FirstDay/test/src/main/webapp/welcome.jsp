<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css2?family=Lora&display=swap" rel="stylesheet">
<link rel="stylesheet" href="welcomepage.css">
<title>Element INN</title>
</head>
<body class = "container">
<div class="title">
<h1>Element INN</h1>
</div>
<div class="register">
<form action="register.jsp">
New User: <button class="button" type="submit">
<div class = "buttontext">Register</div>
</button>
</form>
</div>
<div class = "login">
<form action="login.jsp">
Registered User:<button class="button" type="submit">
<div class = "buttontext">Login</div>
</button>
</form>
</div>
</body>
</html>