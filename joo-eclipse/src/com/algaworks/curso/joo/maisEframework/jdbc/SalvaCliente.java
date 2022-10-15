package com.algaworks.curso.joo.maisEframework.jdbc;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.algaworks.curso.joo.maisEframework.jdbc.dao.ClienteDAO;
import com.algaworks.curso.joo.maisEframework.jdbc.dao.DAOFactory;
import com.algaworks.curso.joo.maisEframework.jdbc.modelo.Cliente;

public class SalvaCliente {
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		Cliente cliente = new Cliente();
		
		String nome = (String) JOptionPane.showInputDialog(null, "Nome do Cliente", "Algaworks", 
				JOptionPane.PLAIN_MESSAGE, null, null, null);
		
		if (nome != null) {
			cliente.setNome(nome);
			
			ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
			clienteDAO.salvar(cliente);
			System.out.println("Cliente salvo com sucesso");
		}
	}
	
}
