package desktop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) {
		
		final String url = "jdbc:sqlserver://DESKTOP-JK73023\\SQLEXPRESS;databaseName=AulaJava2601;integratedSecurity=true";
		final String driverBanco = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		final String instrucao_select = "SELECT * FROM pessoa";
		
		
		try {
			
			Connection conexao = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_select);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				int id = resultSet.getInt("Id");
				String nome = resultSet.getString("Nome");
				
				System.out.println("ID: "+id+ " - NOME: "+nome);
				
			}
			
			
			
			
			System.out.println("conexão ok");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
