package Exemplos;

import java.util.Scanner;

public class Ex1Array {

	public static void main(String[] args) {
//		Neste exemplo, devem ser armazenados o nome e o sal?rio de 5 funcion?rios. 
//		Ap?s o cadastro destas informa??es, dever? ser digitado o ?ndice de reajuste salarial para todos os funcion?rios. 
//		O programa dever? calcular o novo sal?rio e exibir todos os dados na tela.

		String[] nome = new String[5];
		double [] salario = new double[5];
		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < nome.length; i++) {
			System.out.print("Digite o nome do funcion?rio: ");
			nome[i] = ler.next();
			System.out.print("Digite o sal?rio deste funcion?rio (R$): ");
			salario[i] = ler.nextFloat();
		}

		System.out.println("Digite a taxa de reajuste a ser aplicada ao sal?rio de todos os funcion?rio (%): ");
		double taxa = ler.nextDouble();
		double ajuste = (taxa / 100) + 1;

		for (int i = 0; i < nome.length; i++) {
			System.out.println("NOME DO FUNCION?RIO: " + nome[i]);
			System.out.println("SAL?RIO: R$ "+ salario[i]);
			System.out.println("SAL?RIO ATUALIZADO: R$ "+ salario[i] * ajuste);
			System.out.println();
		}

		ler.close();
	}

}
