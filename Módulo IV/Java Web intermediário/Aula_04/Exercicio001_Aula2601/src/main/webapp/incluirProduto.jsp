<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="controle.produto" method="post">
	Digite o ID do produto: <input type="text" name="txtId"><br>
	Digite o c�digo do produto: <input type="text" name="txtCodigo"><br>
	Digite a descri��o do produto:: <input type="text" name="txtDescricao"><br>
	
	
	<input type="submit" value="Enviar">
	<input type="reset" value="Cancelar">
	</form>
	
	<br><a href="index.jsp">P�gina Principal</a>
</body>
</html>