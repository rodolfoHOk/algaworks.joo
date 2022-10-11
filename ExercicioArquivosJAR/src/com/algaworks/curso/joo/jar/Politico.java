package com.algaworks.curso.joo.jar;

import java.util.Objects;

/**
 * Esta classe representa um político.
 * Descreve o nome do politico e seu respectivo cargo
 * 
 * @author rodolfo
 *
 */
public class Politico {

	private String nome;
	private Cargo cargo;
	
	/**
	 * Método para pegar o nome do político
	 * 
	 * @return O nome do político
	 */
	public String getNome() {
		return this.nome;
	}
	
	/**
	 * Método para setar o nome do político
	 * 
	 * @param nome O nome do político
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Método para pegar o cargo do político
	 * 
	 * @return Retorna o cargo do político
	 */
	public Cargo getCargo() {
		return this.cargo;
	}
	
	/**
	 * Método para setar o cargo do político
	 * 
	 * @param cargo O cargo do político
	 */
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cargo, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Politico other = (Politico) obj;
		return Objects.equals(cargo, other.cargo) && Objects.equals(nome, other.nome);
	}
	
}
