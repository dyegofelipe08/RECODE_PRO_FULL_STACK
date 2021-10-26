package Exercicio05;

import java.util.Scanner;

public class PessoaExe {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		Pessoa p1 = new Pessoa();
		p1.setNome(entrada);
		p1.setIdade(entrada);
		Pessoa p2 = new Pessoa();
		p2.setNome(entrada);
		p2.setIdade(entrada);
		Pessoa p3 = new Pessoa();
		p3.setNome(entrada);
		p3.setIdade(entrada);
		
	if ((p1.getIdade()>p2.getIdade()) && (p1.getIdade()>p3.getIdade())) {
		System.out.println("A pessoa mais velha é "+p1.getNome()+" com "+p1.getIdade()+" anos de idade.");
	}else if ((p2.getIdade()>p1.getIdade()) && (p2.getIdade()>p3.getIdade())) {
		System.out.println("A pessoa mais velha é "+p2.getNome()+" com "+p2.getIdade()+" anos de idade.");
	}else {
		System.out.println("A pessoa mais velha é "+p3.getNome()+" com "+p3.getIdade()+" anos de idade.");
		
	}

	}

}
