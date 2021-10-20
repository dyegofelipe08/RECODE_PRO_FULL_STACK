package ExemplosAula;
//Aqui usas-se sobrescrita do polimorfismo
class Animal{
	public void somAnimal() {
		System.out.println("Os animais emitem sons diferentes.");
	}
}
class Porco extends Animal{
	public void somAnimal() {
		System.out.println("O porco emite o som: wee wee");// mudança do códico com reaproveitamnto.
	}
}

public class TesteAnimais {

	public static void main(String[] args) {
		Animal meuAnimal = new Animal();
		Porco meuporco = new Porco();
		meuAnimal.somAnimal();
		meuporco.somAnimal();

	}

}
