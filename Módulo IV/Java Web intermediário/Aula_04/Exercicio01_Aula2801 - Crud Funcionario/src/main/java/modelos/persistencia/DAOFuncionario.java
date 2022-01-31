package modelos.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import modelos.pessoal.Funcionario;

public class DAOFuncionario {

	private Connection conexao = null;
	private PreparedStatement preparedStatement = null;

	public DAOFuncionario() throws Exception {
		conexao = BancoDados.getConexao();

	}

	public void incluir(Funcionario funcionario) throws Exception {

		final String instrucao_sql = "INSERT INTO Funcionarios (Id, Matricula, Nome, salarioBruto, salarioLiquido) VALUES (?, ?, ?, ?, ?) ";

		preparedStatement = conexao.prepareStatement(instrucao_sql);

		preparedStatement.setInt(1, funcionario.getId());
		preparedStatement.setString(2, funcionario.getMatricula());
		preparedStatement.setString(3, funcionario.getNome());
		preparedStatement.setDouble(4, funcionario.getSalarioBruto());
		preparedStatement.setDouble(5, funcionario.getSalarioLiquido());
		preparedStatement.executeUpdate();

	}

	public void excluir(Funcionario funcionario) throws Exception {

		final String instrucao_sql = "DELETE FROM Funcionarios WHERE Matricula=? ";

		preparedStatement = conexao.prepareStatement(instrucao_sql);
		preparedStatement.setString(1, funcionario.getMatricula());
		preparedStatement.executeUpdate();

	}

	public void alterar(Funcionario funcionario) throws Exception {
		
		final String instrucao_sql = "UPDATE Funcionarios set Id = ?, Nome = ?, SalarioBruto = ?, SalarioLiquido = ? WHERE Matricula = ?";

		preparedStatement = conexao.prepareStatement(instrucao_sql);

		preparedStatement.setInt(1, funcionario.getId());
		preparedStatement.setString(5, funcionario.getMatricula());
		preparedStatement.setString(2, funcionario.getNome());
		preparedStatement.setDouble(3, funcionario.getSalarioBruto());
		preparedStatement.setDouble(4, funcionario.getSalarioLiquido());
		preparedStatement.executeUpdate();
		


	}

	public Funcionario consultar(Funcionario funcionario) throws Exception {

		final String instrucao_sql = "SELECT * FROM Funcionarios WHERE Matricula = ?";

		preparedStatement = conexao.prepareStatement(instrucao_sql);
		preparedStatement.setString(1, funcionario.getMatricula());

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			funcionario.setId(resultSet.getInt("Id"));
			funcionario.setMatricula(resultSet.getString("Matricula"));
			funcionario.setNome(resultSet.getString("Nome"));
			funcionario.setSalarioBruto(resultSet.getDouble("salarioBruto"));
			funcionario.setSalarioLiquido(resultSet.getDouble("salarioLiquido"));
		}

		return funcionario;
	}

}
