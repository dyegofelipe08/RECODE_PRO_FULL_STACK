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

Incluir Funcion�rio<br><br> 

<form action="inclusao.funcionario" method="post">
	Digite o ID do funcion�rio: <input type="text" name="txtId"><br>
	Digite a matricula do funcion�rio: <input type="text" name="txtMatricula"><br>
	Digite o nome do funcion�rio: <input type="text" name="txtNome"><br>
	Digite o sal�rio bruto do funcion�rio: <input type="text" name="txtSalarioBruto"><br>

	<input type="submit" value="Enviar">
	<input type="reset" value="Cancelar">
	</form>



<br><a href="index.jsp" >Home</a><br>
</body>
</html>