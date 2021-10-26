package Exercicio05;

import java.util.Scanner;

public class Pessoa {
	private String nome;
	private int idade;
	int aux = 1;
	String maior, menor;
	
	public void setNome(Scanner entrada) {
		System.out.println("Digite o nome da pessoa:");
		this.nome = entrada.next();
	}
	public String getNome() {
		return nome;
	}
	public void setIdade(Scanner entrada) {
		System.out.println("Digite a idade da pessoa:");
		this.idade = entrada.nextInt();
	}
	public int getIdade () {
		return idade;
	}
	

	
}
