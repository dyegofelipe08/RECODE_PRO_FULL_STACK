package ListaAula01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	
//		Fazer um programa para que o usu�rio informe uma temperatura em graus Celsius 
//		e transforme em graus Fahrenheit. Exibir o resultado da convers�o.
//		Formula: 
//		F = (9*C+160)/5
		
		Scanner leia = new Scanner (System.in);
		
		float tempCelsius;
		
		System.out.print("Digite a temperatura em graus Celsius: ");
		tempCelsius = leia.nextFloat();
		float tempFah = (9*tempCelsius+160)/5;
		System.out.println();
		System.out.printf("A temperatura em graus Fahrenheit �: %.1f F",tempFah);
		leia.close();
		
		
		
		


	}

}
