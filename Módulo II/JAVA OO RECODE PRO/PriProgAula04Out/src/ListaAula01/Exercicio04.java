package ListaAula01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
//		Fazer um programa para calcular o consumo de um ve�culo conforme os dados 
//		informado no teclado: horas, velocidade m�dia.
//		F�rmulas:
//		distancia = horas * velmedia;
//		consumo = distancia / 12;

		
		Scanner leia = new Scanner (System.in);
		
		float horas, velMedia, consumo;
		
		System.out.print("Digite o tempo de tr�fego em horas: ");
		horas = leia.nextFloat();
		System.out.print("Digite a velocidade m�dia (Km/h): ");
		velMedia = leia.nextFloat();
		consumo = (velMedia * horas)/12;
		System.out.println();
		System.out.printf("O consumo do ve�culo foi de : %.2f",consumo); 
		leia.close();
		
		// a sa�da de dados seria em Km. N�o entendi  a rela��o com consumo. 
		
		
		
		

	}

}
