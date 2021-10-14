package Exemplos;

public class testeCaixa {

	public static void main(String[] args) {
		
		Caixa c1 = new Caixa();
		
		c1.depositar(1000);
		//c1.exibirSaldo();
		
		System.out.println(c1.exibirSaldo());
		

	}

}
