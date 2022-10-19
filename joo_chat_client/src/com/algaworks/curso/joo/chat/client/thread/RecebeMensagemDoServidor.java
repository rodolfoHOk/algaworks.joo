package com.algaworks.curso.joo.chat.client.thread;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

import com.algaworks.curso.joo.chat.client.gui.JanelaGui;

public class RecebeMensagemDoServidor implements Runnable {

	private Socket socket;
	private JanelaGui janela;
	
	public RecebeMensagemDoServidor(Socket socket, JanelaGui janela) {
		this.socket = socket;
		this.janela = janela;
	}

	@Override
	public void run() {
		while (true) {
			try {
				InputStream is = this.socket.getInputStream();
				DataInput dis = new DataInputStream(is);
				
				String mensagemRecebida = dis.readUTF();
				
				janela.adicionaMensagem(mensagemRecebida);
				
			} catch (Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
