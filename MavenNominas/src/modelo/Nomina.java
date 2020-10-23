package modelo;

import java.util.Scanner;

public class Nomina{
	private String dni;
	private int sueldo;
	
	
	public Nomina() {
	}
	
	/*public Nomina(Nomina nominaBean) {
		this.dni = nominaBean.getDni();
		this.sueldo = nominaBean.getSueldo();
	}*/

	/*public Nomina(String dni, int sueldo) {
		this.dni = dni;
		this.sueldo = sueldo;
	}*/

	public Nomina(int id_nom, String dni, int sueldo) {

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
