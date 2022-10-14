package com.algaworks.curso.joo.maisEframework.jOptionPane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ExemploJOptionPane4 {
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		Object[] possibilidades = {"Masculino", "Feminino"};
		String sexo = (String) JOptionPane.showInputDialog(null, "Selecione o sexo", "Algaworks", 
				JOptionPane.PLAIN_MESSAGE, null, possibilidades, possibilidades[0]);
		System.out.println("Sexo selecionado: " + sexo);
		
		String nome = (String) JOptionPane.showInputDialog(null, "Digite seu nome", "Algaworks", 
				JOptionPane.PLAIN_MESSAGE, null, null, null);
		System.out.println("Nome digitado: " + nome);
		
	}
	
}
