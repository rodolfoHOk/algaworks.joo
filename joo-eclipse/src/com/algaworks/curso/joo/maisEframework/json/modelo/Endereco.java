package com.algaworks.curso.joo.maisEframework.json.modelo;

public class Endereco {

	private String logradouro;
	private String cidade;
	private String estado;
	
	public Endereco() {
		
	}

	public Endereco(String logradouro, String cidade, String estado) {
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", cidade=" + cidade + ", estado=" + estado + "]";
	}
	
}
