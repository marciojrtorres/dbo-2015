package controlador;

import modelo.Filme;
import persistencia.FilmeDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class ExcluiControlador implements TemplateViewRoute {
	
	private FilmeDAO dao = new FilmeDAO();

	@Override
	public ModelAndView handle(Request req, Response resp) {		
		int numero = Integer.parseInt(req.params("numero")); // /excluir/:numero
		Filme filme = dao.load(numero);
		if (filme != null) {
			dao.delete(filme);
		}		
		resp.redirect("/lista");
		return null;
	}

}
