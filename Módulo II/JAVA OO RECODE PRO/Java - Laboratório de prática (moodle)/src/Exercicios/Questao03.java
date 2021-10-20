package Exercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
//		Vamos criar um código Java que converta o total de uma compra internacional em dólares (US$) 
//		para reais (R$). Iniciei duas variáveis double “soma” e “total”, depois inicie uma variável 
//		chamada quantidade do tipo int, essa variável vai receber a quantidade de produtos comprados. 
//		Declare um Array(Vetor) que irá receber os valores em dólares das mercadorias, e armazenar a 
//		somatória das mercadorias na variável soma, A variável “total” deve receber o valor de “soma” 
//		convertido para reais (US$ 1,00 = R$ 5,18.). Inicie uma variável String “mensagem” e atribua 
//		um valor de acordo com o resultado da verificação usando o operador ternário seguindo os condições: 
//		“total” maior que R$ 3000,00 – “Pagará 20% de imposto”. “total” menor ou igual a R$ 3000,00 – “Isento 
//		de imposto”. Imprima no console o valor “total” da compra junto com a “mensagem”.

		double soma = 0, total = 0;
		int quant;
		
		System.out.println("================ CONVERSÃO DE DÓLAR PARA REAL===================");
		System.out.print("Quantos produtos tem sua compra? ");
		Scanner ler = new Scanner(System.in);
		int p = ler.nextInt();
		
		double[] valores = new double[p];
		for (int i = 0; i < valores.length; i++) {
			System.out.println(String.format("Digite o valor do %sº produto em dólares ($):", i+1));
			valores[i] = ler.nextDouble();
			System.out.println("Digite a quantidade deste produto: ");
			quant = ler.nextInt();
			soma += (valores[i] * quant);
		
		}
		total = soma * 5.18;
		
		//DecimalFormat df = new DecimalFormat("#.##"); arredondamento utilziando a classe DecimalFormat
		//df.setRoundingMode(RoundingMode.UP); saída: df.format(total)
		
		BigDecimal bd = new BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN);// arredondamento utilizando a classe BigDecimal (melhor forma)
		
		String msg = (total > 3000) ? " - Pagará 20% de imposto." : " - Isento de imposto.";

		System.out.println(String.format("Total da sua compra = R$ %s", bd.doubleValue()+msg));

		ler.close();

	}

}
