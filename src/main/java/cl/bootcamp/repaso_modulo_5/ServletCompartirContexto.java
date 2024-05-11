package cl.bootcamp.repaso_modulo_5;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/compartir-contexto")
public class ServletCompartirContexto extends HttpServlet {

	private static final long serialVersionUID = 3471863646793955777L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context= this.getServletContext();
		
		context.setAttribute("nombreContexto", "Juan");
		
		String html2="<html>";
		   html2+=" <head>";
		   html2+="   <title> Hola MUNDO SERVLET </title>";
		   html2+=" </head>";
		   html2+=" <body>";
		   html2+=" <a href='/repaso_modulo_5/ServletSaludar'>Ir a ver valor contexto</a>";
		   html2+=" </body>";
		   html2+=" </html>";
		   resp.getWriter().print(html2);
	}

	
	
}
