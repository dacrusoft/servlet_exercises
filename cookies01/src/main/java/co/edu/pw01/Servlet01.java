package co.edu.pw01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet01
 */
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet01() {
        super();
        // TODO Auto-generated constructor stub
    }	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {			
			response.setContentType("text/html");			
			
			PrintWriter out = response.getWriter();			
			
			String nombreUsuario = request.getParameter("usuario");
			out.print("Bienvenido " + nombreUsuario);
			
			// Creando cokkie
			Cookie cookie = new Cookie("usuario", nombreUsuario);
			// pasando cookie
			response.addCookie(cookie);
			
			
			out.print("<form action='Servlet2' method='post'>");
			out.print("<input type='submit' value='Continuar'>");
			out.print("</form>");
			
			out.close();			
			
		} catch (Exception e) {			
			System.out.println(e);			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
