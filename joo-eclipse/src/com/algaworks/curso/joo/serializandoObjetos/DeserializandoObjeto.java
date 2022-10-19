package com.algaworks.curso.joo.serializandoObjetos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.algaworks.curso.joo.serializandoObjetos.modelo.Pessoa;

public class DeserializandoObjeto {

	public static void main(String[] args) {
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("joao.obj"))) {
			
			Pessoa p = (Pessoa) input.readObject();
			System.out.println(p);
			
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado. " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Erro ao tentar ler o objeto. " + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("Erro ao tentar conventer para a classe Pessoa " + e.getMessage());
			e.printStackTrace();
		}
 	}
	
}
