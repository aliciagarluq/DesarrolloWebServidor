package modelo;
/**
 * 
 * @author Alicia
 *tabla empleado atributos
 */
public class Empleado {
	private String nombre;
	private String dni;
	private String sexo;
	private int categoria;
	private int anyos;

	public Empleado() {
		
	}

	public Empleado( String nombre, String dni, String sexo, int categoria, int anyos) {

		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
		this.categoria = categoria;
		this.anyos = anyos;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getAnyos() {
		return anyos;
	}

	public void setAnyos(int anyos) {
		this.anyos = anyos;
	}

	@Override
	public String toString() {
		return "Empleado{" + "nombre=" + nombre + ", dni=" + dni + ", sexo=" + sexo
				+ ", categoria=" + categoria + ", anyos=" + anyos + '}';
	}

}