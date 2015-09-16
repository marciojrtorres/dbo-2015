package web;

import controlador.NovoControlador;
import controlador.PaginaInicialControlador;
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
		
		Spark.get("/novo", novoControlador, engine);
		
		
	}

}







