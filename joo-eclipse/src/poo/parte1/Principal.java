package poo.parte1;

public class Principal {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.cor = "Prata";
		meuCarro.anoDeFabricacao = 2022;
		
		Carro seuCarro = new Carro();
		seuCarro.fabricante = "Honda";
		seuCarro.modelo = "Fit";
		seuCarro.cor = "Preta";
		seuCarro.anoDeFabricacao = 2020;
		
		System.out.println("Meu Carro");
		System.out.println("-----------------");
		System.out.println("Fabricante: " + meuCarro.fabricante);
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Cor: " + meuCarro.cor);
		System.out.println("Ano : " + meuCarro.anoDeFabricacao);
		
		System.out.println();
		
		System.out.println("Seu Carro");
		System.out.println("------------------");
		System.out.println("Fabricante: " + seuCarro.fabricante);
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Cor: " + seuCarro.cor);
		System.out.println("Ano : " + seuCarro.anoDeFabricacao);
		
	}
	
}
