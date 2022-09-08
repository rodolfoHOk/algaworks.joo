package poo.parte1;

public class Passeio {
	
	public static void main(String[] args) {
	
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Franjinha";
		
		pessoa1.cachorro = new Cachorro();
		pessoa1.cachorro.nome = "Bidu";
		pessoa1.cachorro.raca = "Scottish Terrier";
		pessoa1.cachorro.sexo = 'M';
		pessoa1.cachorro.idade = 3;
		
		Caminhada caminhada1 = new Caminhada();
		caminhada1.andar(pessoa1);
		
	}
	
}
