package com.algaworks.curso.joo.maisEframework.jdbc.dao;

import com.algaworks.curso.joo.maisEframework.jdbc.dao.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {
	
	public static DAOFactory getDAOFactory() {
		return new JdbcDAOFactory();
	}
	
	public abstract ClienteDAO getClienteDAO();
	
}
