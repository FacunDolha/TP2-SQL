package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import persistence.commons.ConnectionProvider;
import persistence.commons.GenericDao;
import persistence.commons.MissingDataException;
import turismoTierraMedia.TipoAtraccion;
import model.Usuario;
import model.nullobjects.NullUsuario;

public class UsuarioDao implements GenericDao<Usuario> {

	public Usuario findByUserame(String username) {
		try {

			String query = "SELECT * FROM usuarios WHERE username = ?";
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, username);
			ResultSet resultSet = statement.executeQuery();

			Usuario user = NullUsuario.build();
			if (resultSet.next()) {
				user = toUsuario(resultSet);
			}
			return user;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}

	}

	public List<Usuario> findAll() {
		try {
			String sql = "SELECT * FROM usuarios";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet resultados = statement.executeQuery();

			List<Usuario> usuarios = new LinkedList<Usuario>();
			while (resultados.next()) {
				usuarios.add(toUsuario(resultados));
			}

			return usuarios;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

	private Usuario toUsuario(ResultSet userRegister) throws SQLException {
		return new Usuario(userRegister.getInt(1), userRegister.getString(2), userRegister.getString(3),
				userRegister.getInt(5), userRegister.getDouble(6), userRegister.getBoolean(4));
	}

	/*
	 * private Usuario toUsuario(ResultSet resultSet) throws SQLException { Integer
	 * idUsuario = resultSet.getInt("id_usuario"); String nombre =
	 * resultSet.getString("nombre"); Double presupuesto =
	 * resultSet.getDouble("monedas"); Double tiempoDisponible =
	 * resultSet.getDouble("tiempo"); // String tipoAtraccion =
	 * resultSet.getString("atraccion_preferida"); TipoAtraccion tipoPreferido =
	 * TipoAtraccion.valueOf(resultSet.getString("preferencia")); Usuario usuario =
	 * new Usuario(idUsuario, nombre, presupuesto, tiempoDisponible, tipoPreferido);
	 * // Habria que cambiar el constructor de Usuario y ver los nombres de las
	 * tablas // de SQL de usuario return usuario; }
	 */
	public int insert(Usuario usuario) throws SQLException {
		try {

			String sqlQuery = "INSERT INTO usuarios (username, password) VALUES (?, ?)";
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			statement.setString(1, usuario.getUsername());
			statement.setString(2, usuario.getPassword());
			// statement.setDouble(3, usuario.getTiempoDisponible());
			// statement.setString(4, usuario.getTipoPreferido().name());
			// statement.setInt(4, usuario.getTipoPreferido().ordinal() + 1);
			// lo de ordinal lo pusimos para que de el orden de los enum. En las tabla en
			// vez de poner text, seria un int.
			int rowsUpdated = statement.executeUpdate();
			return rowsUpdated;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

	public int delete(Usuario usuario) {
		try {
			String sqlQuery = "DELETE FROM USERS WHERE USERNAME = ?";
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			statement.setString(1, usuario.getUsername());
			int rows = statement.executeUpdate();

			return rows;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}

	}

	public int delete(Integer id) {
		String sqlDeleteQuery = "DELETE FROM usuarios WHERE id=?";
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement statement = connection.prepareStatement(sqlDeleteQuery);
		statement.setInt(1, id);
		int rowsUpdated = statement.executeUpdate();
		return rowsUpdated;
	}

	public int update(Usuario usuario) throws SQLException {
		try {

			String sqlQuery = "UPDATE usuario" + "WHERE id = ?" + "SET presupuesto = ?, " + "tiempo = ?";
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			statement.setInt(1, usuario.getIdUsuario());
			statement.setInt(2, usuario.getPresupuesto());
			// statement.setDouble(3, usuario.getPresupuesto());
			statement.setDouble(3, usuario.getTiempoDisponible());
			// statement.setInt(4, usuario.getTipoPreferido().ordinal() + 1);
			int rowsUpdate = statement.executeUpdate();
			return rowsUpdate;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

	public int countAll(Usuario usuario) throws SQLException {
		String sqlQuery = "SELECT COUNT() AS total FROM usuarios";
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement statement = connection.prepareStatement(sqlQuery);
		ResultSet resultSet = statement.executeQuery();
		resultSet.next();
		int total = resultSet.getInt("total");
		return total;
	}

	public int countAll() {
		try {
			String sql = "SELECT COUNT(1) AS TOTAL FROM USERS";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet resultados = statement.executeQuery();

			resultados.next();
			int total = resultados.getInt("TOTAL");

			return total;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

	public Usuario find(Integer id) {
		try {
			String sql = "SELECT * FROM USERS WHERE ID = ?";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet resultados = statement.executeQuery();

			Usuario user = NullUsuario.build();

			if (resultados.next()) {
				user = toUsuario(resultados);
			}

			return user;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}

	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario findById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}