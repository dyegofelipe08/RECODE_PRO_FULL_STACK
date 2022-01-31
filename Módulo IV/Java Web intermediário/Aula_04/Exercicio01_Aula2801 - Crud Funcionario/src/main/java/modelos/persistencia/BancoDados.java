package modelos.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDados {
	
	private final static String url = "jdbc:sqlserver://DESKTOP-JK73023\\SQLEXPRESS;databaseName=AulaJava2801;integratedSecurity=true";
	private final static String driverBanco = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static Connection conexao = null;
	
	//Exemplo de implementação Singleton
	
	
	private BancoDados() {
		
	}
	
	
	private static void inicializarBanco() throws Exception {
		Class.forName(driverBanco);
		conexao = DriverManager.getConnection(url);
	}
	
	
	public static Connection getConexao() throws Exception {
		//no mercado é chamado de getInstance()
		
		if(conexao == null) {
			inicializarBanco();
		}
		
		return conexao;
	}

	
	
	
}
