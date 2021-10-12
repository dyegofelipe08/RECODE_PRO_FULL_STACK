package Exemplos;

import java.sql.SQLException;

public class ExTryCatch02 {

	public static void main(String[] args) {
		
		try {
			
			int [] vetor = {1,2,3,4};
			System.out.println(vetor[10]);
//			Conta c = new Conta ();
//			c.deposita(100);
		}catch(Throwable e) {
			System.out.println("O índice não existe.");
		}
//		catch(IllegalArgumentException e1) {
//			System.out.println("Houve uma ILLegalArgumentException ao depositar");
//		}catch (SQLException e) {
//			System.out.println("Houve um SQLException ao depositar.");
//			}

	}

}
