package JavaComClasse;

public class Pessoa {
	
	private int cod;
	private String nome;
	private String tel;
	private String end;
	@Override
	public String toString() {
		return " [Código: " + cod + ", \nNome: " + nome + ", Telefone: " + tel + ", Endereço: =" + end + "]";
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	
	
	

}
