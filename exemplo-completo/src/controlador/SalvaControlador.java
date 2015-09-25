package controlador;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import modelo.Filme;
import persistencia.FilmeDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Spark;
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
		if (filme.getTitulo().length() < 3) { // inválido
			String erro = "";
			try {
				erro = URLEncoder.encode("Título deve ter pelo menos 3 caracteres", "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			resp.redirect("/novo?erro=" + erro);
		} else { // válido
			dao.save(filme);	
			resp.redirect("/lista");
		}
//		if (filme.getTitulo().length() < 3) { // inválido
//			Spark.halt(400, "Título deve ter pelo menos 3 caracteres");
//		} else { // válido
//			dao.save(filme);	
//			resp.redirect("/lista");
//		}
		return null;
	}

}









