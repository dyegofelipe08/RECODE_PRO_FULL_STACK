import java.util.Date;

import br.com.crud.dao.ContatoDAO;
import br.com.crud.model.Contato;

public class TesteCrud {

	public static void main(String[] args) {

		ContatoDAO contatoDAO = new ContatoDAO();

//		Contato contato = new Contato();
//
//		contato.setNome("Dyego");
//		contato.setIdade(28);
//		contato.setDataCadastro(new Date());

//		contatoDAO.save(contato);
//		
//		
//		System.out.println("Inserido com sucesso!");

		Contato contato1 = new Contato();

		contato1.setId(3);
		contato1.setNome("Dyego Felipe");
		contato1.setIdade(28);
		contato1.setDataCadastro(new Date());

		contatoDAO.update(contato1);
		System.out.println("Atualizado com sucesso!");

//		contatoDAO.removeByID(1);

//		System.out.println("Removido com sucesso!");

		for (Contato c : contatoDAO.getContatos()) {

			System.out.println("NOME: " + c.getNome());

		}

	}

}
