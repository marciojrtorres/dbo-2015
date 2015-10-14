package controlador;

import java.io.FileOutputStream;
import java.io.InputStream;

import javax.servlet.MultipartConfigElement;
import javax.servlet.http.Part;

import spark.Request;
import spark.Response;
import spark.Route;

public class UploadController implements Route {

	@Override
	public Object handle(Request request, Response response) throws Exception {
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement("/tmp");
		request.raw().setAttribute("org.eclipse.multipartConfig", multipartConfigElement);
		Part file = request.raw().getPart("arquivo"); //file is name of the upload form
		System.out.println(file.getContentType());
		FileOutputStream fos = new FileOutputStream("/home/jaspion/teste.dat");
		InputStream is = file.getInputStream();
		int b = 0;
		while ((b = is.read()) >= 0) {
			fos.write(b);
		}
		is.close();
		fos.close();
		return null;
	}

}
