package oo2;

public class Main {
	public static void main(String[] args) {
		// Relacionamentos 1-1
		// Relacionamentos 1-N
		
		Contato c1 = new Contato("Gabriel");
		System.out.println(c1);
		
		Telefone t1 = new Telefone("77665533");
		
		c1.addTelefone(t1);
		c1.addTelefone(new Telefone("99882222"));
		c1.addTelefone(new Telefone("98833111"));
		c1.addTelefone(new Telefone("32323232"));
		
		System.out.println(c1.getTelefone(1));
		
		c1.removeTelefone(1);
		
		System.out.println(c1.getTelefone(1));
		
	}
}