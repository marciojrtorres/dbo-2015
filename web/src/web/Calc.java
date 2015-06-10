package web;

import spark.*;

public class Calc implements Route {

	@Override
	public Object handle(Request req, Response resp) throws Exception {		
		int x = Integer.parseInt(req.params("x"));
		int y = Integer.parseInt(req.params("y"));
		return "" + (x + y);
	}

}
