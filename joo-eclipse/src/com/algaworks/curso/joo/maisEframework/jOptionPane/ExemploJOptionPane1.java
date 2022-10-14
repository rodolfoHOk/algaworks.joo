package com.algaworks.curso.joo.maisEframework.jOptionPane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ExemploJOptionPane1 {
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");
	}
	
}
