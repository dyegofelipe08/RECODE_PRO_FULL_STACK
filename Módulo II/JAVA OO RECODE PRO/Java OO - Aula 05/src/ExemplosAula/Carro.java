package ExemplosAula;

public class Carro {

	String chassi;
	String modelo;
	int qtdPortas;

	public void acelerar() {
		if (qtdPortas == 2) {
			System.out.println("Carro n�o pode passar dos 60 Km, pois possui " + qtdPortas + " portas!");
		} else if (qtdPortas == 4) {
			System.out.println("Carro n�o pode passar dos 110 Km, pois possui " + qtdPortas + " portas!");
		} else {
			System.out.println("Carro n�o pode passar dos 140 Km, pois possui " + qtdPortas + " portas!");
		}
		System.out.println("O Chassi deste ve�culo �: " + chassi);
		System.out.println("O modelo deste ve�culo �: " + modelo);
		System.out.println();
	}

	public void frear() {

	}

}
