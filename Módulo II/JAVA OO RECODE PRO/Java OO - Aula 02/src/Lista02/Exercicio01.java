package Lista02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
//		Para doar sangue � necess�rio ter idade maior que 20. Fa�a um programa que pergunte 
//		a idade de uma pessoa e exiba a informa��o se ela pode doar sangue ou n�o. 
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int  idade = ler.nextInt();
		ler.close();
		System.out.println((idade>20)? "Voc� j� pode doar sangue.":"Infelizmente, voc� n�o pode doar sangue ainda.");
		

	}

}
