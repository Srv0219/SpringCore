<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<h1> This is home page</h1>
<h2>Called by controller</h1>
<h2>url /home</h1>
<%
 String name = (String)request.getAttribute("name");
%>

<h2>My Name is <%=name%></h1>
<%
ArrayList<String> arr =(ArrayList<String>)request.getAttribute("Friends"); 
%>

 <% 
 for(String s:arr){
 %>

<h2>My Friends are <%=s%></h2>

<%}%>
</body>
</html>