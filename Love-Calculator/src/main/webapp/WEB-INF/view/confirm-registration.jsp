
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
</head>
<body>
	<h1>Registration Successfully Done!!!</h1>
	<hr>
	
	<h2>User Details are: </h2>
	<p>Name: ${ userReg.name}</p>
	<p>User Name: ${ userReg.userName}</p>
	<p>Password: ${userReg.password }</p>
	<p>Country: ${ userReg.country}</p>
	<p>Gender: ${ userReg.gender}</p>
	<p>Hobbies: 
		<c:forEach var="hobbie" items="${userReg.hobbies }">
			${hobbie }
		</c:forEach>
	
	</p>
	<br>
	<p>Email: ${userReg.communicationDTO.email}</p>
	<p>Phone: ${userReg.communicationDTO.phone}</p>
	<p>Age: ${userReg.age }</p> 
</body>
</html>