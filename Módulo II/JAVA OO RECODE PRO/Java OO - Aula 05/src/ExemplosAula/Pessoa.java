package ExemplosAula;

public class Pessoa {
	private String nome, endereco;
	private int idade;
	
	// recebe a informa��o da classe PessoaTeste
	public void setNome(String nome)
	{
	this.nome = nome;
	}

	// retorna a informa��o para a classe PessoaTeste
	public String getNome()
	{
	return nome;
	}
	public void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco () {
		return this.endereco;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}

}
