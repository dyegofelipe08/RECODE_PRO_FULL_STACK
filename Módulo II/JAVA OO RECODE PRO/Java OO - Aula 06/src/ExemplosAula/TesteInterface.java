package ExemplosAula;

interface Animais{
	void som();
	void descansar();
}
class Porcos implements Animais{
	public void som () {
		System.out.println("wee wee");
	}
	public void descansar() {
		System.out.println("Zzzzzzz...");
		
	}
}

public class TesteInterface {

	public static void main(String[] args) {
		Porcos p = new Porcos ();
		p.descansar();
		p.som();

	}

}
