package JavaComClasse;

public class Cliente extends Pessoa {
	
	private String dataCadastro;

	

	@Override
	public String toString() {
		return "\nInformções de cadstro -> [Data de Cadastro" + dataCadastro + ", " + super.toString() + ", getCod()=" + getCod()
				+ ", getNome()=" + getNome() + ", getTel()=" + getTel() + ", getEnd()=" + getEnd() + "]\n";
	}


	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	

}
