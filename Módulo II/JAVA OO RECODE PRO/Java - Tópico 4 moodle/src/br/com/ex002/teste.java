package br.com.ex002;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		double result;

		Scanner numero = new Scanner(System.in);

		System.out.println("Digite um número: ");
		double n1 = numero.nextInt();

		System.out.println("Digite outro número: ");
		double n2 = numero.nextInt();

		System.out.println("escolha uma operação aritmetica: ");
		String operacao = numero.next();
		numero.close();

		if (operacao.equals("+")) {

			result = n1 + n2;

			System.out.println("o resultado de " + n1 + "+" + n2 + "é: " + result);

		} else if (operacao.equals("*")){

			result = n1 * n2;

			System.out.println("o resultado de " + n1 + "*" + n2 + "é: " + result);

		} else if (operacao.equals("/")) {

			result = n1 / n2;

			System.out.println("o resultado de " + n1 + "/" + n2 + "é: " + result);

		} else if (operacao.equals("-")) {

			result = n1 - n2;

			System.out.println("o resultado de " + n1 + "-" + n2 + "é: " + result);

		} else
			System.out.println("você não digitou uma expressão aritmetica");
		

	}

}
