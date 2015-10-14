package controlador;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.MultipartConfigElement;
import javax.servlet.http.Part;

import spark.Request;
import spark.Response;
import spark.Route;

public class FotoControlador implements Route {

	@Override
	public Object handle(Request req, Response resp) throws Exception {
		MultipartConfigElement multipart = 
				new MultipartConfigElement("/tmp");
		req.raw()
			.setAttribute("org.eclipse.multipartConfig", 
					multipart);		   
		Part file = req.raw().getPart("foto"); // name do input
		// 20151014153122767 (timestamp)
		// universally unique id
		if (file.getContentType().equals("image/jpeg")) {
			String id = UUID.randomUUID().toString();
			System.out.println(id);
			InputStream input = file.getInputStream();
			FileOutputStream output = 
					new FileOutputStream("bin/pub/" + id + ".jpg");			
			int b = 0;
			while ((b = input.read()) >= 0) {
				output.write(b);
			}
			input.close();
			output.close();
			
			return "Foto enviada com sucesso";
		}
		
		return "Deve ser enviada uma imagem jpeg";			
	}

}





