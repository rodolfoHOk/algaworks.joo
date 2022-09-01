public class IncrementoDecremento {

	public static void main(String[] args) {
	
		int idade = 10;
		
		// incrementar
		idade++;
		
		// decrementar
		idade--;
		
		// obs: atribui a novaIdade o valor da idade e depois incrementa idade
		// int novaIdade = idade++;
		
		// obs: incrementa idade e depois atribui a novaIdade o valor da idade
		// int novaIdade = ++idade;
		
		// obs: atribui a novaIdade o valor da idade e depois decrementa idade
		// int novaIdade = idade--;
		
		// obs: decrementa idade e depois atribui a novaIdade o valor da idade
		int novaIdade = --idade;
		
		System.out.println("Idade: " + idade);
		System.out.println("Nova idade: " + novaIdade);
		
	}

}
