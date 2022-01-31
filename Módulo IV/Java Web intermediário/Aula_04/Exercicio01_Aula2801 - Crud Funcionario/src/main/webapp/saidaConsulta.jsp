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

Dados do funcionário: <br><br>

<% Funcionario funcionario = (Funcionario) request.getAttribute("dadosFuncionario"); %> 

Nome do funcionário: <%=funcionario.getNome() %><br>
ID do funcionário: <%=funcionario.getId() %><br>
Matrícula do funcionário: <%=funcionario.getMatricula() %><br>
Salário Bruto: R$ <%=funcionario.getSalarioBruto()%><br>
Taxa do INSS: <%= funcionario.getTaxaINSS()*100 %> % <br><br>
SALÁRIO LÍQUIDO: R$ <%=funcionario.getSalarioLiquido()%><br>


</body>
</html>