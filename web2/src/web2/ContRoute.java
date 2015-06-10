package web2;

import spark.Request;
import spark.Response;
import spark.Route;

public class ContRoute implements Route {
	
	private int cont = 0;

	@Override
	public Object handle(Request req, Response res) throws Exception {		
		return cont++;
	}

}
