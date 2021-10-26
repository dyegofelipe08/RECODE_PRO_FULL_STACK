package Exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Animal a1 = new Animal ();
		a1.setAnimal(entrada);
		Animal a2 = new Animal ();
		a2.setAnimal(entrada);
		Animal a3 = new Animal ();
		a3.setAnimal(entrada);
		
		System.out.println(String.format("Tipos dos seus animais: %s, %s e %s ", a1.getTipo(),a2.getTipo(), a3.getTipo()));
		System.out.println("Ao todo foram informados "+Animal.getContador()+" animais.");
	}

}
