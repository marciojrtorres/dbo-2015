package cobaia;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		File arquivo = new File("c:/aula.txt");
		
		System.out.println(arquivo.exists());
		System.out.println(arquivo.length());
		
		File novoNome = new File("c:/teste.txt");
		
		System.out.println(arquivo.exists());
		
		arquivo.renameTo(novoNome);
		
		File dir = new File("c:/musicas");
		dir.delete();
		//dir.mkdir();
		
	}

}
