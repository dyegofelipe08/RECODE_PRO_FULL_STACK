package Exercicios;

public class Pessoa {
	
	String nome;
	int idade;
	
	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade=idade;
	}
	
	public void votar () {
		if (this.idade>=18) System.out.println("Voc� j� � obrigado a votar");
		else System.out.println("Voc� ainda n�o � obrigado a votar");
	}

}
