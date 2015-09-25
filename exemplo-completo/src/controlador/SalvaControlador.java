package controlador;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import modelo.Filme;
import persistencia.FilmeDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class SalvaControlador 
	implements TemplateViewRoute {
	
	private FilmeDAO dao = new FilmeDAO();

	@Override
	public ModelAndView handle(Request req, Response resp) {		
		Filme filme = new Filme();
		filme.setNumero(req.queryMap("numero").integerValue());
		filme.setTitulo(req.queryMap("titulo").value());
		filme.setAno(req.queryMap("ano").integerValue());
		filme.setGenero(req.queryMap("genero").value());		
		dao.save(filme);	
		resp.redirect("/lista");
		return null;
	}

}









