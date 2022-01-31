package desktop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Principal {

	public static void main(String[] args) {
		
		final String url = "jdbc:sqlserver://DESKTOP-JK73023\\SQLEXPRESS;databaseName=AulaJava2601;integratedSecurity=true";
		final String driverBanco = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		final String instrucao_Insert = "INSERT INTO pessoa (Nome) VALUES (?)";
		
		
		try {
			
			Connection conexao = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_Insert);
			preparedStatement.setString(1, "Prisciele");
			
			preparedStatement.executeUpdate();
			
			System.out.println("conexão ok");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
