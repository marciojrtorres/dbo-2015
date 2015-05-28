package toolkit;

public class Main {

	public static void main(String[] args) {
		
		// POLIMORFISMO!
		// POLIMORFISMO AD HOC:
		// Sobrecarga de métodos
		
		
		
		IList lista = new List();

		System.out.println(lista.count() == 0);
		System.out.println(lista.empty() == true);
		System.out.println(lista.get(0) == null);
		System.out.println(lista.first() == null);
		System.out.println(lista.last() == null);

		lista.append("a");

		System.out.println(lista.empty() == false);
		System.out.println(lista.count() == 1);
		System.out.println(lista.get(0).equals("a"));
		System.out.println(lista.first().equals("a"));
		System.out.println(lista.last().equals("a"));
		System.out.println(lista.first().equals(lista.last()));

		lista.append(2); // a lista deve aceitar qualquer Objeto
		lista.append("c");
		lista.append("d");
		lista.append("e");

		System.out.println(lista.count() == 5);

		System.out.println(lista.first().equals("a"));
		System.out.println(lista.last().equals("e"));

		System.out.println(lista.get(1).equals(2));
		System.out.println(lista.get(2).equals("c"));
		System.out.println(lista.get(5) == null);

		System.out.println(lista.has("a") == true);
		System.out.println(lista.has(3) == false);
		System.out.println(lista.has("f") == false);
		System.out.println(lista.has(2) == true);

		System.out.println(lista.count() == 5);
		lista.append(null);
		System.out.println(lista.count() == 5);

		System.out.println(lista.delete(1) == true);
		System.out.println(lista.delete(9) == false);

		System.out.println(lista.count() == 4);

		System.out.println(lista.get(0).equals("a"));
		System.out.println(lista.get(1).equals("c"));
		System.out.println(lista.get(2).equals("d"));
		System.out.println(lista.get(3).equals("e"));

		System.out.println(lista.drop(2).equals("d"));

		System.out.println(lista.count() == 3);

		System.out.println(lista.remove("c") == true);

		System.out.println(lista.count() == 2);

		System.out.println(lista.get(0).equals("a"));
		System.out.println(lista.get(1).equals("e"));

		System.out.println(lista.drop(2) == null);
		System.out.println(lista.remove("c") == false);

		lista.clean();

		System.out.println(lista.count() == 0);
		System.out.println(lista.empty() == true);
		System.out.println(lista.get(0) == null);
		System.out.println(lista.first() == null);
		System.out.println(lista.last() == null);

		lista = new List();

		long startMillis = System.currentTimeMillis();
		for (int i = 0; i < 1000000000; i++) lista.append("teste");
		long endMillis = System.currentTimeMillis();

		System.out.println(lista.count() == 1000000000);

		// benchmark: anotar o desempenho e tentar melhor�-lo (qto menos tempo melhor)
		System.out.println((endMillis - startMillis) + "ms decorridos para adicionar 1G elementos");
	}
}
