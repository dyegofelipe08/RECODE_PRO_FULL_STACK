<%@page import="modelos.pessoal.Funcionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file = "cabecalho.jsp"  %><br><br>

Dados do funcion�rio: <br><br>

<% Funcionario funcionario = (Funcionario) request.getAttribute("dadosFuncionario"); %> 

Nome do funcion�rio: <%=funcionario.getNome() %><br>
ID do funcion�rio: <%=funcionario.getId() %><br>
Matr�cula do funcion�rio: <%=funcionario.getMatricula() %><br>
Sal�rio Bruto: R$ <%=funcionario.getSalarioBruto()%><br>
Taxa do INSS: <%= funcionario.getTaxaINSS()*100 %> % <br><br>
SAL�RIO L�QUIDO: R$ <%=funcionario.getSalarioLiquido()%><br>


</body>
</html>