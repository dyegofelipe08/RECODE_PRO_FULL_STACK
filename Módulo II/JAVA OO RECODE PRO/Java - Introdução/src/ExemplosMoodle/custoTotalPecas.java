package ExemplosMoodle;
import java.util.Scanner;

public class custoTotalPecas {

	public static void main(String[] args) {
		
	//Atalho a = new Atalho();
		
		Scanner s = new Scanner (System.in);
		
		int continuar=0;
		double precoTotal=0;
		int i =10;
		int [] cod = new int [i];
		int [] qt = new int [i];
		double [] subTotal = new double [i];
		double [] precoItem = new double [i];
		int j = 0;
		
		
		do {
	
			System.out.println("Digite o c�digo do produto: ");
			cod[j]= s.nextInt();
			System.out.println("Digite o pre�o deste produto (R$): ");
			precoItem[j]= s.nextDouble();
			System.out.println("Digite a quantidade que voc� deseja deste produto: ");
			qt[j] = s.nextInt();
			subTotal[j] = precoItem[j] * qt [j];
			precoTotal = precoTotal + subTotal [j];
			i+=1;
			j+=1;
			System.out.println("Deseja continuar comprando? (1) - SIM / (2) - N�O");
			continuar = Atalho.lerInt();
		}while (continuar == 1);
		
		for (j=0;j<i; j++) {
			System.out.println("Produto: "+cod[j]);
			System.out.println("Pre�o unit�rio: "+precoItem[j]);
			System.out.println("Quantidade: "+qt[j]);
			System.out.println("Sub Total = "+subTotal[j]);
			System.out.println();
		}
		System.out.println("Pre�o TOTAL = "+precoTotal);
		

	}

}
