package desktop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) {

		final String url = "jdbc:sqlserver://DESKTOP-JK73023\\SQLEXPRESS;databaseName=AulaJava2601;integratedSecurity=true";
		final String driverBanco = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		final String instrucao_delete = "DELETE FROM pessoa WHERE id = ?";

		try {

			Connection conexao = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_delete);
			preparedStatement.setInt(1, 2);

			preparedStatement.executeUpdate();
			System.out.println("conexão ok");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
