package persistencia;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Persistência: dados persistidos (não temporário)
		// Gravado e Lido independente da execução do programa
		
		// Padrão de Arquitetura chamado Data Access Object (DAO)
		// Modelo (objeto de negócio, ex.: Aluno, Pedido, Livro, ...)
		
		DAO<Filme> dao = new FilmeDAO();
		
		Filme f1 = new Filme();
		f1.setNumero(1);
		f1.setTitulo("O Guia do Mochileiro das Galáxias");
		f1.setGenero("Sci-fi");
		f1.setAno(2005);
		
		Filme f2 = new Filme();
		f2.setNumero(2);
		f2.setTitulo("Avatar");
		f2.setGenero("Ficção");
		f2.setAno(2009);
		
		Filme f3 = new Filme();
		f3.setNumero(3);
		f3.setTitulo("Exterminador do Futuro: Gênesis");
		f3.setGenero("Ação");
		f3.setAno(2015);
		
		Filme f4 = new Filme();
		f4.setNumero(4);
		f4.setTitulo("A Entidade");
		f4.setGenero("Terror");
		f4.setAno(2012);
		
		Filme f5 = new Filme();
		f5.setNumero(5);
		f5.setTitulo("TED 2");
		f5.setGenero("Comédia");
		f5.setAno(2015);
		
		Filme f6 = new Filme();
		f6.setNumero(6);
		f6.setTitulo("Star Wars: Episódio III a Vingança dos Sith");
		
		Filme f7 = new Filme();
		f7.setNumero(5);
		f7.setTitulo("Não deve ser salvo");			
		
		dao.save(f1);
		dao.save(f2);
		dao.save(f3);
		dao.save(f4);
		dao.save(f5);
		dao.save(f6);
		dao.save(f7); // este deve falhar
		
//		dao.delete(f2);
//		dao.delete(f4);
//		dao.delete(f6);
		
		
		Filme a = dao.load(3);
		System.out.println(a != null);
		System.out.println(a.getNumero() == 3);
		System.out.println(a.getTitulo().equals("Exterminador do Futuro: Gênesis"));
		System.out.println(a.getGenero().equals("Ação"));
		System.out.println(a.getAno() == 2015);
		
		Filme b = dao.load(11); // número não encontrado: NULL
		System.out.println(b == null);
		
		Filme c = dao.load(1);
		System.out.println(c.equals(f1));
		
		dao.delete(c);
		Filme d = dao.load(1);
		System.out.println(d == null);
		
		ArrayList<Filme> todos = dao.findAll();
		System.out.println(todos.size() == 5);
		System.out.println(todos.get(0).getTitulo().equals("Avatar"));
		
		todos.get(0).setGenero("Ação");
		dao.update(todos.get(0));
		
		Filme e = dao.load(2);
		System.out.println(e.getTitulo().equals("Avatar"));
		System.out.println(e.getGenero().equals("Ação"));
		
		
	}

}










