package com.algaworks.curso.joo.maisEframework.jdbc;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.algaworks.curso.joo.maisEframework.jdbc.dao.ClienteDAO;
import com.algaworks.curso.joo.maisEframework.jdbc.dao.DAOFactory;
import com.algaworks.curso.joo.maisEframework.jdbc.modelo.Cliente;

public class BuscaPeloCodigo {
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		
		String codigoStr = (String) JOptionPane.showInputDialog(null, "Código do Cliente", "Algaworks", 
				JOptionPane.PLAIN_MESSAGE, null, null, null);
		
		if (codigoStr != null) {
			try {
				Long codigo = Long.parseLong(codigoStr);
				
				Cliente cliente = clienteDAO.buscarPeloCodigo(codigo);
				
				if (cliente != null) {
					StringBuilder sb = new StringBuilder();
					sb.append(String.format("Código: %d\n", cliente.getCodigo()));
					sb.append(String.format("Nome: %s\n", cliente.getNome()));
					JOptionPane.showMessageDialog(null, sb.toString(), "Cliente encontrado", 
							JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Cliente não encontrado", "Atenção", 
							JOptionPane.WARNING_MESSAGE);
				}				
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Formato do código inválido", "Erro", 
						JOptionPane.ERROR_MESSAGE);
			}		
		}		
	}
	
}
