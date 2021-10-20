package ExemplosAula;

public class Carro {
	private String cor, modelo;
	private double preco;
	
	public Carro (String modelo, double preco) {
		this.cor = "PRETO";
		this.modelo = modelo;
		this.preco = preco;
		System.out.println("Informações do carro:\nModelo: "+modelo+" \nCor: "+cor+" \nPreço: R$"+preco);
		System.out.println();
		
	}
	public Carro (String cor, double preco, String modelo) {
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
		System.out.println("Informações do carro:\nModelo: "+modelo+" \nCor: "+cor+" \nPreço: R$"+preco);
		System.out.println();
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	

}
