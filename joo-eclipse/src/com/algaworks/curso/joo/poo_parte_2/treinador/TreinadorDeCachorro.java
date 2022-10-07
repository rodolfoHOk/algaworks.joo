package com.algaworks.curso.joo.poo_parte_2.treinador;

import com.algaworks.curso.joo.poo_parte_2.animal.Cachorro;

public class TreinadorDeCachorro {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bob");
		
		DonoDoCachorro dono = new DonoDoCachorro();
		dono.ensinarCachorroSentar(cachorro);
		
	}
	
}

