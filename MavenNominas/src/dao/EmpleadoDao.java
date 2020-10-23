package dao;

import java.sql.Connection;
import java.util.ArrayList;

import modelo.Empleado;

public interface EmpleadoDao {
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://127.0.0.1/nominas2";
	final String DB_USER = "root";
	final String DB_PASS = "";
	//metodos que se van a implementar
	public ArrayList<Empleado> show();	
	public Connection conexion();
}
