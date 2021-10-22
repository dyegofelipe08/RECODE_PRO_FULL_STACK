package Lista03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
//		Fazer um programa para que o usuário informe um número e a tabuada daquele 
//		valor seja calculada e exibida na tela. As multiplicações começam no valor 1 
//		até o valor 9. O número informado pelo usuário não pode ser zero e nem negativo. 
//		Exemplo: 2 x 1 = 2

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número para informamos a tabuada do mesmo: ");
		int num = ler.nextInt();

		while ((num <= 0) || (num > 9)) {
			System.out.print("Número inválido para a operação proposta. Digite um número entre 1 e 9: ");
			num = ler.nextInt();
		}

		for (int i = 1; i <= 9; i++) {
			System.out.println(i + " x " + num + " = " + (i * num));
		}

		ler.close();
	}

}
