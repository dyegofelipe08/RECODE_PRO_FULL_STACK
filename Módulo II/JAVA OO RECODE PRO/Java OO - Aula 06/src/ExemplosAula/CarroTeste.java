package ExemplosAula;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro ("New Civic",40000);
		Carro c2 = new Carro ("Golf",38000,"Azul");
		
		c1.setCor("Verde");
		
		System.out.println(c1.getCor());
		
		

	}

}
