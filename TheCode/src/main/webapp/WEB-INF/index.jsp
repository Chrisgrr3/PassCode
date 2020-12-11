<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Secret Code</title>
</head>
<body>

	<h2>What is the code?</h2>
	<br/>
	<p><c:out value="${error}"/></p>
	<form action="/guess" method="POST">
		<input type="text" name="guess"/>
		<button>Try Code</button>
	</form>
</body>
</html>