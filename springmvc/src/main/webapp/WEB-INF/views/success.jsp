<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>Data from contact form</title>
</head>
<body>
	<div class="container">
		<h1 align="center"> Registration Data </h1>

		<%-- <% 

String email = (String)request.getAttribute("email");
String name = (String)request.getAttribute("name");
String pass = (String)request.getAttribute("pass");

%> --%>

		<p >Name : ${user.email}</p>
		<p>Email : ${user.username}</p>
		<p>Thankyou for registration</p>
	</div>

</body>
</html>