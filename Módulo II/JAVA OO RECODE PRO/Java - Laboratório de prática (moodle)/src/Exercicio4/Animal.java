package Exercicio4;

import java.util.Scanner;

public class Animal {
	
	private static int contador;
	private String nome;
	private String tipo;
	
	public Animal(){
		Animal.contador++;
	}
	public static int getContador() {
		return contador;
	}
	public void setAnimal(Scanner entrada) {
		System.out.println("Informe o nome do animal: ");
		this.nome = entrada.next();
		System.out.println("Informe o tipo do animal: ");		
		this.tipo = entrada.next().toUpperCase();
		
		if ((!this.tipo.equals("CACHORRO")) && (!this.tipo.equals("GATO")) && (!this.tipo.equals("PEIXE"))) {
			this.tipo = "PEIXE";
		}
	}
	public String getNome() {
		return this.nome;
	}
	public String getTipo() {
		return this.tipo;
	}
	
	
	
}
