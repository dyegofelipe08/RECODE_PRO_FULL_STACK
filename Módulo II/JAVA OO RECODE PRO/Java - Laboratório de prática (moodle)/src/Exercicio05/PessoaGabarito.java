package Exercicio05;

import java.util.Scanner;

public class PessoaGabarito {
	
	private String nome;
	private int idade;
	
	public void setPessoa(Scanner entrada) {
		System.out.println("Digite o nome: ");
		this.nome = entrada.next();
		System.out.println("Digite a idade: ");
		this.idade = entrada.nextInt();
	}
	public String getNome() {
		return this.nome;
	}
	public int getIdade() {
		return this.idade;
	}

}
