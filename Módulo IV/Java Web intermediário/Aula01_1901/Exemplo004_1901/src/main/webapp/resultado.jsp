<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado - exemplo 4</title>
</head>
<body>

	<%
		String VarNome = (String)request.getAttribute("meuNome");
	%>
	
	Meu nome é: <% out.println(VarNome);%>

</body>
</html>