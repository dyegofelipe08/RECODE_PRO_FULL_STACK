package ExemplosMoodle;

import java.util.Scanner;

public class exemploFuncinarioSalario {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int codigo;
		double horas,valorHora,salario;
		
		System.out.print("Digite o c�digo do funcion�rio: ");
		codigo = s.nextInt();
		System.out.print("Digite o valor da hora do funcion�rio (R$) "+ codigo+ ":");
		valorHora = s.nextDouble();
		System.out.print("Digite a quantidade de horas/dia trabalhadas pelo do funcion�rio "+ codigo+ ":");
		horas = s.nextDouble();
		
		salario = horas * valorHora * 30;
		
		System.out.println("FUNCION�RIO: "+codigo);
		System.out.println();
		System.out.printf("SAL�RIO = R$ %.2f%n",salario);
		s.close();
		

	}

}
