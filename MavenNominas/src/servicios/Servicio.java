package servicios;

import java.util.ArrayList;
import java.util.List;

import beans.EmpleadoBean;
import beans.NominaBean;
import dao.EmpleadoDao;
import dao.EmpleadoDaoImpl;
import dao.NominaDao;
import dao.NominaDaoImpl;
import modelo.Empleado;
import modelo.Nomina;
/**
 * 
 * @author Alicia
 * Servicio sirve de intermediaria entre la base de datos y el servlet
 */
public class Servicio implements IServicio {
	
	/**
	 * 
	 * @return emplBean todos los empleados
	 * Método SHOWemployee, así muestro la base de datos, la tabla empleado: trae una lista de empleados y la pasa a una lista de empleados bean
	 */
	public List<EmpleadoBean> showEmployee() {
		EmpleadoDaoImpl empl =new EmpleadoDaoImpl();
		
		List<Empleado> empleados = empl.show();

		List<EmpleadoBean> emplBean = new ArrayList<>();
	
		for (Empleado empleado : empleados) {
			EmpleadoBean empleadoBean = new EmpleadoBean(empleado);
			emplBean.add(empleadoBean);
		}
		
		return emplBean;
	}
	/**
	 * Me muestra la base de datos de la tabla nomina
	 */
	public NominaBean sueldo(String dni) {
		NominaDaoImpl nominaImpl = new NominaDaoImpl();
		Nomina nomina = nominaImpl.showNomina(dni);
		NominaBean nomBean = new NominaBean(nomina);
		
		return nomBean;
	}
	
	
}	
