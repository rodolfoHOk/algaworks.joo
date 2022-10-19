package com.algaworks.curso.joo.chat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.algaworks.curso.joo.chat.server.thread.ConexaoComCliente;

public class Servidor {
	
	private List<ConexaoComCliente> clientes = new ArrayList<>();
	
	public static void main(String[] args) {
		Servidor servidor = new Servidor();
		servidor.aguardarConexoes();
		
	}
	
	private void aguardarConexoes() {
		try (ServerSocket server = new ServerSocket(3333)){
			
			while(true) {
				System.out.println("Aguardando conexão");
				Socket socket = server.accept();
				
				ConexaoComCliente recebeMensagemDoCliente = new ConexaoComCliente(socket, this);	
				new Thread(recebeMensagemDoCliente).start();
				
				this.clientes.add(recebeMensagemDoCliente);
				System.out.println("Novo cliente conectado");
			}
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} 
	}
	
	public void enviarMensagemParaClientes(String mensagem) {
		for (ConexaoComCliente cliente: this.clientes) {
			cliente.enviarMensagem(mensagem);
		}
	}
	
}
