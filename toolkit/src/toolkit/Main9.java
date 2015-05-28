package toolkit;

public class Main9 {	
	public static void main(String[] args) {
		
		// CLASSE == TIPO
		// SUPERCLASSE == SUPERTIPO
		// SUBCLASS == SUBTIPO
		// ANIMAL -> MAMIFERO -> FELINO -> GATO
		
		// EM JAVA: SUPERTIPO DE TODOS!
		// OBJECT (OBJETO)
		
		Object i = "ifrs";		
		
		System.out.println(i instanceof Integer);
		System.out.println(i instanceof Object);
		System.out.println(i instanceof Number);
		System.out.println(i instanceof String);
		System.out.println(i instanceof System);
		
		Object n1 = 9;
		if (get() instanceof Integer)
			System.out.println((Integer)n1 + (Integer)get());
		else
			System.out.println("get nao eh inteiro");
		
		// POLIMORFISMO PARAMÉTRICO 
		// TIPO PARAMETRIZADO
		List<Integer> lista = new List();
		lista.append(5);
		lista.append(6);
		// lista.append("sdfsdfsd");
		//lista.append(System.out);
		
		System.out.println(lista.get(0) + lista.get(1));
	}
	
	public static Object get() {
		return "asdasd";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
