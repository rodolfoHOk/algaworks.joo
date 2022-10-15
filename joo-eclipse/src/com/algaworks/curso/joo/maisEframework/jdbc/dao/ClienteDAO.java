package com.algaworks.curso.joo.maisEframework.jdbc.dao;

import java.util.List;

import com.algaworks.curso.joo.maisEframework.jdbc.modelo.Cliente;

public interface ClienteDAO {
	
	public void salvar(Cliente cliente);

	public Cliente buscarPeloCodigo(Long codigo);

	public List<Cliente> buscarTodos();

}
