package cobaia;

import java.io.*;
import java.util.Scanner;

public class Ler {

	public static void main(String[] args) {
		
		File arquivo = new File("c:/teste.txt");
		
		System.out.println(arquivo.exists());
		
		try {
			Scanner scan = new Scanner(arquivo, "UTF-8");
			
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			
			scan.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não existe");
		}
		
		

	}

}
