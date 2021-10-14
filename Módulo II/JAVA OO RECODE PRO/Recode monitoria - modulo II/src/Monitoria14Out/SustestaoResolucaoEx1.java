package Monitoria14Out;

import java.util.Scanner;

public class SustestaoResolucaoEx1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.printf("Digite seu nome: ");
		String nome = read.next();
		System.out.printf("Digite seu salário: ");
		float salario = read.nextFloat();
		System.out.printf("Digite o tempo (anos) em que deseja pagar: ");
		float anosPag = read.nextFloat();
		System.out.printf("Digite o valor da casa: R$");
		float valorCs = read.nextFloat();
		read.close();

		float mesesPag = anosPag*12;
		float prestacao = valorCs/mesesPag;
		float anosMais = 0;

		if (prestacao < (0.3*salario)) {
		System.out.printf("\n%s, seu emprestimo foi APROVADO!\n"
		+ "A prestação mensal de R$%.2f é menor que 30%% do seu salário (R$%.2f)", nome, prestacao, salario*0.3);
		} else {
		System.out.printf("\n%s, seu emprestimo foi NEGADO!\n"
		+ "A prestação mensal de R$%.2f ultrapassa 30%% do seu salário (R$%.2f)", nome, prestacao, salario*0.3);
		while (prestacao > (0.3*salario)) {
		anosMais += 1;
		prestacao = (valorCs/((anosPag+anosMais)*12));
		}
		System.out.printf("\nPorém se você adicionar mais %.0f ano(s) de pagamento, a parcela passa a ser R$%.2f! Então você conseguirá pagar!", anosMais, prestacao);
		}
	}

}
