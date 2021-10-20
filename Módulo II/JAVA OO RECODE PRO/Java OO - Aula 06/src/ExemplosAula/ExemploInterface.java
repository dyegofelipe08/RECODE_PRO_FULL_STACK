package ExemplosAula;

	interface AnimalInter {
		public void emitirSom();
		public void dormir();
	}

	class Porca implements AnimalInter {

		public void emitirSom() {
			System.out.println("Wee wee");
		}
		public void dormir() {
			System.out.println("zzzzzzzzz");
		}
	}
	
	public class ExemploInterface {

	public static void main(String[] args) {

		Porca p = new Porca();
		p.emitirSom();
		p.dormir();

	}

}
