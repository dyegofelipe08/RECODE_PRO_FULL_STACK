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

Consultar Funcion�rio <br>

<form action="ControleConsultarFuncionario" method="post">
	Digite a matricula do funcion�rio: <input type="text" name="txtMatricula"><br>
	
	<input type="submit" value="Enviar">
	<input type="reset" value="Cancelar">
	</form>



<br><a href="index.jsp" >Home</a><br>

</body>
</html>