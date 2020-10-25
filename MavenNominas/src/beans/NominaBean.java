package beans;
import modelo.Nomina;
/**
 * 
 * @author Alicia
 *este método, sirve para controlar con un paso intermedio la base de datos
 */
public class NominaBean{
	private String dni;
	private int sueldo;
	
	
	public NominaBean() {
	}
	
	public NominaBean(Nomina nominaBean) {
		this.dni = nominaBean.getDni();
		this.sueldo = nominaBean.getSueldo();
	}

	public NominaBean(String dni, int sueldo) {
		this.dni = dni;
		this.sueldo = sueldo;
	}

	public NominaBean(int id_nom, String dni, int sueldo) {

		this.dni = dni;
		this.sueldo = sueldo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Nomina [dni=" + dni + ", sueldo=" + sueldo + "]";
	}
	
}
