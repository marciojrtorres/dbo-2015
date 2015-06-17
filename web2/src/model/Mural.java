package model;

import java.util.ArrayList;

public class Mural {
	
	private ArrayList<Mensagem> mensagens =
			new ArrayList<Mensagem>();

	public void addMensagem(String texto) {
		Mensagem m = new Mensagem(texto);
		mensagens.add(m);
	}
	
	public ArrayList<Mensagem> getMensagens() {
		return mensagens;
	}
	
	public String toString() {
		return mensagens.toString();
	}
	
	
	
	
}
