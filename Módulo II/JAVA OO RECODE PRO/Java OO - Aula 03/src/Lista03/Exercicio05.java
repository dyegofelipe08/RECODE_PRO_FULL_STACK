package Lista03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

//		Fazer um programa para preencher com valores num�ricos uma matriz 3 x 3 e que 
//		em seguida exiba na tela os elementos que fazem parte da diagonal principal.
//		Diagonal Principal: 1, 2 e 5. S�o estes os n�meros a serem exibidos. 
//		Claro que o usu�rio poder� digitar outros n�meros.

		int[][] mat = new int[3][3];
		

		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print("Digite o elemento da posi��o linha:" + i + " coluna:" + j + " da matriz: ");
				mat[i][j] = ler.nextInt();

			}
		}
		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]+" ");
				}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (i == j) {
					System.out.println("O elemento " + mat[i][j] + " faz parte da diagonal principal da matriz.");
				}
				
			}
			
		}
		

		ler.close();


	}
}
