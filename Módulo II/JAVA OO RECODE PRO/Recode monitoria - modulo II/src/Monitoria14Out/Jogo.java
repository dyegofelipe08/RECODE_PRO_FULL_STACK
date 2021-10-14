package Monitoria14Out;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

public class Jogo {

	public static void main(String[] args) {

		PrintStream show = System.out;
		Scanner read = new Scanner(System.in);
		Random gerador = new Random();

		int opcao, escolhaComputador, escolhaUsuario, tentativas=0;

		show.println("Olá! Qual é o seu nome?");
		String nome = read.nextLine();
		show.println(nome + ", prazer em conhecê-lo!");
		show.println("Você quer jogar comigo?");
		show.println("\nInforme o número da sua opção. \n1 -> SIM \n2 -> NÃO");
		opcao = read.nextInt();

		while ((opcao != 1) && (opcao != 2)) {
			System.out.print("Opção inválida! Digite 1 para jogar ou 2:");
			opcao = read.nextInt();
		}
				
		if (opcao == 1) {
			show.println("Ok. O jogo é assim...");
			show.println("Eu vou escolher um número entre 0 e 10...");
			show.println("Mas não vou falar pra você qual foi...");
			show.println("Se você acertar qual foi o número, será o vencedor!!!");

			escolhaComputador = gerador.nextInt(11);

			show.println("Pronto. Já escolhi. Agora é a sua vez. Tente advinhar!");

			do {
				show.println("Digite um número entre 0 e 10: ");
				escolhaUsuario = read.nextInt();
				tentativas = tentativas +1;
				if (escolhaUsuario != escolhaComputador) {
					System.out.println("Resposta errada!");
				} else if (tentativas == 1) {
					System.out.println("Uau! Parbéns! Você acertou na "+tentativas+"ª tentativa!");
				}else {
					System.out.println("Parbéns! Você acertou com "+tentativas+" tentativas!");
				}
				
			} while (escolhaUsuario != escolhaComputador);

			read.close();
		} else {
			System.out.println("Que pena! Mas, tudo bem. Fica para a próxima!");

		}

	}

}
