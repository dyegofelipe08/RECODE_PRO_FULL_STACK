package br.com.crud.model;
import java.util.Date;

public class Aluno {
	
	private int Id_aluno;
	private String nome;
	private Date Data_cadastro;
	
	public int getId_aluno() {
		return Id_aluno;
	}
	public void setId_aluno(int id_aluno) {
		Id_aluno = id_aluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData_cadastro() {
		return Data_cadastro;
	}
	public void setData_cadastro(Date data_cadastro) {
		Data_cadastro = data_cadastro;
	}
	
	
}

