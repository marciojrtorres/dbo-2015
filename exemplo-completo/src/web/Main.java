package web;

import controlador.ListaControlador;
import controlador.NovoControlador;
import controlador.PaginaInicialControlador;
import controlador.SalvaControlador;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

public class Main {
	
	public static void main(String[] args) {
		
		// precisa de um package publico (pub)
		// onde ficam os css, js, imgs, conteúdo fixo
		Spark.staticFileLocation("/publico");
		
		// precisa de um package apresentacao (views)
		// onde ficam os HTML's
		MustacheTemplateEngine engine = 
				new MustacheTemplateEngine("apresentacao");
		
		PaginaInicialControlador paginaInicial =
				new PaginaInicialControlador();
		
		// get ou post (get ler informações, post submeter informações)
		Spark.get("/", paginaInicial, engine);
		
		NovoControlador novoControlador = 
				new NovoControlador();
		
		// abrir o form
		Spark.get("/novo", novoControlador, engine);
		
		SalvaControlador salvaControlador =
				new SalvaControlador();
		
		// submissão do form
		Spark.post("/salva", salvaControlador, engine);
		
		ListaControlador listaControlador =
				new ListaControlador();
		
		Spark.get("/lista", listaControlador, engine);
		
		
	}

}







