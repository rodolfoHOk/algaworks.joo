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
	
	/* Palavras reservadas:
	 * 
	 * - não podemos usar as palavras reservadas para nomes de classe e nomes de métodos
	 */
	
	
	/* Convenções de código
	 * 
	 * - https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html
	 */
}
