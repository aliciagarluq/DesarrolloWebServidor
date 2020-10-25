package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Empleado;
import modelo.Nomina;
/**
 * 
 * @author Alicia
 *Métodos para mostrar la tabla de empleados, y salario según id
 */

/*Mostrar Base de datos de empleado*/
public class EmpleadoDaoImpl implements EmpleadoDao{
	
	public ArrayList<Empleado> show(){
		
		ArrayList<Empleado> empleado = new ArrayList<Empleado>();
		String sql = "select * from empleado" ; 
		
		Statement st;
		ResultSet rs;
		try {			
			Connection bdConection1 = conexion();
			st = bdConection1.createStatement(); 
			rs = st.executeQuery(sql); 			
			while (rs.next()) {
				Empleado empl = new Empleado();										
				empl.setNombre(rs.getString("nombre"));
				System.out.println(empl.getNombre());
				
				empl.setDni(rs.getString("dni"));
				System.out.println(empl.getDni());
				
				empl.setSexo(rs.getString("sexo"));
				System.out.println(empl.getSexo());
				
				empl.setCategoria(rs.getInt("categoria"));
				System.out.println(empl.getCategoria());
				
				empl.setAnyos(rs.getInt("anyos"));
				System.out.println(empl.getAnyos());
				
				empleado.add(empl);
			}
			bdConection1.close(); 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("no se ha podido conectar");
		}
		return empleado;
	}

/*METODO CONEXION*/

	public Connection conexion() {
		Connection bdConection = null;
		try {
			Class.forName(JDBC_DRIVER);
			bdConection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bdConection;
	}

	

}
