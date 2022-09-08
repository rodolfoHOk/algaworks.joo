package poo.parte1;

public class Carro {
	
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	boolean biCombustivel;
	
	Proprietario proprietario;
	
	void ligar() {
		System.out.println("Ligando o carro: " + modelo);
	}
	
}
