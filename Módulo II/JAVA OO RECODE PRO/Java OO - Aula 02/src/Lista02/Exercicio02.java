package Lista02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
//		Fa�a um programa onde o usu�rio ir� digitar um inteiro e exiba se o n�mero � par ou �mpar. 
//		Se for par, o n�mero dever� ser multiplicado por 4 e a informa��o dever� ser exibida.

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro qualquer: ");
		int num = ler.nextInt();
		ler.close();
		if (num % 2 == 0) {
			int par = num * 4;
			System.out.println("Voc� digitou o n�mero " + num
					+ " e ele � par. Por isso, ele foi multiplicado por 4, resultando em: " + par);
		} else {
			System.out.println("O n�mero " + num + " � impar!");
		}

	}

}
