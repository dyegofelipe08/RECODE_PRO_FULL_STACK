package Modelos;

public class Funcionario {
	
	String nome, matricula;
	double salario_bruto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalario_bruto() {
		return salario_bruto;
	}
	public void setSalario_bruto(double salario_bruto) {
		this.salario_bruto = salario_bruto;
	}
	
	public  double getSalarioLiquido() {
		
		return salario_bruto - (salario_bruto*0.11);
	}
	
	
	

}
