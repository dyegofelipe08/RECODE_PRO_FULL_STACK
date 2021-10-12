package PriProg;
import java.util.Scanner;
public class ExercicioNum1 {

	public static void main(String[] args) {
//		Fazer um programa para que o usuário possa digitar um nome, uma idade e 
//		um salário, na sequência exibir na tela as informações digitadas.
		
		
		String nome;
		int idade;
		float salario;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o nome: ");
		nome = leia.next();
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		System.out.print("Digite o salário ");
		salario = leia.nextFloat();
		System.out.println();
		
		System.out.println("O nome é: "+nome);
		System.out.println("A idade é: "+idade);
		System.out.printf("O salário é: R$ %.2f", salario);
		leia.close();
	
		
		
				
		
		

	}

}
