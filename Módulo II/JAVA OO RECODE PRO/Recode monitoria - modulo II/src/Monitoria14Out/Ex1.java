package Monitoria14Out;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
//		Escreva um programa para aprovar ou n�o o empr�stimo banc�rio para a compra de uma casa. O programa
//		vai perguntar o valor da casa, o sal�rio do comprador e em quantos anos ele vai pagar. Calcule o valor
//		da presta��o mensal, sabendo que ela n�o pode exceder 30% do sal�rio ou ent�o o empr�stimo ser� negado.
		
		double valorCasa, salarioComp, anosPagar;
		String nomeComp;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o nome do comprador: ");
		nomeComp = ler.next();
		System.out.print("Digite o sal�rio do comprador(R$): ");
		salarioComp = ler.nextDouble();
		System.out.print("Digite o valor da casa(R$): ");
		valorCasa = ler.nextDouble();
		System.out.print("Digite em quantos anos ele ir� pagar a casa: ");
		anosPagar = ler.nextDouble();
		
		ler.close();
		
		double prestacaoMensal = valorCasa/(anosPagar*12.0);
		double sugestao =valorCasa/(salarioComp*0.3*12.0);
		
		if (prestacaoMensal>(salarioComp*0.30)) {
			System.out.println(nomeComp+",infelizmente a presta��o mensal no valor de R$"+prestacaoMensal+
			" excede o limite de 30% do seu sal�rio, mas se voc� optar por pagar em "+sugestao+" anos ou mais, o empr�stimo ser� aprovado.");
		}else {
			System.out.println("PARAB�NS, "+nomeComp+" seu empr�stimo foi aprovado.");
			System.out.println("Voc� ir� pagar: "+(anosPagar*12.0)+ " presta��es de R$"+prestacaoMensal);
		}
		
		
		
	}

}
