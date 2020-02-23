package com.projeto.curso;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.projeto.curso.dao.DAOFactory;
import com.projeto.curso.dao.Pe�asDAO;
import com.projeto.curso.modelo.Pe�as;

public class SalvaPe�as {

	
	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		Pe�as pe�as = new Pe�as();
		
		String nome = JOptionPane.showInputDialog(null,"nome da pe�a",
				"Cadastro de pe�as ", JOptionPane.QUESTION_MESSAGE);
		
		if(nome != null) {
		pe�as.setNome(nome);
		
		Pe�asDAO pe�asDAO = DAOFactory.getDaoFactory().getPe�asDAO();
		pe�asDAO.salvar(pe�as);
		System.out.println("pe�a salva");
		
		
	}
	
		
		
	}
	
	}
	

