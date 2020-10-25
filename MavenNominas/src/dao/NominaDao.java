package dao;

import java.sql.Connection;
import java.util.ArrayList;

import modelo.Empleado;
import modelo.Nomina;
/**
 * 
 * @author Alicia
 *datos de la bbdd
 */
public interface NominaDao {
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://127.0.0.1/nominas2";
	final String DB_USER = "root";
	final String DB_PASS = "";
	

	public Nomina showNomina(String dni);


}
