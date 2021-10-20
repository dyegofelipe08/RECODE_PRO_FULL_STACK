package Exercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
//		Vamos criar um c�digo Java que converta o total de uma compra internacional em d�lares (US$) 
//		para reais (R$). Iniciei duas vari�veis double �soma� e �total�, depois inicie uma vari�vel 
//		chamada quantidade do tipo int, essa vari�vel vai receber a quantidade de produtos comprados. 
//		Declare um Array(Vetor) que ir� receber os valores em d�lares das mercadorias, e armazenar a 
//		somat�ria das mercadorias na vari�vel soma, A vari�vel �total� deve receber o valor de �soma� 
//		convertido para reais (US$ 1,00 = R$ 5,18.). Inicie uma vari�vel String �mensagem� e atribua 
//		um valor de acordo com o resultado da verifica��o usando o operador tern�rio seguindo os condi��es: 
//		�total� maior que R$ 3000,00 � �Pagar� 20% de imposto�. �total� menor ou igual a R$ 3000,00 � �Isento 
//		de imposto�. Imprima no console o valor �total� da compra junto com a �mensagem�.

		double soma = 0, total = 0;
		int quant;
		
		System.out.println("================ CONVERS�O DE D�LAR PARA REAL===================");
		System.out.print("Quantos produtos tem sua compra? ");
		Scanner ler = new Scanner(System.in);
		int p = ler.nextInt();
		
		double[] valores = new double[p];
		for (int i = 0; i < valores.length; i++) {
			System.out.println(String.format("Digite o valor do %s� produto em d�lares ($):", i+1));
			valores[i] = ler.nextDouble();
			System.out.println("Digite a quantidade deste produto: ");
			quant = ler.nextInt();
			soma += (valores[i] * quant);
		
		}
		total = soma * 5.18;
		
		//DecimalFormat df = new DecimalFormat("#.##"); arredondamento utilziando a classe DecimalFormat
		//df.setRoundingMode(RoundingMode.UP); sa�da: df.format(total)
		
		BigDecimal bd = new BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN);// arredondamento utilizando a classe BigDecimal (melhor forma)
		
		String msg = (total > 3000) ? " - Pagar� 20% de imposto." : " - Isento de imposto.";

		System.out.println(String.format("Total da sua compra = R$ %s", bd.doubleValue()+msg));

		ler.close();

	}

}
