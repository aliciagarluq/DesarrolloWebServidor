package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpleadoDaoImpl;
import dao.NominaDaoImpl;

/**
 * Servlet implementation class ServletEmpleado
 */
@WebServlet("/ServletEmpleado")
public class ServletEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {			
    				//actionDefault(request, response);
    			RequestDispatcher dispatcher= request.getRequestDispatcher("index.jsp");
    			dispatcher.forward(request, response);
    		}
    	 
    		/**
    		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
    		 *      response)
    		 */
    		protected void doPost(HttpServletRequest request, HttpServletResponse response)
    				throws ServletException, IOException {
    			String action = request.getParameter("action");
    			System.out.println(action);
    			if(request.getParameter("action") != null) {
    				switch (action) {
    				case "mostrar":
    					try {
    						ejecutaOpcion1(request, response);
    					} catch (SQLException | ServletException | IOException e) {
    						// TODO Auto-generated catch block
    						e.printStackTrace();
    					}
    					break;
    				case "salario":
    					try {
    						ejecutaOpcion2(request, response);
    					} catch (ServletException | SQLException e) {
    						// TODO Auto-generated catch block
    						e.printStackTrace();
    					}
    					break;	
    				}			
    			} else {
    				actionDefault(request, response);
    			}
    			
    			doGet(request, response);
    		}
    		
    		protected void actionDefault(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    			request.getRequestDispatcher("index.jsp").forward(request, response);
    		}
    		
    		
    		private void ejecutaOpcion1 (HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
    			EmpleadoDaoImpl empl =new EmpleadoDaoImpl();
    			empl.conexion();
    			request.setAttribute("empleados", empl.show());
    			request.getRequestDispatcher("/vista/mostrarEmpleados.jsp").forward(request, response);
    		}
    	 
    		/*private void ejecutaOpcion3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, ControlExcepciones {
    			Conexion conn=new Conexion();
    			conn.ConexionBBDD();
    			String wrDni = (String)request.getParameter("wrDni");
    			System.out.println(wrDni);
    			request.setAttribute("empleados", conn.consultaDni(wrDni));
    			request.getRequestDispatcher("/vista/modificarEmpleado.jsp").forward(request, response);
    		}*/
    		
    		private void ejecutaOpcion2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    			NominaDaoImpl nom =new NominaDaoImpl();
    			nom.conexion();
    			String wrDni = (String)request.getParameter("wrDni");
    			//System.out.println(wrDni);
    			nom.show1(wrDni);
    			request.getRequestDispatcher("/vista/mostrarSalario.jsp").forward(request, response);
    		}
}
