package AgenciaViagem;

public class Cliente {
	
	private String nome;
	private String cpf;
	private Destino destino;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	public Destino getDestino() {
		return destino;
	}

}
