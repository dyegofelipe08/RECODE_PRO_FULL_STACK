package Lista02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
//		Fazer um programa para que o usuário digite um número e o programa verifique se os números estão entre o intervalo de 
//		valores de 10 e 20. Exibir mensagem se está ou não entre o intervalo de valores.

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número inteiro qualquer: ");
		int num = ler.nextInt();
		ler.close();
		if ((num >= 10) && (num <= 20))
			System.out.println("O número está entre o intervalo  de 10 e 20");
		else
			System.out.println("O número está fora do intervalo de 10 e 20.");

	}

}
