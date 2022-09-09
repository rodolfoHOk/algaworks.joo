package wrappers_boxing_arrays;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o Total de produtos: ");
		int quantidadeDeProdutos = entrada.nextInt();
		entrada.nextLine();
		
		Estoque estoque = new Estoque();
		estoque.produtos = new Produto[quantidadeDeProdutos];
		
		for (int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto();
			
			System.out.println("\nProduto " + i);
			System.out.println("________________________");
			
			System.out.println("Descrição:");
			estoque.produtos[i].descricao = entrada.nextLine();
			
			System.out.println("Quantidade de items:");
			estoque.produtos[i].quantidade = entrada.nextInt();
			entrada.nextLine();
		}
		
		estoque.listarProdutos();
		
		System.out.println("Total de items no estoque: " + estoque.totalDeItems);
		
	}
	
}
