package servicios;

import java.util.List;

import beans.EmpleadoBean;
import beans.NominaBean;
/**
 * Interfaz para la clase de servicios
 * @author Alicia
 *
 */
public interface IServicio {
	public List<EmpleadoBean> showEmployee();
	public NominaBean sueldo(String dni);

}
