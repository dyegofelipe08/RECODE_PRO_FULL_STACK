package Lista03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
//		Fazer um programa para exibir o somat�rio dos n�meros informados, 
//		da m�dia dos n�meros informados (somar o valores e dividir pela quantidade 
//		de n�meros informados) e o quantos n�meros foram informados. O programa deve 
//		permitir a digita��o de n�meros enquanto o usu�rio estiver digitando valores positivos

		int cont = 0;
		double media, num, soma = 0;
		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("Este programa faz a soma e a m�dia dos valores digitados.");
			System.out.println("Ao final exibe na tela todos os resultados e quantos n�meros foram digitados.");
			System.out.println("Para finalizar, digite um valor menor que zero. Este n�o ser� computado. ");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.print("Digite algum n�mero: ");
			num = ler.nextInt();
			if (num>0) {
				soma += num;
				cont += 1;
			}
		} while (num > 0);
		media = soma / cont;
		System.out.println();
		System.out.println("QTD DE N�MEROS V�LIDOS INFORMADOS = " + cont);
		System.out.println("SOMA = " + soma);
		System.out.println("M�DIA = " + media);
		ler.close();

	}

}
