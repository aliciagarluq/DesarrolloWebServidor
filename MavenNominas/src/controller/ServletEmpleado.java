package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.EmpleadoBean;
import beans.NominaBean;
import conexion.Conexion;
import dao.EmpleadoDaoImpl;
import dao.NominaDaoImpl;
import modelo.Nomina;
import servicios.IServicio;
import servicios.Servicio;

/**
 * 
 * @author Alicia
 *
 * Servlet implementation class ServletEmpleado
 */
@WebServlet("/ServletEmpleado")
public class ServletEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/*private static final int SUELDO_BASE[] = { 50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000,
			230000 };   */
    /**
     * @see HttpServlet#HttpServlet()
     * constructor vacio
     */
    public ServletEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * método doGet
	 */
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    		throws ServletException, IOException {		
	
				if (request.getParameter("accion") != null) {
		
					String accion = request.getParameter("accion");
					switch (accion) {
					case "mostrar":
						try {
							ejecutaOpcion1(request, response);
						} catch (SQLException | ServletException | IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					
					}
				} else {
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}
				
	    }
    	 
    		/**
    		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
    		 *      response)
    		 *      El formulario entrará aquí en el Método doPost
    		 */
    		protected void doPost(HttpServletRequest request, HttpServletResponse response)
    				throws ServletException, IOException {
    			String action = request.getParameter("action");
    			System.out.println(action);
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
    		
    		}
    		
    		/**
    		 * Método para mostrar la bbdd de empleados
    		 * @param request
    		 * @param response
    		 * @throws SQLException
    		 * @throws ServletException
    		 * @throws IOException
    		 */
    		private void ejecutaOpcion1 (HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
    			Conexion.connection();
    			IServicio servicio = new Servicio();
    			List<EmpleadoBean> emplBean = servicio.showEmployee();
    			request.setAttribute("empleados", emplBean);
    			request.getRequestDispatcher("/WEB-INF/vista/mostrarEmpleados.jsp").forward(request, response);
    		}
    	 
    		/*private void ejecutaOpcion3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, ControlExcepciones {
    			Conexion conn=new Conexion();
    			conn.ConexionBBDD();
    			String wrDni = (String)request.getParameter("wrDni");
    			System.out.println(wrDni);
    			request.setAttribute("empleados", conn.consultaDni(wrDni));
    			request.getRequestDispatcher("/vista/modificarEmpleado.jsp").forward(request, response);
    		}*/
    		/**
    		 * Método para mostrar salario
    		 * @param request
    		 * @param response
    		 * @throws ServletException
    		 * @throws IOException
    		 * @throws SQLException
    		 */
    		private void ejecutaOpcion2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    			Conexion.connection();
    			IServicio servicio = new Servicio();
    			String dni = request.getParameter("dni");
    			NominaBean nomBean = servicio.sueldo(dni);
    			request.setAttribute("dni", nomBean.getDni());
    			request.setAttribute("sueldo", nomBean.getSueldo());
    			request.getRequestDispatcher("/WEB-INF/vista/mostrarSalario.jsp").forward(request, response);
    			/*
    			String dni = request.getParameter("dni");
    			NominaDaoImpl nom =new NominaDaoImpl();
    			Nomina nominaIndividual=nom.showNomina(dni);
    			request.setAttribute("dni", nominaIndividual.getDni());
    			request.setAttribute("sueldo", nominaIndividual.getSueldo());
    			request.getRequestDispatcher("/WEB-INF/vista/mostrarSalario.jsp").forward(request, response);
    		*/
    		}
    		
}
