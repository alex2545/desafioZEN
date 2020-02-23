package com.projeto.curso.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.projeto.curso.dao.DAOException;
import com.projeto.curso.dao.PeçasDAO;
import com.projeto.curso.modelo.Peças;

public class jdbcPeçasDAO implements PeçasDAO {

	private Connection connection;
	
	
	
	public jdbcPeçasDAO(Connection connection) {
	this.connection = connection;
	}



	@Override
	public void salvar(Peças peças) {
		try {
		String sql = String.format("insert into peças (nome , veiculoAplicação , pesoLiquido , pesoBruto) values ('%s', '%s' , '10.3' , '12.3')",peças.getNome(),peças.getVeiculoDeAplicaçao(),peças.getPesoLiquido(),peças.getPesoBruto());
		PreparedStatement ps = this.connection.prepareStatement(sql);
		ps.executeUpdate();
	}catch (SQLException e) {
		throw new DAOException("erro salvando peças" ,e);
	}finally {
		try {
			
		this.connection.close();
	}catch (Exception e) {}
	}
	}
}
