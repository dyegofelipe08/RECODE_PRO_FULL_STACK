package Exemplos;

import java.util.Scanner;

public class SwitchCaseEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print("Em que ano o Brasil foi tetra campe�o? ");
		Scanner ler = new Scanner(System.in);

		int  ano = ler.nextInt();
		
		ler.close();
		
		
		switch (ano) {
		case 1994: 
			System.out.println("Parab�ns! Voc� acertou!");
			break;
		default:
			System.out.println("Voc� errou!");
		}

	}

}
