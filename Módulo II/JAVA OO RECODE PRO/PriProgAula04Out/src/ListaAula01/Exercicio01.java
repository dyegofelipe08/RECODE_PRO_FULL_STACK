package ListaAula01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
//	Fazer um programa para calcular a área de um retângulo. A fórmula é: area = base * altura.
//    Os valores devem ser digitados pelo usuário, bem como deve ser informado o que 
//    ele irá digitar.
		
		Scanner leia = new Scanner (System.in);
		float area, base, altura;
		
		System.out.print("Digite o valor da base do retângulo (cm): ");
		base = leia.nextFloat();
		System.out.print("Digite o valor da altura do retângulo (cm): ");
		altura = leia.nextFloat();
		area = base * altura;
		System.out.println();
		System.out.printf("A área do retângulo é: %.2f cm²",area);
		leia.close();
		
		
		
		
		


	}

}
