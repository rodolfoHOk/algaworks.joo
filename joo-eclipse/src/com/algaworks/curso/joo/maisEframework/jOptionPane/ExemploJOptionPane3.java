package com.algaworks.curso.joo.maisEframework.jOptionPane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ExemploJOptionPane3 {
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		Object[] opcoes = {"Sim", "Não", "Sim, com e-mail"};
		
		int opcao = JOptionPane.showOptionDialog(null, "Voce gostaria de finalizar o cadastro?",
				"Confirmação", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, opcoes, opcoes[2]);
		
		System.out.println("Opção selecionada: " + opcao);
	}
	
}
