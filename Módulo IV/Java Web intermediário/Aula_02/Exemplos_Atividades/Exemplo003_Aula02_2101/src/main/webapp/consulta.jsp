<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page import="modelos.Aluno"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%        
	Aluno aluno = (Aluno) request.getAttribute("objAluno");
	
	%>

	Nome: <%= aluno.getNome()%><br>
	Teste: <%= aluno.getTeste() %><br>
	Prova: <%= aluno.getProva()%><br>
	M�dia: <%=aluno.getMedia() %><br>
	

</body>
</html>