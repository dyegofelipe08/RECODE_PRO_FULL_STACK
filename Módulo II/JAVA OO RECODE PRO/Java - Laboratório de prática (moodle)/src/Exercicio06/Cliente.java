package Exercicio06;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Cliente {
	DecimalFormat df = new DecimalFormat("#,###.00");
	private static int codigo;
	private String nome;
	private String cpf;
	private ArrayList<String> produtos = new ArrayList<>();
	private ArrayList<Double> precoProdutos = new ArrayList<>();
	private int codigoPedido;
	private double totalPedido;

	public Cliente(String nome, String cpf) {
		Cliente.codigo++;
		this.codigoPedido = Cliente.codigo;
		this.nome = nome;
		this.cpf = cpf;
	}
	public void addProdutos(String descricao, double preco) {
		this.produtos.add(descricao);
		this.precoProdutos.add(preco);
	}
	public void resumoPedido() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("==================== ORÇAMENTO Nº "+this.codigoPedido+" ==========================");
		System.out.println("NOME: "+this.nome);
		System.out.println("CPF: "+this.cpf);
		System.out.println("--------------------------------------------------------------");
		
		for (int i = 0; i < produtos.size(); i++) {
			this.totalPedido+=precoProdutos.get(i);
			System.out.println((i+1) + " - produto: "+produtos.get(i));
			System.out.println("    Preço: R$ " +precoProdutos.get(i));
			System.out.println("-------------------------------------------------------------");
			
		}
		System.out.println("==============================================================");
		System.out.println("TOTAL DO PEDIDO: R$ "+ df.format(this.totalPedido));
		
	}

}
