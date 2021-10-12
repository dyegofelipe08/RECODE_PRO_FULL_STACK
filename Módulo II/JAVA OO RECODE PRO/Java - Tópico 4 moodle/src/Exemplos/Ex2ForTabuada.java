package Exemplos;

import java.util.Scanner;

public class Ex2ForTabuada {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um valor inteiro para visualizar a tabuada do mesmo: ");
		int  valor = ler.nextInt();
		System.out.print("Você que ver a tabuada deste valor até quanto?: ");		
		int  limite = ler.nextInt();
		int mult = 0;
		ler.close();
		
		for (int i=1;i<=limite;i++) {
			mult = valor * i;
			System.out.println(valor+" x "+i+" = "+mult);
		}
	}

}
