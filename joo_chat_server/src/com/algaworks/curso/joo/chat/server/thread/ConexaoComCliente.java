package com.algaworks.curso.joo.chat.server.thread;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.algaworks.curso.joo.chat.server.Servidor;

public class ConexaoComCliente implements Runnable {

	private Socket socket;
	private Servidor servidor;
	
	public ConexaoComCliente(Socket socket, Servidor servidor) {
		this.socket = socket;
		this.servidor = servidor;
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("Aguardando mensagem do cliente...");
			
			try {
				InputStream is = socket.getInputStream();
				DataInput dis = new DataInputStream(is);
				String mensagemCliente = dis.readUTF();
				
				servidor.enviarMensagemParaClientes(mensagemCliente);
								
			} catch (EOFException e) {
				System.out.println("Cliente desconectado");
			} catch (Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}

	public void enviarMensagem(String mensagem) {
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
