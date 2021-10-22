package Lista03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
//		Fazer um programa para preencher dois vetores de 5 posições cada com números quaisquer. 
//		Na sequência, verificar quais número do primeiro vetor existem no segundo e informar no 
//		final do programa quantos números foram encontrados.
		
		int vet1 [] = new int [5];
		int vet2 [] = new int [5];
		int aux = 0;
		Scanner ler = new Scanner(System.in);
		
		for (int i =0;i<vet1.length;i++) {
	
			System.out.print("Digite um valor para a posição "+i+" do vetor 1: ");
			vet1[i] = ler.nextInt();
			System.out.print("Digite um valor para a posição "+i+" do vetor 2: ");
			vet2[i] = ler.nextInt();
			
		}
		for (int i = 0; i < vet2.length; i++) {
			for (int j = 0; j < vet2.length; j++) {
				if (vet1[i]==vet2[j]) {
					System.out.println("O número "+vet1[i]+" está contido nos dois vetores. "
							+ "Na posição "+i+" do primeiro vetor e "+j+" do segundo vevtor.");
					System.out.println();
					aux +=1;
				}
			}
			
		}
		System.out.println("Ao todo foram encontrados "+aux+" números de mesmo valor contido nos dois vetores.");
		
		ler.close();

	}

}
