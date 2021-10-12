package Exemplos;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int soma = 0, valor = 0;

		for (int i = 0; i < 10; i++) {

			System.out.print("Digite um valor inteiro: ");
			valor = ler.nextInt();
			soma = soma + valor;
		}

		System.out.println("A soma dos valores digitadoe é: " + soma);
		ler.close();

	}

}
