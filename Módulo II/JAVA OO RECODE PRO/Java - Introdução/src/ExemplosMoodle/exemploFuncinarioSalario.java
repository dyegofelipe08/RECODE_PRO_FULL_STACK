package ExemplosMoodle;

import java.util.Scanner;

public class exemploFuncinarioSalario {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int codigo;
		double horas,valorHora,salario;
		
		System.out.print("Digite o código do funcionário: ");
		codigo = s.nextInt();
		System.out.print("Digite o valor da hora do funcionário (R$) "+ codigo+ ":");
		valorHora = s.nextDouble();
		System.out.print("Digite a quantidade de horas/dia trabalhadas pelo do funcionário "+ codigo+ ":");
		horas = s.nextDouble();
		
		salario = horas * valorHora * 30;
		
		System.out.println("FUNCIONÁRIO: "+codigo);
		System.out.println();
		System.out.printf("SALÁRIO = R$ %.2f%n",salario);
		s.close();
		

	}

}
