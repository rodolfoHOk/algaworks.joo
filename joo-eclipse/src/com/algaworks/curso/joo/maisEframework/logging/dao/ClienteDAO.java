package com.algaworks.curso.joo.maisEframework.logging.dao;

import org.apache.log4j.Logger;

import com.algaworks.curso.joo.maisEframework.logging.modelo.Cliente;

public class ClienteDAO {
	
	private static Logger logger = Logger.getLogger(ClienteDAO.class);

	public void salvar(Cliente cliente) {
		if (cliente == null) {
			// alguma regra de negócio especifica
			logger.warn("Cliente está nulo");
			return;
		}
		
		if (logger.isDebugEnabled()) { // para ganhar performance
			logger.debug("Salvando o cliente: " + cliente);
		}
		// Salva o cliente no banco
		if (logger.isDebugEnabled()) {
			logger.debug("Cliente salvo com sucesso");
		}
	}
}
