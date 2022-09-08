package poo.parte1;

public class Principal2 {
	
	public static void main(String[] args) {
		Proprietario dono = new Proprietario();
		dono.nome = "João da Silva";
		dono.cpf = "123.456.789-01";
		dono.idade = 25;
		dono.logradouro = "Rua das Gaivotas, 101";
		dono.bairro = "Moema";
		dono.cidade = "São Paulo";
		dono.estado = "São Paulo";
		
		Carro carro = new Carro();
		carro.fabricante = "Fiat";
		carro.modelo = "Palio";
		carro.cor = "Prata";
		carro.anoDeFabricacao = 2022;
		carro.proprietario = dono;
		
		Carro carro2 = new Carro();
		carro2.fabricante = "Honda";
		carro2.modelo = "Fit";
		carro2.cor = "Branco";
		carro2.anoDeFabricacao = 2020;
		carro2.proprietario = new Proprietario();
		carro2.proprietario.nome = "Maria Souza";
		carro2.proprietario.cpf = "123.456.987-02";
		carro2.proprietario.idade = 21;
		carro2.proprietario.logradouro = "Rua dos Abacateiros";
		carro2.proprietario.bairro = "Jabaquara";
		carro2.proprietario.cidade = "São Paulo";
		carro2.proprietario.estado = "São Paulo";
		
		System.out.println("Carro 1");
		System.out.println("-------------------");
		System.out.println("Modelo: " + carro.modelo);
		System.out.println("Ano: " + carro.anoDeFabricacao);
		System.out.println("Dono: " + carro.proprietario.nome);
		
		System.out.println();
		
		System.out.println("Carro 2");
		System.out.println("-------------------");
		System.out.println("Modelo: " + carro2.modelo);
		System.out.println("Ano: " + carro2.anoDeFabricacao);
		System.out.println("Dono: " + carro2.proprietario.nome);
		
	}
	
}
