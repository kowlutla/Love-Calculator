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
	<h1 align="center">Love Calculator</h1>

	<hr>

	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo">
		<div align="center">
			<p>
				<label for="your_name">Your Name: </label>
				<form:input id="your_name" path="userName"></form:input>
			</p>

			<p>
				<label for="crush_name">Crush Name: </label>
				<form:input id="crush_name" path="crushName"></form:input>
			</p>

			<input type="submit" value="Calculate">

		</div>
	</form:form>

</body>
</html>