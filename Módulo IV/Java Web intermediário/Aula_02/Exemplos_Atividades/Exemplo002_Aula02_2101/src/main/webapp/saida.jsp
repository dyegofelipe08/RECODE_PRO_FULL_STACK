<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String nomeTela = (String) request.getAttribute("nome"); %>

Seja bem-vindo, <%=nomeTela %>

</body>
</html>