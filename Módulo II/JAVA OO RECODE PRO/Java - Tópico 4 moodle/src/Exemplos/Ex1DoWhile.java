package Exemplos;

import java.util.Scanner;

public class Ex1DoWhile {

	public static void main(String[] args) {

		double n1, n2;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		n1 = ler.nextDouble();
		System.out.print("Digite o segundo valor: ");
		n2 = ler.nextDouble();
		if (n2 == 0) {
			do {
				System.out.println("O segundo valor não pode ser ZERO. Digite outro valor: ");
				n2 = ler.nextDouble();
			} while (n2 == 0);
		}

		System.out.println("O resultado da operação é: " + (n1 / n2));

		ler.close();

	}

}
