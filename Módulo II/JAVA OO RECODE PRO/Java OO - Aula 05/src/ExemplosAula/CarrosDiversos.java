package ExemplosAula;

public class CarrosDiversos {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.chassi = "2FD89KDH455";
		carro1.modelo = "Ford";
		carro1.qtdPortas = 4;
		carro1.acelerar();
		
		
		Carro carro2 = new Carro();
		carro2.chassi = "4FD89KDH455";
		carro2.modelo = "Chevrolet";
		carro2.qtdPortas = 2;
		carro2.acelerar();
		
		Carro carro3 = new Carro();
		carro3.chassi = "5FD89KDH455";
		carro3.modelo = "Hyundai";
		carro3.qtdPortas = 5;
		carro3.acelerar();

	}

}
