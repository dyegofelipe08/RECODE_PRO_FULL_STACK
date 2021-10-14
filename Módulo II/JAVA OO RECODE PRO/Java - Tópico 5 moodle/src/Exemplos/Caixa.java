package Exemplos;

public class Caixa {
	
	public double Saldo = 1000;
	
	void sacar (double quantia) {
		this.Saldo -=quantia;
	}
	void depositar (double quantia) {
		this.Saldo += quantia;
	}
	double exibirSaldo(){
		return this.Saldo;
	}

}
