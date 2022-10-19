package com.algaworks.curso.joo.serializandoObjetos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.algaworks.curso.joo.serializandoObjetos.modelo.Pessoa;

public class SerializandoObjeto {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("João");
		p.setIdade(30);
		p.setProfissao("Motorista");
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./joao.obj"))) {
			
			out.writeObject(p);
			System.out.println("Objeto salvo com sucesso.");
			
		} catch (IOException e) {
			System.err.println("Erro ao tentar salvar objeto. " + e.getMessage());
			e.printStackTrace();
		}
	}
	
}
