public class ConversaoTipoPrimitivo {

	public static void main(String[] args) {
	
		long x = 10;
		//x = 9300000035L; // para teste valor que não entra em um int pra ver a perda
		
		// int y = x; // erro de compilação: possível perda de precisão
		// correto é fazer casting
		int y = (int) x; // estou assumindo o risco
		System.out.println(y);
		
		int y2 = 102344;
		long x2 = y2; // casting é automático pois não haverá perda de precisão
		System.out.println(x2);
		
		double a = 20.5;
		// float b = a; // erro de compilação: possível perda de precisão
		float b = (float) a;
		System.out.println(b);
		
		float b2 = 934.5f;
		double a2 = b2;
		System.out.println(a2);
		
		double largura = 100;
		// int tamanho = largura; // erro de compilação: possível perda de precisão
		int tamanho = (int) largura;
		System.out.println(tamanho);
		
		double largura2 = 100.37;
		int tamanho2 = (int) largura2; // perde a parte decimal foi truncado
		System.out.println(tamanho2);
		
		/* Ver o arquivo conversao-de-tipos-primitivos.jpg
		 * 
		 * - Indo no sentido das setas não há necessidade de casting
		 * - Indo no sentido contrário precisa fazer o casting
		 */
		
	}
	
}
