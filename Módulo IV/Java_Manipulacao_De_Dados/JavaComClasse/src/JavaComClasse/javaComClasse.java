package JavaComClasse;

import java.util.Scanner;

public class javaComClasse {

	public static void main(String[] args) {

//		Produto prod = new Produto(001, "Lápis",1.00);
//		
//		System.out.println(prod);

		Scanner s = new Scanner(System.in);
//		Produto prod2 = new Produto();
//		
//		System.out.print("Digite o código do produto: ");
//		prod2.setCod(Integer.parseInt(s.nextLine()));
//		System.out.print("Digite a descrição do produto: ");
//		prod2.setDesc(s.nextLine());
//		System.out.print("Digite o preço do produto: ");
//		prod2.setPreco(Double.parseDouble(s.nextLine()));

//		System.out.println(prod2.toString());

		Cliente cli = new Cliente();
		Produto prod = new Produto();
		int qtdCli = 0;
		int qtdProd = 0;

		boolean teste = true;

		while (teste == true) {

			System.out.println("Deseja cadastrar Cliente(Digite 1) ou Produto(Digite 2)?");
			int op = Integer.parseInt(s.nextLine());

			if (op == 1) {

				System.out.print("Digite o código do cliente: ");
				cli.setCod(Integer.parseInt(s.nextLine()));
				System.out.print("Digite o nome do cliente: ");
				cli.setNome(s.nextLine());
				System.out.print("Digite o telefone do cliente: ");
				cli.setTel(s.nextLine());
				System.out.print("Digite o endereço do cliente: ");
				cli.setEnd(s.nextLine());
				System.out.print("Informe a data de hoje: ");
				cli.setDataCadastro(s.nextLine());
				qtdCli++;
				System.out.println(cli.toString());

			} else {
				System.out.println("Digite o código do produto: ");
				prod.setCod(Integer.parseInt(s.nextLine()));
				System.out.println("Digite a descrição do produto: ");
				prod.setDesc(s.nextLine());
				System.out.println("Digite o preço do produto: ");
				prod.setPreco(Double.parseDouble(s.nextLine()));
				qtdProd++;
				System.out.println(prod.toString());
			}

			System.out.println("Deseja cadastrar mais algum cliente ou produto ? (1 - sim) / (2- Não)");
			op = Integer.parseInt(s.nextLine());
			if (op == 1)
				teste = true;
			else
				teste = false;
		}

		System.out.println("Foram cadastrados " + qtdCli + " cliente(s) e " + qtdProd + " produto(s).");

	}

}
