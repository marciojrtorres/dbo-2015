package cobaia;

public class Teste {
	public static void main(String[] args) {
		
		String[] nomes = {"Thaylles", "Erick", "Yuri", "Caroline", "Mauro", "Laura Dalmolin", "Marcos"};
		
		// imprimir os nomes:
		imprimeLn(nomes, 0);
		
		// quebra(1);
		
		int r = multiplica(4, 3);	

		System.out.println(r);
	}

		
	// m(4, 3)
	// 4 + m(4, 2)
	// 4 + m(4 ,1)
	// 4 + m(4, 0)
	
	
	private static int multiplica(int a, int b) {
		if (b == 0) return 0;
		return a + multiplica(a, b - 1);
	}

	private static void imprimeLn(String[] nomes, int i) {
		if (i < nomes.length) {
			System.out.println(nomes[i]);		
			imprimeLn(nomes, i + 1);
		}
	}

	// RECURSIVIDADE: (método que chama a si)
	private static void quebra(int i) {
		System.out.println(i);
		if (i < 100) quebra(i+1);		
	}
}










