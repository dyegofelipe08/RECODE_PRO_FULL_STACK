package Lista03;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
//		Fazer um programa para preencher uma matriz de duas linhas e 3 colunas.
//		O usuário deverá digitar um número e será preciso verificar se aquele 
//		número existe em alguma posição da matriz.
		
		int [][] matriz = new int [2][3];
		
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Digite um valor para a linha "+(i + 1)+" e coluna "+(j + 1)+" da matriz.");
				matriz[i][j] = ler.nextInt();
					if (i==0 && j==0 && i==j) {
					System.out.println("Este é o primeiro elemnto da matriz... vamos em frente!");
				}else {
					
				}
			}
		}
		System.out.println("Sua matriz: ");
		System.out.println();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				
//				
//				
//			}
//		}
//		
		ler.close();
		

	}

}
