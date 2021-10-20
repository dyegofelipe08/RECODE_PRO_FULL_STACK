package ExemplosAula;

import java.util.Scanner;

public class PessoaTeste {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Pessoa objeto = new Pessoa();
	
		System.out.print("Digite o nome: ");
		String nome = ler.next();
		objeto.setNome(nome);
		
		System.out.print("Digite o endereço: ");
		String endereco = ler.next();
		objeto.setEndereco(endereco);
		
		System.out.print("Digite a idade: ");
		int idade = ler.nextInt();
		objeto.setIdade(idade);

		System.out.println("Nome: " + objeto.getNome() + "\nEndereço: " + objeto.getEndereco() + "\nIdade: "
				+ objeto.getIdade() + " anos.");
		ler.close();
	}

}
