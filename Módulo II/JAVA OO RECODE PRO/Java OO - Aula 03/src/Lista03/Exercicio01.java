package Lista03;

import java.util.Scanner;

public class Exercicio01 {

	//Fazer um programa para preencher um vetor de 10 posi??es. O vetor s? poder? receber n?meros pares. 

	public static void main(String[] args) {
		
		int numero [] = new int [10];
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0;i<numero.length;i++) {
			System.out.print("Digite um valor inteiro:");
			 int aux = ler.nextInt();
			 if (aux%2==0) {
				 numero[i] = aux;
			 }else {
				 do {
					 System.out.print("O vetor s? aceita n?meros pares. Digite outro valor: ");
					 aux = ler.nextInt();
				 }while(aux%2!=0);
				 numero[i]= aux;
				 } 
		}
		ler.close();
		
		for (int i = 0;i<numero.length;i++) {
			System.out.print(numero[i]+" ");
		}
		
	}

}
