<%@page import="Modelos.Funcionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet">
</head>
<body>

<h1>Dados do funcion�rio cadastrado</h1> <br>


<%
 Funcionario func = (Funcionario) request.getAttribute("objFuncionario");
%>



Nome: <%= func.getNome() %><br><br>
Matr�cula: <%= func.getMatricula() %><br><br>
Sal�rio l�quido: <%= func.getSalarioLiquido() %><br><br>


</body>
</html>