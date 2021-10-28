package AgenciaViagem;

public class Main {

	public static void main(String[] args) {
		
		
		Destino d1 = new Destino();
		d1.setLocal("Porto de Galinhas,PE.");
		d1.setPreco(500.00);
		d1.setDias(5);
		
		Destino d2 = new Destino();
		d2.setLocal("Fernando de Noronha, PE.");
		d2.setPreco(1000.00);
		d2.setDias(10);

		Cliente c1 = new Cliente();
		c1.setNome("Falano da Silva");
		c1.setCpf("123.456.789-10");
		c1.setDestino(d1);
		
		Cliente c2 = new Cliente();
		c2.setNome("Beltrano de Oliveira");
		c2.setCpf("999.999.999-99");
		c2.setDestino(d2);
		
		
		System.out.println("------------------ RESUMO--------------------------");
		System.out.println("- CLIENTE 1: "+c1.getNome());
		System.out.println("- CPF: "+c1.getCpf());
		System.out.println("- DESTINO: "+c1.getDestino().getLocal());
		System.out.println("- DIÁRIAS: "+c1.getDestino().getDias());
		System.out.println();
		System.out.println("TOTAL A PAGAR: R$ "+c1.getDestino().PrecoTotal());
		System.out.println("---------------------------------------------------");
		
		System.out.println("- CLIENTE 2: "+c2.getNome());
		System.out.println("- CPF: "+c2.getCpf());
		System.out.println("- DESTINO : "+c2.getDestino().getLocal());
		System.out.println("- DIÁRIAS: "+c2.getDestino().getDias());
		System.out.println();
		System.out.println("TOTAL A PAGAR: R$ "+c2.getDestino().PrecoTotal());
		
		
		
		

	}

}
