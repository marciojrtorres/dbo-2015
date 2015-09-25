package controlador;

import java.util.ArrayList;
import java.util.HashMap;

import modelo.Filme;
import persistencia.FilmeDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Spark;
import spark.TemplateViewRoute;

public class ListaControlador 
	implements TemplateViewRoute {

	private FilmeDAO dao = new FilmeDAO();
	
	@Override
	public ModelAndView handle(Request req, Response resp) {
		ArrayList<Filme> filmes = dao.findAll();
		HashMap mapa = new HashMap();
		mapa.put("filmes", filmes);		
		return new ModelAndView(mapa, "filme_lista.html");
	}

}








