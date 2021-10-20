package ExemplosAula;

public class CaoTeste {

	public static void main(String[] args) {
		Cao bob = new Cao(); // cria o objeto com base na classe CaoMetodo
		bob.tamanho = 70; // passa informações para o atributo do objeto

		Cao rex = new Cao(); // cria o objeto com base na classe CaoMetodo
		rex.tamanho = 8; // passa informações para o atributo do objeto

		Cao scooby = new Cao(); // cria o objeto com base na classe CaoMetodo
		scooby.tamanho = 35; // passa informações para o atributo do objeto

		bob.latir(); // Chama o método
		rex.latir(); // Chama o método
		scooby.latir(); // Chama o método
	}
}
