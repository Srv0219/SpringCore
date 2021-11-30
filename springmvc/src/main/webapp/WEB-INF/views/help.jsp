<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>
<h1>This is help page</h1>
<% 
/*  String name =(String) request.getAttribute("name"); */
%>
<h2>name is <%-- <%=name %> --%>${name}</h2>
<hr>
<c:forEach var="rolls" items="${roll}">
<h2>roles are ${rolls}</h2>
</c:forEach>

</body>
</html>