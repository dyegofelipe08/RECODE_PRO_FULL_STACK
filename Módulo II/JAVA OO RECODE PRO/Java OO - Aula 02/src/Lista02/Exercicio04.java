package Lista02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
//		Fazer um programa para que o usu?rio digite tr?s n?meros e o programa verifique quais n?meros s?o iguais
//		(podem ser iguais dois n?meros ou os tr?s). Exibir mensagem de quais n?meros s?o iguais.
		
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite tr?s n?meros inteiros: ");
		int  n1 = ler.nextInt();
		int  n2 = ler.nextInt();
		int  n3 = ler.nextInt();
		ler.close();
		if((n1==n2) && (n1==n3) && (n2==n3)) {
			System.out.println("Os n?meros: "+n1+", "+n2+" e "+n3+" s?o iguais.");
		}else if ((n1==n2) && (n1!=n3)) {
			System.out.println("O primeiro n?mero("+n1+") ? igual ao segundo ("+n2+").");
		}else if ((n1==n3) && (n1!=n2)) {
			System.out.println("O primeiro n?mero("+n1+") ? igual ao terceiro ("+n3+").");
		}else if(n2==n3) {
			System.out.println("O segundo n?mero("+n2+") ? igual ao terceiro ("+n3+").");
		}else {
			System.out.println("Os tr?s n?meros s?o diferentes! ");
		}
		
	}

}
