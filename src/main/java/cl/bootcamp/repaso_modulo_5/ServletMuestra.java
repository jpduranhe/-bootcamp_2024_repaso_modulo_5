package cl.bootcamp.repaso_modulo_5;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/muestra")
public class ServletMuestra  extends HttpServlet {

	private static final long serialVersionUID = -6709560273712997418L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String apellido = (String) req.getAttribute("apellido");
		
		String html2="<html>";
		   html2+=" <head>";
		   html2+="   <title> Muestra </title>";
		   html2+=" </head>";
		   html2+=" <body>";
		   html2+=" <h1>********Muestra "+apellido+"</h1>";
		   html2+=" </body>";
		   html2+=" </html>";
		   resp.getWriter().print(html2);
	}
}
