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

Faça as alteralções que deseja...<br><br>

<% Funcionario funcionario = (Funcionario) request.getAttribute("dadosFuncionario"); %> 

<form action="funcionario.alterar" method="post">
Matrícula do funcionário: <input type="text" name="txtMatricula" value="<%=funcionario.getMatricula()%>" ><br>
ID do funcionário: <input type="text" name="txtId" value="<%=funcionario.getId() %>" ><br>
Nome do funcionário: <input type="text" name="txtNome" value="<%=funcionario.getNome()%>" ><br>
Salário bruto (R$): <input type="text" name="txtSalarioBruto" value="<%=funcionario.getSalarioBruto()%>" ><br><br>

<input type="submit" value="Salvar Alterações">


</form>
<br><a href="index.jsp" ><button>Cancelar</button></a>

</body>
</html>