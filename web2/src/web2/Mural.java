package web2;

import spark.*;
import java.util.*;

public class Mural {
	
	private ArrayList<String> mensagens =
			new ArrayList<String>();
	public final Route novaMensagem = new NovaMensagem();
	public final Route mostraMensagens = new MostraMensagens();
		
	public class NovaMensagem implements Route {
		@Override
		public Object handle(Request req, Response res) throws Exception {			
			String mensagem = req.queryParams("mensagem");			
			mensagens.add(mensagem);
			return "Mensagem adicionada!";
		}
	}
	
	public class MostraMensagens implements Route {
		@Override
		public Object handle(Request arg0, Response arg1) throws Exception {
			return mensagens.toString();
		}
	}
	
	
	
}