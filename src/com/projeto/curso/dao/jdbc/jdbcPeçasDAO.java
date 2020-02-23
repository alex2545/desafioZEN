package com.projeto.curso.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.projeto.curso.dao.DAOException;
import com.projeto.curso.dao.Pe�asDAO;
import com.projeto.curso.modelo.Pe�as;

public class jdbcPe�asDAO implements Pe�asDAO {

	private Connection connection;
	
	
	
	public jdbcPe�asDAO(Connection connection) {
	this.connection = connection;
	}



	@Override
	public void salvar(Pe�as pe�as) {
		try {
		String sql = String.format("insert into pe�as (nome , veiculoAplica��o , pesoLiquido , pesoBruto) values ('%s', '%s' , '10.3' , '12.3')",pe�as.getNome(),pe�as.getVeiculoDeAplica�ao(),pe�as.getPesoLiquido(),pe�as.getPesoBruto());
		PreparedStatement ps = this.connection.prepareStatement(sql);
		ps.executeUpdate();
	}catch (SQLException e) {
		throw new DAOException("erro salvando pe�as" ,e);
	}finally {
		try {
			
		this.connection.close();
	}catch (Exception e) {}
	}
	}
}
