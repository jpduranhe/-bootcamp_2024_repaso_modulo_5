package cl.bootcamp.repaso_modulo_5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/compartir-atributo")
public class ServletComparteAtributo  extends HttpServlet{

	private static final long serialVersionUID = -2020832568389011142L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String urlServlet="/muestra";
		req.getParameter("visor");
		
		req.setAttribute("apellido", "Lopez");
		List<String> nombres= new ArrayList<>();
		nombres.add("Julio");
		nombres.add("Alberto");
		nombres.add("Maria");
		req.setAttribute("nombres", nombres);

		if(req.getParameter("visor")!=null) {
			String visor=req.getParameter("visor");
			if(visor.equals("m")) {
				urlServlet="/muestra";
				RequestDispatcher dispatcher= req.getRequestDispatcher(urlServlet);
				dispatcher.forward(req, resp);
			}else if(visor.equals("s")){
				urlServlet="/show";
				RequestDispatcher dispatcher= req.getRequestDispatcher(urlServlet);
				dispatcher.forward(req, resp);
			}else if(visor.equals("jsp")){
				urlServlet="/muestraJsp.jsp";
				RequestDispatcher dispatcher= req.getRequestDispatcher(urlServlet);
				dispatcher.forward(req, resp);
			}else if(visor.equals("r")){
				resp.sendRedirect("/repaso_modulo_5/ServletSaludar");
			}
			
		}
				
		
		
		
	}

}
