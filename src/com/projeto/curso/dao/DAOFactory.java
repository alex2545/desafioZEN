package com.projeto.curso.dao;

import com.projeto.curso.dao.jdbc.jdbcDAOFactory;

public abstract class DAOFactory {

	
	public static DAOFactory getDaoFactory() {
		return new jdbcDAOFactory();
	}
	public abstract PeçasDAO getPeçasDAO();
	
}
