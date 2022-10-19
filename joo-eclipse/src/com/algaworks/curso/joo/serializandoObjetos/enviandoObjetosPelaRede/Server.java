package com.algaworks.curso.joo.serializandoObjetos.enviandoObjetosPelaRede;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.algaworks.curso.joo.serializandoObjetos.enviandoObjetosPelaRede.modelo.Pedido;

public class Server {
	
	public static void main(String[] args) {
		
		try (ServerSocket server = new ServerSocket(3333)) {
			
			System.out.println("Aguardando conexão...");
			Socket socket = server.accept(); // fica aguardando conexões
			System.out.println("Conectado a: " + socket.getRemoteSocketAddress());
			
			InputStream input = socket.getInputStream();
			ObjectInputStream objectStream = new ObjectInputStream(input);
			
			Pedido pedido = (Pedido) objectStream.readObject();
			System.out.println(pedido);
			
			OutputStream output = socket.getOutputStream();
			DataOutput dataOutput = new DataOutputStream(output);
			dataOutput.writeUTF("Recebido com sucesso!");
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}
