package modelos.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelos.pessoal.Produto;

public class DAOProduto {

	final String url = "jdbc:sqlserver://DESKTOP-JK73023\\SQLEXPRESS;databaseName=AulaJava2601;integratedSecurity=true";
	final String driverBanco = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String instrucao = null;
	Connection conexao = null;
	PreparedStatement pstm = null;

	public DAOProduto() throws Exception {
		conexao = DriverManager.getConnection(url);
	}

	public void incluir(Produto produto) throws Exception {
		instrucao = "insert into Produto (id, codigo,descricao) values (?,?,?)";
		
		pstm = conexao.prepareStatement(instrucao);
		pstm.setInt(1, produto.getId());
		pstm.setString(2, produto.getCodigo());
		pstm.setString(3, produto.getDescricao());
		
		pstm.executeUpdate();

	}

	public void excluir(Produto produto) {

	}

	public void alterar(Produto produto) {

	}

	public Produto consultar(Produto produto) {

		return null;
	}

}
