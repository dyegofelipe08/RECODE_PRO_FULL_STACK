package JavaComClasse;

public class Produto {
	
	private int cod;
	private String desc;
	private double preco;
	
	public Produto() {
		
	}

	public Produto(int cod, String desc, double preco) {
		super();
		this.cod = cod;
		this.desc = desc;
		this.preco = preco;
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Informações do produto: [Código: " + cod + ", Descrição: " + desc + ", Preco = R$" + preco + "]";
	}
	
	

}
