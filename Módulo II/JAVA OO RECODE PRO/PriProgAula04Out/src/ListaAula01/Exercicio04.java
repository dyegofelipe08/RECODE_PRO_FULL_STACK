package ListaAula01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
//		Fazer um programa para calcular o consumo de um veículo conforme os dados 
//		informado no teclado: horas, velocidade média.
//		Fórmulas:
//		distancia = horas * velmedia;
//		consumo = distancia / 12;

		
		Scanner leia = new Scanner (System.in);
		
		float horas, velMedia, consumo;
		
		System.out.print("Digite o tempo de tráfego em horas: ");
		horas = leia.nextFloat();
		System.out.print("Digite a velocidade média (Km/h): ");
		velMedia = leia.nextFloat();
		consumo = (velMedia * horas)/12;
		System.out.println();
		System.out.printf("O consumo do veículo foi de : %.2f",consumo); 
		leia.close();
		
		// a saída de dados seria em Km. Não entendi  a relação com consumo. 
		
		
		
		

	}

}
