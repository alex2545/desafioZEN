package com.projeto.curso.dao;

public class DAOException extends RuntimeException {

	public DAOException(String msg, Throwable t) {
		super(msg,t);
	}
}
