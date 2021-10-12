package ListaAula01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
//		Fazer um programa para exibir o saldo com reajuste de 1%.
//		O usuário deverá informar via teclado o valor do saldo.
		
		Scanner leia = new Scanner (System.in);
		
		float saldo, novoSaldo;
		
		System.out.print("Digite o saldo R$: ");
		saldo=leia.nextFloat();
		novoSaldo = saldo * 1.01f;
		System.out.println();
		System.out.printf("O saldo atualizado é: R$ %.2f",novoSaldo);
		leia.close();
		
		

	}

}
