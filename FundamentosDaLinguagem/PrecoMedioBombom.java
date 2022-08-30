public class PrecoMedioBombom {

	public static void main(String[] args) {
	
		// preços das últimas 3 vendas realizadas
		int preco1 = 5;
		int preco2 = 8;
		int preco3 = 12;
		
		int mediaPrecos = (preco1 + preco2 + preco3) / 3;
		
		System.out.println("\n\"Sistema de Cálculo de Média\"\n");
		System.out.println("Preço 1: " + preco1);
		System.out.println("Preço 2: " + preco2);
		System.out.println("Preço 3: " + preco3);
		System.out.println("\nMédia dos preços: " + mediaPrecos + "\n");
		
	}

}
