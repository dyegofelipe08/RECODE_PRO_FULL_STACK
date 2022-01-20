<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="style.css" rel="stylesheet">
<title>Resultado</title>
</head>
<body>
	<%
		String recode = (String)request.getAttribute("resultado");
	%>
	
	Bem-vindo à <% out.println(recode); %>
	
	
</body>
</html>