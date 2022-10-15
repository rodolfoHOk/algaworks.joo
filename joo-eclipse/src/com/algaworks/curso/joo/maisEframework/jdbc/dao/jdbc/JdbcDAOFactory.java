package com.algaworks.curso.joo.maisEframework.jdbc.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.algaworks.curso.joo.maisEframework.jdbc.dao.ClienteDAO;
import com.algaworks.curso.joo.maisEframework.jdbc.dao.DAOFactory;

public class JdbcDAOFactory extends DAOFactory {

	private Connection connection;

	public JdbcDAOFactory() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cadastro_cliente?allowPublicKeyRetrieval=true&useSSL=false",
					"root",
					"mysqladmin");	
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException("Erro ao tentar recuperar conexão com o banco de dados", e);
		}
	}

	@Override
	public ClienteDAO getClienteDAO() {
		return new JdbcClienteDAO(connection);
	}

}
