package Exemplos;

import java.util.Scanner;

public class SwitchCaseEx1 {

	public static void main(String[] args) {
		
	

		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o nome do time: ");

		String  time = ler.next();

		ler.close();
		
		switch (time){
		case "Sport":
		case "Santa Cruz":
		case "Nautico":
			System.out.println("Times do estato de Pernambuco");
			break;
		case "Flamengo":
			System.out.println("Time do Rio de Janeiro");
			break;
		case "São Paulo":
		case "Santos":
			System.out.println("Time de São Paulo");
			break;
		default:
			System.out.println("Time de outro estado.");		
			
		}
		
		
		

	}

}
