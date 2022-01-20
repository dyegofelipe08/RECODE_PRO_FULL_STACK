package Aula1201;

import java.util.Scanner; //Importação da classe scanner

public class aula1201 {

	public static void main(String[] args) {
		
		float n1, n2, media;
		String aluno = null;
		
		Scanner s = new Scanner(System.in);
	
		int qtd = 0;
		int addAluno = 0;
		boolean teste = true;
		float somaNotas = 0;
		float mediaTotal = 0;
		
		while (teste == true) {
			System.out.print("Nome do aluno: ");
			aluno = s.next();
			System.out.print("Digite a primeira nota do aluno "+aluno+": ");
			n1 = s.nextFloat();
			System.out.print("Digite a segunda nota do aluno "+aluno+": ");
			
			n2 = s.nextFloat();
			media = (n1+n2)/2;
			if (media >= 7){
				System.out.println("Parabéns, "+aluno+"! Vc foi aprovado com média  = "+media);
			}
			else {
				System.out.println(aluno+", sua média é "+media+". Será necessário fazer a terceira avaliação.");
			}
			
			qtd++;
			somaNotas = n1+n2+somaNotas;
			
			System.out.println("Deseja cadastrar outro aluno? (1 - Sim / 2 - Não)");
			addAluno = s.nextInt();
			
			
			if (addAluno == 1) teste = true;
			else teste = false;
			
		}
		s.close();
		System.out.println("Foram cadastrados "+qtd+" alunos.");
		mediaTotal = somaNotas/(qtd*2);
		System.out.println("A média de todas as notas dos alunos é: "+mediaTotal);
	
		
		
		
		
		
		
		
		
		
		

	}

}
