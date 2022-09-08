package poo.parte1;

public class Principal7 {

	public static void main(String[] args) {
	
		// double preco = 100;
		
		Preco preco = new Preco();
		preco.valorCustos = 150;
		
		Produto produto1 = new Produto();
		
		// produto1.definirPreco(preco); 
		// acima não funciona pois quando passamos valores primitivos é feita uma cópia
		
		produto1.definirPreco(preco, 20, 10); 
		// acima funciona pois quando passamos um objeto passamos uma referência a ele
		
		// System.out.println("Preço venda: " + preco);
		
		System.out.println("Valor custos: " + preco.valorCustos);
		System.out.println("Valor impostos: " + preco.valorImpostos);
		System.out.println("Valor lucro: " + preco.valorLucro);
		System.out.println("Preço venda: " + preco.precoVenda);
		
	}
	
}
