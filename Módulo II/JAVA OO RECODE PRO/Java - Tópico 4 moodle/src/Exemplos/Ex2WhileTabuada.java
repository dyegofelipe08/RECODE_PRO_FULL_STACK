package Exemplos;

import java.util.Scanner;

public class Ex2WhileTabuada {

	public static void main(String[] args) {
	
		
		int valor, i=1, limite;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um valor para fazermos a tabuada dele para vc: ");
		valor= ler.nextInt();
		System.out.println("At� que valor voc� deseja calcular?: ");
		limite = ler.nextInt();
		
		while(i<=limite){
			System.out.println(i+" x "+valor+" = "+(i*valor));
			i+=1;
		}
		ler.close();
		}

	}


