package PriProg;
import java.util.Scanner;
public class ExercicioNum1 {

	public static void main(String[] args) {
//		Fazer um programa para que o usu�rio possa digitar um nome, uma idade e 
//		um sal�rio, na sequ�ncia exibir na tela as informa��es digitadas.
		
		
		String nome;
		int idade;
		float salario;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o nome: ");
		nome = leia.next();
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		System.out.print("Digite o sal�rio ");
		salario = leia.nextFloat();
		System.out.println();
		
		System.out.println("O nome �: "+nome);
		System.out.println("A idade �: "+idade);
		System.out.printf("O sal�rio �: R$ %.2f", salario);
		leia.close();
	
		
		
				
		
		

	}

}
