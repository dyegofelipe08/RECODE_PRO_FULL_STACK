package Exercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaExeGabarito {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		ArrayList<String> nomes = new ArrayList<>();
		ArrayList<Integer> idades = new ArrayList<>();
		
		PessoaGabarito p1 = new PessoaGabarito();
		p1.setPessoa(entrada);
		nomes.add(p1.getNome());
		idades.add(p1.getIdade());
		
		PessoaGabarito p2 = new PessoaGabarito();
		p2.setPessoa(entrada);
		nomes.add(p2.getNome());
		idades.add(p2.getIdade());
		
		PessoaGabarito p3 = new PessoaGabarito();
		p3.setPessoa(entrada);
		nomes.add(p3.getNome());
		idades.add(p3.getIdade());
		
		String velho = null;
		int maior = 0;
		
		for (int i = 0; i < nomes.size(); i++) {
			if (idades.get(i)>maior) {
				maior = idades.get(i);
				velho = nomes.get(i);
			}
		}
		System.out.println("A pessoa mais velha é: "+velho+" com "+maior+" anos de idade.");
	}

}
