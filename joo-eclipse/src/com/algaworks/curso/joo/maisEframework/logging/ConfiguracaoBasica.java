package com.algaworks.curso.joo.maisEframework.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ConfiguracaoBasica {
	
	private static Logger logger = Logger.getLogger(ConfiguracaoBasica.class);

	public static void main(String[] args) {
//		BasicConfigurator.configure(); // não é mais suportado
		PropertyConfigurator.configure("./log4j.properties"); // deve ser assim
		
		logger.info("Começando a aplicação");
		// código da aplicação
		logger.info("Finalizando a aplicação");
	}
	
}
