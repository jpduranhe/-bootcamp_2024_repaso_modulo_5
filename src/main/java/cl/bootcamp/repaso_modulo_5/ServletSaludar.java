package cl.bootcamp.repaso_modulo_5;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class ServletSaludar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ServletContext context= this.getServletContext();
		String nombreContexto = (String) context.getAttribute("nombreContexto");
		
		String html2="<html>";
		   html2+=" <head>";
		   html2+="   <title> ServletSaludar </title>";
		   html2+=" </head>";
		   html2+=" <body>";
		   html2+=" <h1>"+nombreContexto+"</h1>";
		   html2+=" </body>";
		   html2+=" </html>";
		   response.getWriter().print(html2);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Cookie[] cookies=request.getCookies();
		
		HttpSession session = request.getSession();
		
		
		String nombre="";
		if(request.getParameter("nombreFormulario") != null) {
			nombre = request.getParameter("nombreFormulario");
		}
		String html2="<html>";
		   html2+=" <head>";
		   html2+="   <title> ServletSaludar </title>";
		   html2+=" </head>";
		   html2+=" <body>";
		   html2+=" <small> usuario conectado:"+session.getAttribute("username")+"</small>";
		   html2+="   <h1> Salundado a :"+nombre+" desde ServletSaludar</h1>";
		//   html2+=" <ul>";
		//   for(Cookie c :cookies) {
		//	   html2+="<li>"+c.getName()+":"+c.getValue()+"</li>";				
		//	}
		//   html2+=" </ul>";
		   html2+=" </body>";
		   html2+="</html>";
		   
		   
		   response.getWriter().println(html2);
	}

}
