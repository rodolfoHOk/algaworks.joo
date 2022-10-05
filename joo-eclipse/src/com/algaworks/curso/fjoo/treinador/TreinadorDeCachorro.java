package com.algaworks.curso.fjoo.treinador;

import com.algaworks.curso.fjoo.animal.Cachorro;

public class TreinadorDeCachorro {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bob");
		
		DonoDoCachorro dono = new DonoDoCachorro();
		dono.ensinarCachorroSentar(cachorro);
		
	}
	
}

