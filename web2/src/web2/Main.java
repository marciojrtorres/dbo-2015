package web2;

import spark.*;
import spark.template.mustache.MustacheTemplateEngine;

public class Main {
	public static void main(String[] args) {
		
		// motor de renderizacao de modelos
		MustacheTemplateEngine engine = 
				new MustacheTemplateEngine("views");
		
		Spark.staticFileLocation("/pub");
		
		Route cont = new ContRoute();
		
		// rota
		Spark.get("/cont", cont);		
		
		MuralController muralController = new MuralController();
		
		Route novaMensagem = muralController.novaMensagem;
		
		// Route mostraMensagens = mural.mostraMensagens;
		
		// vai para um template
		TemplateViewRoute mostraMensagens = muralController.mostraMensagens;
		
		Spark.post("/mural", novaMensagem);
		
		Spark.get("/mural", mostraMensagens, engine);
		
		Spark.get("/mensagens", mostraMensagens, engine);
		
		
		
	}
}