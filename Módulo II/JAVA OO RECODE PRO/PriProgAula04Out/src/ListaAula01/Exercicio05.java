package ListaAula01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
//		Fazer um programa para c�lculo de um sal�rio l�quido de um professor. 
//		Ser�o fornecidos valor da hora aula, n�mero de aulas dadas e o % de desconto do INSS.
//		F�rmula:
//		salario = valor da hora/aula * n�mero de aulas dadas;
//		desconto = salario * inss /100;
//		salario_liquido = salario � desconto;
		
		int qtdAulas;
		float valorHoraAula,salario,inss,desconto, salarioLiquido;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.print("Digite o valor da Hora/Aula do professor (R$): ");
		valorHoraAula = leia.nextFloat();
		System.out.print("Digite a quantidade de aulas dadas: ");
		qtdAulas = leia.nextInt();
		System.out.print("Digite o percentual do INSS: ");
		inss = leia.nextFloat();
		salario = valorHoraAula * (float)qtdAulas;
		desconto = salario *(inss/100);
		salarioLiquido = salario - desconto;
		System.out.println();
		System.out.printf("O sal�rio l�quido deste professor �: R$ %.2f",salarioLiquido);
		leia.close();
		
		
		
		
		


	}

}
