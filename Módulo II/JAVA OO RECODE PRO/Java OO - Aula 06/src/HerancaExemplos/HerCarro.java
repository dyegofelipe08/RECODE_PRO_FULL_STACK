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
		
		System.out.println("O ve�culo �: "+meuCarro.nomModelo+ " a marca �: "+meuCarro.marca);
		
	}
	
}
