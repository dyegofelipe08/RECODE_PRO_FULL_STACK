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

Excluir Funcionário<br>

<form action="funcionario.exclusao" method="post">
	Digite a matricula do funcionário: <input type="text" name="txtMatricula"><br>
	
	<input type="submit" value="Enviar">
	<input type="reset" value="Cancelar">
	</form>



<br><a href="index.jsp" >Home</a><br>
</body>
</html>