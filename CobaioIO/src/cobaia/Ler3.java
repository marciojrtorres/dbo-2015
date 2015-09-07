package cobaia;

import java.io.*;
import java.util.Arrays;

public class Ler3 {

	public static void main(String[] args)
		throws Exception {
		
		File dir = new File("professores");
		
		File[] arqs = dir.listFiles();
		
		System.out.println(Arrays.toString(arqs));
		

	}

}
