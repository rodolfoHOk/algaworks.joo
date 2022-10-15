package com.algaworks.curso.joo.maisEframework.jdbc;

import java.util.List;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.algaworks.curso.joo.maisEframework.jdbc.dao.ClienteDAO;
import com.algaworks.curso.joo.maisEframework.jdbc.dao.DAOFactory;
import com.algaworks.curso.joo.maisEframework.jdbc.modelo.Cliente;

public class BuscaTodosClientes {
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		
		List<Cliente> clientes = clienteDAO.buscarTodos();
		
		StringBuilder sb = new StringBuilder();
		for (Cliente cliente: clientes) {
			sb.append("-------- Cliente --------\n");
			sb.append(String.format("Código: %d\n", cliente.getCodigo()));
			sb.append(String.format("Nome: %s\n", cliente.getNome()));
			sb.append("\n");
		}
		
		System.out.printf(sb.toString());
	}
	
}
