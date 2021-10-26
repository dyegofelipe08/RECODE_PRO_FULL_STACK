package Lista03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
//		Fazer um programa para exibir o somatório dos números informados, 
//		da média dos números informados (somar o valores e dividir pela quantidade 
//		de números informados) e o quantos números foram informados. O programa deve 
//		permitir a digitação de números enquanto o usuário estiver digitando valores positivos

		int cont = 0;
		double media, num, soma = 0;
		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("Este programa faz a soma e a média dos valores digitados.");
			System.out.println("Ao final exibe na tela todos os resultados e quantos números foram digitados.");
			System.out.println("Para finalizar, digite um valor menor que zero. Este não será computado. ");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.print("Digite algum número: ");
			num = ler.nextInt();
			if (num>0) {
				soma += num;
				cont += 1;
			}
		} while (num > 0);
		media = soma / cont;
		System.out.println();
		System.out.println("QTD DE NÚMEROS VÁLIDOS INFORMADOS = " + cont);
		System.out.println("SOMA = " + soma);
		System.out.println("MÉDIA = " + media);
		ler.close();

	}

}
