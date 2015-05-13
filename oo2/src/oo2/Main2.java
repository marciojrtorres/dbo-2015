package oo2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		String[] nomes = new String[2];
		nomes[0] = "Luca";
		nomes[1] = "Lucas";
//		for (int i = 0; i < nomes.length; i++) {
//			System.out.println(nomes[i]);
//		}
		System.out.println(Arrays.toString(nomes));
		String[] temp = new String[4];
		temp[0] = nomes[0];
		temp[1] = nomes[1];
		temp[2] = "Gregory";
		nomes = temp;
		// [Luca, Lucas, Gregory]
		System.out.println(Arrays.toString(nomes));
		
		ArrayList lista = new ArrayList(); 
		lista.add("erick");
		lista.add("eduardo");
		lista.add("laura gomes");
		lista.add("mauro");
		lista.add("rodrigo");
		lista.add("caroline");
		
		System.out.println(lista);
		
		
	}
}