package Lista03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
//		Fazer um programa para preencher dois vetores de 5 posi��es cada com n�meros quaisquer. 
//		Na sequ�ncia, verificar quais n�mero do primeiro vetor existem no segundo e informar no 
//		final do programa quantos n�meros foram encontrados.
		
		int vet1 [] = new int [5];
		int vet2 [] = new int [5];
		int aux = 0;
		Scanner ler = new Scanner(System.in);
		
		for (int i =0;i<vet1.length;i++) {
	
			System.out.print("Digite um valor para o vetor 1: ");
			vet1[i] = ler.nextInt();
			System.out.print("Digite um valor para o vetor 2: ");
			vet2[i] = ler.nextInt();
			
			
		}
		ler.close();

	}

}
