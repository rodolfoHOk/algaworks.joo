package com.algaworks.curso.joo.maisEframework.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.algaworks.curso.joo.maisEframework.logging.dao.ClienteDAO;
import com.algaworks.curso.joo.maisEframework.logging.modelo.Cliente;

public class ExemploSalvandoCliente {

	private static Logger logger = Logger.getLogger(ExemploSalvandoCliente.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("./log4j.properties");
		
		logger.info("Iniciando a aplicação");
		
		Cliente cliente = new Cliente("João");
		ClienteDAO dao = new ClienteDAO();
		dao.salvar(cliente);
		
		Cliente clientenulo = null;
		dao.salvar(clientenulo);
		
		logger.info("Finalizando a aplicação");
	}
	
}
