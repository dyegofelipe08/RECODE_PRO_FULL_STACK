package br.com.ex002;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		double result;

		Scanner numero = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		double n1 = numero.nextInt();

		System.out.println("Digite outro n�mero: ");
		double n2 = numero.nextInt();

		System.out.println("escolha uma opera��o aritmetica: ");
		String operacao = numero.next();
		numero.close();

		if (operacao.equals("+")) {

			result = n1 + n2;

			System.out.println("o resultado de " + n1 + "+" + n2 + "�: " + result);

		} else if (operacao.equals("*")){

			result = n1 * n2;

			System.out.println("o resultado de " + n1 + "*" + n2 + "�: " + result);

		} else if (operacao.equals("/")) {

			result = n1 / n2;

			System.out.println("o resultado de " + n1 + "/" + n2 + "�: " + result);

		} else if (operacao.equals("-")) {

			result = n1 - n2;

			System.out.println("o resultado de " + n1 + "-" + n2 + "�: " + result);

		} else
			System.out.println("voc� n�o digitou uma express�o aritmetica");
		

	}

}
