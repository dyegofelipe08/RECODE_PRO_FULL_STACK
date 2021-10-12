package Exemplos;

import java.util.Scanner;

public class Ex1While {

	public static void main(String[] args) {
		int numero, soma = 0, parada = 1;
		Scanner ler = new Scanner(System.in);

		while (parada == 1) {
			System.out.print("Digite um valor inteiro para realizar o somatório: ");
			numero = ler.nextInt();
			soma = soma + numero;
			System.out.print("Deseja continuar somando? (1) - SIM / (0) - NÂO ");
			parada = ler.nextInt();
			System.out.println();
			
		}
		ler.close();
		System.out.println("O somatório dos valores digitados é: "+soma);
	}

}

