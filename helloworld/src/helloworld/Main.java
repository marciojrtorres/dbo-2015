package helloworld;

import spark.*;

public class Main {
	public static void main(String[] args) {
		
		 Hello hi = new Hello();		 
		 Spark.get("/hello", hi);
	}
}

class Hello implements Route {
	@Override
	public Object handle(Request arg0, Response arg1) throws Exception {		
		return "Hello World!";
	}
}






