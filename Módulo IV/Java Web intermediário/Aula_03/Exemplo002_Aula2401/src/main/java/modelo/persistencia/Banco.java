package modelo.persistencia;

import java.util.HashMap;

import modelo.negocio.Aluno;

public class Banco {

	private HashMap<String, Aluno> tabelaAluno;
	private Aluno aluno;

	public Banco() {

		tabelaAluno = new HashMap<String, Aluno>();
		aluno = new Aluno();
		aluno.setMatricula("123");
		aluno.setNome("Dyego");

		tabelaAluno.put(aluno.getMatricula(), aluno);

		aluno = new Aluno();
		aluno.setMatricula("456");
		aluno.setNome("Prisciele");

		tabelaAluno.put(aluno.getMatricula(), aluno);
	}

	public HashMap<String, Aluno> getTabela() {
		return tabelaAluno;
	}

}
