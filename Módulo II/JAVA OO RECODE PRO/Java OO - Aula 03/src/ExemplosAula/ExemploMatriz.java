package ExemplosAula;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		
		int matriz [][] = new int [3][3];
		Scanner ler = new Scanner(System.in);
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz.length;j++) {
				System.out.println("Digite um valor para o �ndice "+i+", "+j);
				matriz[i][j] = ler.nextInt();
			}
			
		}
		
		ler.close();
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
