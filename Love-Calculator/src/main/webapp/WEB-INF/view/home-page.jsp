<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>

<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 20px;
}
</style>

<script type="text/javascript">
	function validateUserName() {
		var userName = document.getElementById("your_name").value;
		if (userName.length < 2) {
			alert("Your name should have atleast two characters");
			return false;
		} else {
			return true;
		}

	}
</script>
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
				<form:errors path="userName" cssClass="error"></form:errors>
			</p>

			<p>
				<label for="crush_name">Crush Name: </label>
				<form:input id="crush_name" path="crushName"></form:input>
				<form:errors path="crushName" cssClass="error"></form:errors>
			</p>

			<p>
				<form:checkbox path="termAndConditions" id="check" />
				<label for="check">I am agreeing that this is for
					fun</label>
				<form:errors path="termAndConditions" cssClass="error"></form:errors>

			</p>

			<input type="submit" value="Calculate">

		</div>
	</form:form>

</body>
</html>