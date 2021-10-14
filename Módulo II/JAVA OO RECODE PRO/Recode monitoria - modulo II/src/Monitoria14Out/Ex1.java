package Monitoria14Out;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
//		Escreva um programa para aprovar ou não o empréstimo bancário para a compra de uma casa. O programa
//		vai perguntar o valor da casa, o salário do comprador e em quantos anos ele vai pagar. Calcule o valor
//		da prestação mensal, sabendo que ela não pode exceder 30% do salário ou então o empréstimo será negado.
		
		double valorCasa, salarioComp, anosPagar;
		String nomeComp;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o nome do comprador: ");
		nomeComp = ler.next();
		System.out.print("Digite o salário do comprador(R$): ");
		salarioComp = ler.nextDouble();
		System.out.print("Digite o valor da casa(R$): ");
		valorCasa = ler.nextDouble();
		System.out.print("Digite em quantos anos ele irá pagar a casa: ");
		anosPagar = ler.nextDouble();
		
		ler.close();
		
		double prestacaoMensal = valorCasa/(anosPagar*12.0);
		double sugestao =valorCasa/(salarioComp*0.3*12.0);
		
		if (prestacaoMensal>(salarioComp*0.30)) {
			System.out.println(nomeComp+",infelizmente a prestação mensal no valor de R$"+prestacaoMensal+
			" excede o limite de 30% do seu salário, mas se você optar por pagar em "+sugestao+" anos ou mais, o empréstimo será aprovado.");
		}else {
			System.out.println("PARABÉNS, "+nomeComp+" seu empréstimo foi aprovado.");
			System.out.println("Você irá pagar: "+(anosPagar*12.0)+ " prestações de R$"+prestacaoMensal);
		}
		
		
		
	}

}
