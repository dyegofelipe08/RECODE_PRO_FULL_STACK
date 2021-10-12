package Exemplos;

public class ExTryCatch01 {

	public static void main(String[] args) {
		
		try {
			int [] numeros = {1,2,3,4,5,6,7,8,9,10,11};
			System.out.println(numeros[10]);
		}catch (Exception erroArray){
			System.out.println("Algo deu errado!");
		}finally {
			System.out.println("O try catch terminou.");
		}

	}

}
