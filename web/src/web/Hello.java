package web;

import spark.*;

public class Hello {
	public static void main(String[] args) {
		
		Teste teste = new Teste();
		
		Spark.get("/oi", teste);
		Spark.get("/ola", teste);
		Spark.get("/salve", teste);
		
		Calc c = new Calc();
		// /calc/7/5
		Spark.get("/calc/:x/:y", c);

	}
}

class Teste implements Route {
	@Override
	public Object handle(Request arg0, Response arg1) throws Exception {
		return "Mais uma vez Hello World!!!";
	}
}







