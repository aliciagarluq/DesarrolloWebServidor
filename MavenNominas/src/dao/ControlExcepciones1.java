package dao;

import java.util.Scanner;

public class ControlExcepciones1 {

	
	public static double leerDecimal() {
		Scanner teclado = new Scanner(System.in);
		boolean excepcion = false;
		double n = 0;
		do {
			try {
				n = teclado.nextDouble();
			} catch (Exception e) {
				excepcion = true;
			} finally {
				teclado.nextLine();
			}
		} while (excepcion);
		return n;
	}
	
	public static String leerCadena() {
		Scanner teclado = new Scanner(System.in);
		boolean excepcion = false;
		String cadena = "";
		do {
			try {
				cadena = teclado.next();
			} catch (Exception e) {
				excepcion = true;
			} finally {
				teclado.nextLine();
			}
		} while (excepcion);
		return cadena;
	}
	
	

}
