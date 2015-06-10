package web2;

import spark.*;

public class Main {
	public static void main(String[] args) {

		Spark.staticFileLocation("/pub");
		
		Route cont = new ContRoute();
		
		// rota
		Spark.get("/cont", cont);
		
		Mural mural = new Mural();
		
		Route novaMensagem = mural.novaMensagem;
		Route mostraMensagens = mural.mostraMensagens;
		
		Spark.post("/mural", novaMensagem);
		
		Spark.get("/mural", mostraMensagens);
		
		
		
		
		
		
		
		
	}
}