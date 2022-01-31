package modelos.pessoal;

public class Funcionario extends Pessoa {

	private String matricula;
	private double salarioBruto, taxaINSS=0, salarioLiquido;
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getTaxaINSS() {
		
		if(salarioBruto <= 1212.00) taxaINSS =  0.075;
		else if((salarioBruto> 1212.00) && (salarioBruto <=2427.35)) taxaINSS =  0.09;
		else if ((salarioBruto> 2427.35) && (salarioBruto <= 3641.03)) taxaINSS =  0.12;
		else if ((salarioBruto> 3641.03) && (salarioBruto <= 7087.22)) taxaINSS =  0.14;
		else taxaINSS = 0;
		return taxaINSS;
		
		
	}
	public double getSalarioLiquido() {
		return salarioBruto - (salarioBruto * getTaxaINSS());
	}
	
	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	
	
	
	
	
	
}
