import java.util.Date;

import br.com.crud.dao.AlunoDAO;
import br.com.crud.model.Aluno;

public class teste {

	public static void main(String[] args) {
		AlunoDAO alunoDAO = new AlunoDAO();
		
		// Cria um contato e salva no banco
		Aluno aluno = new Aluno();
		aluno.setNome("Izadora");
		aluno.setData_cadastro(new Date());
		
		alunoDAO.save(aluno);
		
		// Atualiza o contato com id = 1 com os dados do objeto contato1
		/*Contato contato1 = new Contato();
		contato1.setId(1);
		contato1.setNome("Izadora");
		contato1.setIdade(25);
		contato1.setDataCadastro(new Date());
		
		contatoDAO.update(contato1);*/
		
		// Remove o contato com id = 1
		// contatoDAO.removeById(2);
		
		// Lista todos os contatos do banco de dados
		for (Aluno c : alunoDAO.getAlunos()) {
			System.out.println("Nome: " + c.getNome());
		}
	}
}