package br.com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public static Connection createConnectionSQLServer() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // Faz com que a classe seja carregada pela JVM

		// Cria a conexão com o banco de dados ----------------------- SEM senha
		Connection connection = DriverManager.getConnection(
				"jdbc:sqlserver://DESKTOP-JK73023\\SQLEXPRESS;instanceName=MSSQLSERVER;integratedSecurity=true;databaseName=CrudJava1801;");

		// Cria a conexão com o banco de dados ----------------------- COM senha
		// Connection connection = DriverManager.getConnection(
		// "jdbc:sqlserver://LAPTOP-1CT7LGRM;instanceName=MSSQLSERVER;databaseName=crud;",
		// "usuario", "senha");

		return connection;
	}

	public static void main(String[] args) throws Exception {
		// Recupera uma conexão com o banco de dados
		Connection con = createConnectionSQLServer();
		// Testa se a conexão é nula
		if (con != null) {
			System.out.println("Conexão obtida com sucesso! " + con);
			con.close();
		}
	}


}
