package ListaAula01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
//	Fazer um programa para calcular a �rea de um ret�ngulo. A f�rmula �: area = base * altura.
//    Os valores devem ser digitados pelo usu�rio, bem como deve ser informado o que 
//    ele ir� digitar.
		
		Scanner leia = new Scanner (System.in);
		float area, base, altura;
		
		System.out.print("Digite o valor da base do ret�ngulo (cm): ");
		base = leia.nextFloat();
		System.out.print("Digite o valor da altura do ret�ngulo (cm): ");
		altura = leia.nextFloat();
		area = base * altura;
		System.out.println();
		System.out.printf("A �rea do ret�ngulo �: %.2f cm�",area);
		leia.close();
		
		
		
		
		


	}

}
