<%@page import="modelos.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% Aluno aluno = (Aluno) request.getAttribute("al"); %> <br>
	Matricula: <%=aluno.getMatricula()  %><br>
	Teste: <%=aluno.getTeste() %><br>
	Prova: <%=aluno.getProva() %><br>
	M�dia: <%=aluno.getMedia() %><br>
</body>
</html>