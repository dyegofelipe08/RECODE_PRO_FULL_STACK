package Lista02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
//		Para doar sangue é necessário ter idade maior que 20. Faça um programa que pergunte 
//		a idade de uma pessoa e exiba a informação se ela pode doar sangue ou não. 
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int  idade = ler.nextInt();
		ler.close();
		System.out.println((idade>20)? "Você já pode doar sangue.":"Infelizmente, você não pode doar sangue ainda.");
		

	}

}
