package HerancaExemplos;

public class HerCarro {
	
	protected String marca = "Ford";
	
	public void fazerBarulho() {
		System.out.println("Brummmm Brummmmm");
	}

}
class Veiculo extends HerCarro{
	private String nomModelo = "New Fiesta";
	
public static void main(String[] args) {
		
		Veiculo meuCarro = new Veiculo();
		
		meuCarro.fazerBarulho();
		
		System.out.println("O veículo é: "+meuCarro.nomModelo+ " a marca é: "+meuCarro.marca);
		
	}
	
}
