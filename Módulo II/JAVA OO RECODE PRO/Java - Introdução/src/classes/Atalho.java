package classes;
import java.util.Scanner;
public class Atalho {
	
	
	public static int lerInt () {
		
		Scanner s = new Scanner (System.in);
		
		return s.nextInt();
	}
	public static double lerDouble () {
		
		Scanner s = new Scanner (System.in);
		
		return s.nextDouble();
	}
	public static String lerString() {
		Scanner s = new Scanner (System.in);
		return s.next();
	}

}
