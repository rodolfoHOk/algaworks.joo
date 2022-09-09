package poo.parte2;

public class TesteConstrutor {

	public static void main(String[] args) {
	
//		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa1 = new Pessoa("José");
		System.out.println("Nome: \"" + pessoa1.nome + "\" tem " + pessoa1.idade + " anos");
		
//		pessoa1.nome = "José";
		pessoa1.idade = 35;
		System.out.println("Nome: \"" + pessoa1.nome + "\" tem " + pessoa1.idade + " anos");
		
		Pessoa pessoa2 = new Pessoa("Maria", 32);
		System.out.println("Nome: \"" + pessoa2.nome + "\" tem " + pessoa2.idade + " anos");
		
	}
	
}
