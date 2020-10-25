package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexion.Conexion;
import modelo.Nomina;
/**
 * 
 * @author Alicia
 *Métodos para mostrar la tabla de empleados, y salario según id
 */
public class NominaDaoImpl implements NominaDao{
	private static final String SQL_SELECT = "SELECT * FROM nomina";
	/**
	 * Muestrame el salario a través de su dni
	 */
	public Nomina showNomina(String dni) {
		Nomina nomina = null;
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			conn = Conexion.connection();
			preparedStatement = conn.prepareStatement(SQL_SELECT);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				if (dni.trim().equalsIgnoreCase(resultSet.getString("dni"))) {
					String dni2 = resultSet.getString("dni");
					int sueldo = resultSet.getInt("sueldo");
					nomina = new Nomina(dni2, sueldo);
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		} finally {
			if (resultSet != null) {
				Conexion.close(resultSet);
			}
			if (preparedStatement != null) {
				Conexion.close(preparedStatement);
			}
			if (conn != null) {
				Conexion.close(conn);
			}
		}
		return nomina;
	}


}
