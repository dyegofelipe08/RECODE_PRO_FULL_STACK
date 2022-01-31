<%@page import="modelo.pessoal.Funcionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<% Funcionario funcionario = (Funcionario) request.getAttribute("func"); %>
Matrícula: <%= funcionario.getMatricula() %>
Nome: <%= funcionario.getNome() %>
Salario Bruto: <%= funcionario.getSalarioBruto() %>
</body>
</html>