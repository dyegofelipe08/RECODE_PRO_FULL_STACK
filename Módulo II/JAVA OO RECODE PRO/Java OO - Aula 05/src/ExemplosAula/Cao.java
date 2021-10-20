package ExemplosAula;

public class Cao {
	int tamanho;
	String nome;

	void latir() { // cria o método latir()
		if (tamanho > 60)
			System.out.println("Wooof, Wooof!");
		else if (tamanho > 14)
			System.out.println("Ruff!, Ruff!");
		else
			System.out.println("Yip!, Yip!");
	}
}
