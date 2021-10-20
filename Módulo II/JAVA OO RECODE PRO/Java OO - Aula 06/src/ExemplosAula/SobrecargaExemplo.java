package ExemplosAula;

public class SobrecargaExemplo {

	public int calcula(int a, int b) {
		return a + b;
	}

	public double calcula(double a, double b) {
		return a + b;
	}

	public String calcula(String a, String b) {
		return a + b;
	}

	public static void main(String[] args) {

		SobrecargaExemplo calc = new SobrecargaExemplo();
		System.out.println(calc.calcula(2.5, 3.0));
		System.out.println(calc.calcula(1, 15));
		System.out.println(calc.calcula("Vi", "ram?"));

	}

}
