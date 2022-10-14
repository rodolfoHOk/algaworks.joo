package com.algaworks.curso.joo.maisEframework.jOptionPane;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ExemploJOptionPane2 {
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(null, "Atenção e-mail não informado", "Atenção", 
				JOptionPane.WARNING_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Por favor informar o CPF", "Erro", 
				JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Obrigado por utilizar a plataforma", "Obrigado", 
				JOptionPane.PLAIN_MESSAGE);
		
		try {
			URL url = ExemploJOptionPane2.class.getResource("algaworks.png");
			int alturaImage = 44;
			int larguraImagem = 41;
			int algoritmoDeRedimensionamento = 4; // deixa imagem mais suave após redimensionar
			Image imagem = ImageIO.read(url);
			Image imagemRedimensionada = imagem.getScaledInstance(alturaImage, larguraImagem, algoritmoDeRedimensionamento);
			Icon icone = new ImageIcon(imagemRedimensionada);
			
			JOptionPane.showMessageDialog(null, "Obrigado por escolher a Algaworks", "Algaworks", 
					JOptionPane.INFORMATION_MESSAGE, icone);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
