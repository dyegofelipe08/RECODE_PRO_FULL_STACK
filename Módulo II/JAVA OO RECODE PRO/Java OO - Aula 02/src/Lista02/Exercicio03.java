package Lista02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
//		Fazer um programa para que o usu�rio digite um n�mero e o programa verifique se os n�meros est�o entre o intervalo de 
//		valores de 10 e 20. Exibir mensagem se est� ou n�o entre o intervalo de valores.

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro qualquer: ");
		int num = ler.nextInt();
		ler.close();
		if ((num >= 10) && (num <= 20))
			System.out.println("O n�mero est� entre o intervalo  de 10 e 20");
		else
			System.out.println("O n�mero est� fora do intervalo de 10 e 20.");

	}

}
