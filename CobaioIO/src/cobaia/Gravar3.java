package cobaia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Gravar3 {

	public static void 
		main(String[] args) throws Exception {
		
		// banco.csv 
		File banco = new File("banco.csv");
		
		FileWriter writer = 
				new FileWriter(banco, true);
		
		// writer.append("Laura Dalmolin\n");
		// writer.append("Laura Gomes\n");
		
		// writer.append("Beatriz Costa\n");
		// writer.append("Yuri Garcia\n");
		
		writer.flush();
		writer.close();
		
		System.out.println("0k");
		
		
		
		
		

	}

}
