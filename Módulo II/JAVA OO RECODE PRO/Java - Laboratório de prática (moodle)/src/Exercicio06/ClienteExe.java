package Exercicio06;

import java.util.Scanner;

public class ClienteExe {

	public static void main(String[] args) {

		String nome, cpf, descricao;
		double preco;
		int qtdProdutos;
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("=================== INCLUIR PEDIDO ==========================");
		System.out.print("Digite seu nome: ");
		nome = s.nextLine();
		System.out.print("Digite seu CPF: ");
		cpf = s.next();
		
		
		Cliente cliente = new Cliente (nome, cpf);
		
		System.out.print("Quantidade de produtos do pedido: ");
		qtdProdutos = s.nextInt();
		
		for (int i = 1; i <= qtdProdutos; i++) {
			System.out.print("Informe a descrição do produto "+i+" :");
			descricao = s.next();
			descricao += s.nextLine();
			System.out.print("Informe o preço deste produto: R$ ");
			preco = s.nextDouble();
			cliente.addProdutos(descricao, preco);			
		}
		cliente.resumoPedido();
		

	}

}
