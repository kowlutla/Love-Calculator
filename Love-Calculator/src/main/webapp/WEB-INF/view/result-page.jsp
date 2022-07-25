<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>

	<br>
	
	<h2>The Love Calculate Predicts: </h2>
	<br>
	
	${userInfo.userName } and ${userInfo.crushName } are 
	FRIENDS
	<br>
	<br>
	
	<a href="/Love-Calculator/sendEmail">Send Results to Your Email</a>

</body>
</html>