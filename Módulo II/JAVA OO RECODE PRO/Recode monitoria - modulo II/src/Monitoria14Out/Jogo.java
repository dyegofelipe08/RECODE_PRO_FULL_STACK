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

		show.println("Ol�! Qual � o seu nome?");
		String nome = read.nextLine();
		show.println(nome + ", prazer em conhec�-lo!");
		show.println("Voc� quer jogar comigo?");
		show.println("\nInforme o n�mero da sua op��o. \n1 -> SIM \n2 -> N�O");
		opcao = read.nextInt();

		while ((opcao != 1) && (opcao != 2)) {
			System.out.print("Op��o inv�lida! Digite 1 para jogar ou 2:");
			opcao = read.nextInt();
		}
				
		if (opcao == 1) {
			show.println("Ok. O jogo � assim...");
			show.println("Eu vou escolher um n�mero entre 0 e 10...");
			show.println("Mas n�o vou falar pra voc� qual foi...");
			show.println("Se voc� acertar qual foi o n�mero, ser� o vencedor!!!");

			escolhaComputador = gerador.nextInt(11);

			show.println("Pronto. J� escolhi. Agora � a sua vez. Tente advinhar!");

			do {
				show.println("Digite um n�mero entre 0 e 10: ");
				escolhaUsuario = read.nextInt();
				tentativas = tentativas +1;
				if (escolhaUsuario != escolhaComputador) {
					System.out.println("Resposta errada!");
				} else if (tentativas == 1) {
					System.out.println("Uau! Parb�ns! Voc� acertou na "+tentativas+"� tentativa!");
				}else {
					System.out.println("Parb�ns! Voc� acertou com "+tentativas+" tentativas!");
				}
				
			} while (escolhaUsuario != escolhaComputador);

			read.close();
		} else {
			System.out.println("Que pena! Mas, tudo bem. Fica para a pr�xima!");

		}

	}

}
