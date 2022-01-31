package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;

import controles.alunos.ControleAluno;
import modelo.pessoal.Aluno;

public class DAOAluno {

	private final String url = "jdbc:sqlserver://DESKTOP-JK73023\\SQLEXPRESS;databaseName=AulaJava2601;integratedSecurity=true";
	private final String driverBanco = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private Connection conexao = null;
	PreparedStatement preparedStatement = null;

	public DAOAluno() throws Exception {
		Class.forName(driverBanco);
		conexao = DriverManager.getConnection(url);
	}

	public void incluir(Aluno aluno) {

		final String instrucao = "INSERT INTO Alunos (Id, Matricula, Nome, Teste, Prova) VALUES (?,?,?,?,?)";

		try {
			
			preparedStatement = conexao.prepareStatement(instrucao);

			preparedStatement.setInt(1, aluno.getId());
			preparedStatement.setString(2, aluno.getMatricula());
			preparedStatement.setString(3, aluno.getNome());
			preparedStatement.setDouble(4, aluno.getTeste());
			preparedStatement.setDouble(5, aluno.getProva());

			preparedStatement.executeUpdate();

			System.out.println("conexão ok");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	public void excluir(Aluno aluno) {

	}

	public void alterar(Aluno aluno) {

	}

	public Aluno consultar(Aluno aluno) {
		return null;
	}

}
