package cl.bootcamp.repaso_modulo_5;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/hola-mundo")
public class HolaMundoServlet extends HttpServlet {

	private static final long serialVersionUID = -148537072308642052L;
	
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Ejecutando init");
		super.init(config);
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Ejecutando service");
		super.service(arg0, arg1);
	}



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Ejecutando doGet");
		
		Cookie cookieColor = new Cookie("color", "rojo");
		Cookie cookieForma = new Cookie("forma", "circulo");
		resp.addCookie(cookieColor);
		resp.addCookie(cookieForma);
		
		
		HttpSession session = req.getSession();
		session.setAttribute("username", "jperez");
		session.setAttribute("rol", "admin");
		
		
		String nombre = "";
		
		if(req.getParameter("nombreSaludo") != null) {
			nombre = req.getParameter("nombreSaludo");
		}
		
		PrintWriter print = resp.getWriter();
		/*
		String html="""
				<html>
					<head>
						<title> Hola MUNDO SERVLET </title>
					</head>
					<body>
						<h1>Hola Mundo</h1>
						<h2>Hello world</h2>
						
						<br/>
						
						
					</body>
				</html>				
				""";
		*/
		String html2="<html>";
			   html2+=" <head>";
			   html2+="   <title> Hola MUNDO SERVLET </title>";
			   html2+=" </head>";
			   html2+=" <body>";
			   html2+="   <h1>Hola Mundo</h1>";
			   html2+="   <h2>Hello world</h2>";
			   html2+="   <h3>Se envia a si mismo pero Post</h3>";
			   html2+="   <form action='#' method='post'>";
			   html2+="   	<label>Nombre</label>";
			   html2+="   	<input name='nombreFormulario'/> <br/>";
			   html2+="   	<button type='submit'>Enviar</button>";
			   html2+="   </form>";
			   html2+="   <h3>Se envia a ServletSaludar</h3>";
			   html2+="   <form action='/repaso_modulo_5/ServletSaludar' method='post'>";
			   html2+="   	<label>Nombre</label>";
			   html2+="   	<input name='nombreFormulario'/> <br/>";
			   html2+="   	<button type='submit'>Enviar</button>";
			   html2+="   </form>";
			   html2+="   <h3>Se envia a jsp</h3>";
			   html2+="   <form action='/repaso_modulo_5/index.jsp' method='post'>";
			   html2+="   	<label>Nombre</label>";
			   html2+="   	<input name='nombreFormulario'/> <br/>";
			   html2+="   	<button type='submit'>Enviar</button>";
			   html2+="   </form>";
			   html2+=" </body>";
			   html2+="</html>";
			   
			   
		print.println(html2);
	}
	
	
	



	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre="";
		if(req.getParameter("nombreFormulario") != null) {
			nombre = req.getParameter("nombreFormulario");
		}
		String html2="<html>";
		   html2+=" <head>";
		   html2+="   <title> Hola MUNDO SERVLET POST </title>";
		   html2+=" </head>";
		   html2+=" <body>";
		   html2+="   <h1>Hola Mundo POST </h1>";
		   html2+="   <h2>Hello world POST</h2>";
		   html2+="   <h3>"+nombre+" desde POST</h3>";
		   html2+=" </body>";
		   html2+="</html>";
		   
		   
		   resp.getWriter().println(html2);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Ejecutando service");
		super.destroy();
	}

	
	
	
}
