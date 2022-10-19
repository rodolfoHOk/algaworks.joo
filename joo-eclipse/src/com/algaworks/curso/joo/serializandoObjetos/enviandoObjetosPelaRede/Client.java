package com.algaworks.curso.joo.serializandoObjetos.enviandoObjetosPelaRede;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.algaworks.curso.joo.serializandoObjetos.enviandoObjetosPelaRede.modelo.Pedido;

public class Client {
	
	public static void main(String[] args) {
		
		try (Socket socket = new Socket("192.168.0.102", 3333)) {
			
			OutputStream output = socket.getOutputStream();
			ObjectOutput objectOutput = new ObjectOutputStream(output);
			
			Pedido pedido = new Pedido();
			pedido.setCodigo(1L);
			pedido.setDescricao("Sabonete");
			pedido.setQuantidade(5);
			
			objectOutput.writeObject(pedido);
			
			InputStream input = socket.getInputStream();
			DataInputStream dataInput = new DataInputStream(input);
			String mensagemDoServidor = dataInput.readUTF();
			System.out.println("Recebeu do servidor: " + mensagemDoServidor);
			
		} catch (UnknownHostException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
}
