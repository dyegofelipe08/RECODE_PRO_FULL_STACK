package AgenciaViagem;

public class Destino {
	
	
	private String local;
	private double preco;
	private int dias;
	
	
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
		
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public double PrecoTotal() {
		return this.dias * this.preco;
	}
	
	

}
