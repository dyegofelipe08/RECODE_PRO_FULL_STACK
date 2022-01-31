package modelos;

public class AlunoGraduacao extends Aluno {
	
	public double getMedia() {
		return (getTeste()+(getProva()*2))/3;
	}

}
