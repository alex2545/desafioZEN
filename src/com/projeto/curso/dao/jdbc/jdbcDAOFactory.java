package com.projeto.curso.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.projeto.curso.dao.DAOFactory;
import com.projeto.curso.dao.Pe�asDAO;

public class jdbcDAOFactory extends DAOFactory {

	private Connection connection;
	public jdbcDAOFactory() {
		try {
	Class.forName("com.mysql.jdbc.Driver");
this.connection = DriverManager.getConnection("jdbc:mysql://localhost/pe�as",
		"root", "root");
}catch (Exception e) {
	throw new RuntimeException("erro com BD" , e);
}
	}
	@Override
	public Pe�asDAO getPe�asDAO() {
		
		return new jdbcPe�asDAO(connection);
	}
}

