<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
</head>
<body>
	<h1 align="center">Please register here</h1>
	<div>
		<form:form modelAttribute="userReg" action="processRegistration" method="GET">
			<label for="name">Name: </label>
			<form:input path="name" id="name" />
			<br>
			<br>

			<label for="user_name">User Name: </label>
			<form:input path="userName" id="user_name" />
			<br>
			<br>
			<label for="password">Password: </label>
			<form:password path="password" id="password" />
			<br>
			<br>

			<label for="country">Country: </label>
			<form:select path="country">
				<form:option value="Ind" label="India"></form:option>
				<form:option value="Usa" label="United States"></form:option>
				<form:option value="Pak" label="Pakistan"></form:option>
				<form:option value="Chn" label="China"></form:option>
			</form:select>
			<br>
			<br>

			<label for="hobbies">Hobbies: </label>
			<form:checkbox path="hobbies" value="Cricket" />Cricket 
			 <form:checkbox path="hobbies" value="Reading" />Reading
			 <form:checkbox path="hobbies" value="Travel" />Travel
			 <form:checkbox path="hobbies" value="Programming" />Programming
			<br>
			<br>

			<label for="gender">Gender: </label>
			<form:radiobutton path="gender" value="Male"/>Male
			<form:radiobutton path="gender" value="Female"/>Female

			<br><br>
			<input type="submit" value="Register">


		</form:form>
	</div>

</body>
</html>