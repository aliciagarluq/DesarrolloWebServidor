package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import modelo.Empleado;
import modelo.Nomina;



/*Mostrar Base de datos de empleado*/
public class NominaDaoImpl implements NominaDao{
/*Mostrar sueldo segun dni*/
	public Nomina show1(String dni) {
		Nomina nom =new Nomina();
		
		String sql = "select * from nomina where dni=" + dni; 
		
		Connection bdConection;
		Statement st;
		ResultSet rs;

		try {
			Connection bdConection1 = conexion();
			st = bdConection1.createStatement(); 
			rs = st.executeQuery(sql); 
			while (rs.next()) {
				nom.setDni(rs.getString("dni"));
				System.out.println(" "+nom.getDni()+" ");
				nom.setSueldo(rs.getInt("sueldo"));
				System.out.println(" "+nom.getSueldo()+" ");
			}
			bdConection1.close(); 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("no se ha podido conectar");
		}

		return nom;
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
