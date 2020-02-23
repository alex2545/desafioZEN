package com.projeto.curso;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.projeto.curso.dao.DAOFactory;
import com.projeto.curso.dao.PeçasDAO;
import com.projeto.curso.modelo.Peças;

public class SalvaPeças {

	
	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		Peças peças = new Peças();
		
		String nome = JOptionPane.showInputDialog(null,"nome da peça",
				"Cadastro de peças ", JOptionPane.QUESTION_MESSAGE);
		
		if(nome != null) {
		peças.setNome(nome);
		
		PeçasDAO peçasDAO = DAOFactory.getDaoFactory().getPeçasDAO();
		peçasDAO.salvar(peças);
		System.out.println("peça salva");
		
		
	}
	
		
		
	}
	
	}
	

