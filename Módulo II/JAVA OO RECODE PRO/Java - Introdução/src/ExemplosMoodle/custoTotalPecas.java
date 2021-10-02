package ExemplosMoodle;

import java.util.Scanner;

public class custoTotalPecas {

	public static void main(String[] args) {

		// Atalho a = new Atalho();

		// Scanner s = new Scanner (System.in);

		
		int i = 1;
		int[] cod = new int[i];
		int[] qt = new int[i];
		double[] subTotal = new double[i];
		double[] precoItem = new double[i];
		int continuar = 0;
		double precoTotal = 0;
	

		do {
			int j = 0;
			System.out.println("Digite o código do produto: ");
			cod[j] = Atalho.lerInt();
			System.out.println("Digite o preço deste produto (R$): ");
			precoItem[j] = Atalho.lerDouble();
			System.out.println("Digite a quantidade que você deseja deste produto: ");
			qt[j] = Atalho.lerInt();
			subTotal[j] = precoItem[j] * qt[j];
			precoTotal = precoTotal + subTotal[j];
			j += 1;
	
			System.out.println("Deseja continuar comprando? (1) - SIM / (2) - NÂO");
			continuar = Atalho.lerInt();
			if ((continuar != 1) && (continuar != 2)) {
				do {
					System.out.println("Opção inválida!");
					System.out.println("Deseja continuar comprando? (1) - SIM / (2) - NÂO");
					continuar = Atalho.lerInt();
				} while ((continuar != 1) && (continuar != 2));
			}
		} while (continuar == 1);

		for (int j = 0; j < qt.length; j++) {
			System.out.println("Produto: " + cod[j]);
			System.out.println("Preço unitário: " + precoItem[j]);
			System.out.println("Quantidade: " + qt[j]);
			System.out.println("Sub Total = " + subTotal[j]);
			System.out.println();
		}
		System.out.println("Preço TOTAL = " + precoTotal);

	}

}
