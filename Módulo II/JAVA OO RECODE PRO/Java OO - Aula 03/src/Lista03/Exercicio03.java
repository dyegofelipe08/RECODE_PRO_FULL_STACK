package Lista03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
//		Fazer um programa para que o usu�rio informe um n�mero e a tabuada daquele 
//		valor seja calculada e exibida na tela. As multiplica��es come�am no valor 1 
//		at� o valor 9. O n�mero informado pelo usu�rio n�o pode ser zero e nem negativo. 
//		Exemplo: 2 x 1 = 2

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um n�mero para informamos a tabuada do mesmo: ");
		int num = ler.nextInt();

		while ((num <= 0) || (num > 9)) {
			System.out.print("N�mero inv�lido para a opera��o proposta. Digite um n�mero entre 1 e 9: ");
			num = ler.nextInt();
		}

		for (int i = 1; i <= 9; i++) {
			System.out.println(i + " x " + num + " = " + (i * num));
		}

		ler.close();
	}

}
