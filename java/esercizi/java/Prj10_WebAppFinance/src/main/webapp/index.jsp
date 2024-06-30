<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Intervallo</h1>
	
<% String test = "pippo"; %>
	
<ul>
	
<% for (int i=0; i<10; i++) { %>
	
	<li><%= test %></li>
	
<% } %>
	
</ul>
</body>
</html>