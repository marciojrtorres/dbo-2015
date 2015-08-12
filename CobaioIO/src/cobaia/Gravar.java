package cobaia;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

public class Gravar {

	public static void main(String[] args) throws FileNotFoundException {
		
		// caminho absoluto (fixo)
		// caminho relativo (conta a partir
		// do local do programa
		
		// URI uri = Gravar.class.getResource(".").toURI();
		// System.out.println(uri);
		
		// File f = new File(".");
		// System.out.println(f.getAbsolutePath());
		
		// File f = new File("d:/dbo/meuarquivo.txt");
		
		File f = new File("/home/torres/meuarquivo.txt");
		// System.out == imprime no Console/Terminal/Prompt
		// System.out.println("alguma coisa");
		
		PrintStream fileOut =
				new PrintStream(f);
				// new PrintStream("/home/torres/teste.txt");
				
		fileOut.println("Teste");		
		fileOut.flush();		
		fileOut.close();		
		
	}

}
