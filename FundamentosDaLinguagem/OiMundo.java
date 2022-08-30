public class OiMundo {
	
	public static void main(String[] args) {
		/*
		Esta linha será ignorada pelo compilador
		System.out.println("essa instrução será ignorada");
		e essa também (Comentário em multiplas linhas)
		*/
		
		// A linha abaixo envia uma mensagem para o monitor (Comentário de única linha)
		System.out.println("Oi \"Mundo\"!"); // escape para imprimir aspas duplas [\"]
		System.out.println("Oi \\Mundo\\!"); // escape para imprimir barra invertiva [\\]
		System.out.println("Oi \nMundo!"); // escape para imprimir pular de linha [\n]
	}
	
	/* Compilando
	 * 
	 * - javac nome_do_arquivo.java
	 */
	 
	/* Rodar o programa
	 * 
	 * - java nome_do_arquivo
	 */
	
	/* Palavras reservadas
	 * 
	 * - não podemos usar as palavras reservadas para nomes de classes, métodos e variáveis.
	 */
	
	
	/* Convenções de código
	 * 
	 * - https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html
	 */
}
