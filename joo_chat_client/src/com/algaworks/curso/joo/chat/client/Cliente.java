package com.algaworks.curso.joo.chat.client;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.algaworks.curso.joo.chat.client.gui.JanelaGui;
import com.algaworks.curso.joo.chat.client.thread.RecebeMensagemDoServidor;

public class Cliente extends JanelaGui {
	
	private Socket socket;
	
	public static void main(String[] args) {
		new Cliente();
	}

	@Override
	protected boolean conectar() {
		System.out.println("Conectando no servidor...");
		try {
			this.socket = new Socket("127.0.0.1", 3333);
			
			RecebeMensagemDoServidor recebeMensagemDoServidor = 
					new RecebeMensagemDoServidor(socket, this);
			new Thread(recebeMensagemDoServidor).start();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	protected void sendMessage(String mensagem) {
		System.out.println("Enviando mensagem via socket para o servidor - " + mensagem);
		
		try {
			OutputStream os = this.socket.getOutputStream();
			DataOutput dos = new DataOutputStream(os);
			
			dos.writeUTF(mensagem);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
}
