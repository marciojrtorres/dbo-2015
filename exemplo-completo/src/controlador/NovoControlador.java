package controlador;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class NovoControlador
	implements TemplateViewRoute {

	@Override
	public ModelAndView handle(Request req, Response resp) {		
		return new ModelAndView(null, "filme_cadastrar.html");
	}

}








