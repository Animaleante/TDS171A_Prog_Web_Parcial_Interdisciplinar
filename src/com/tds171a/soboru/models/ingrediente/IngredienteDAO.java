package com.tds171a.soboru.models.ingrediente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tds171a.soboru.utils.Utils;
import com.tds171a.soboru.vos.Ingrediente;

public class IngredienteDAO implements IIngredienteDAO {
	private String tableName = "ingredientes";
	
	@Override
	public boolean incluir(Ingrediente ingrediente) {
		Connection connection = null;
		try {
			connection = Utils.createConnection();

			PreparedStatement sttm = connection.prepareStatement("insert into "+tableName+" values(ingrediente_seq.NEXTVAL, ?)");
			sttm.setString(1, ingrediente.getNome());

			int rowsAffected = sttm.executeUpdate();
			
			if (sttm != null)
				sttm.close();

			sttm = null;

			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

		return false;
	}

	@Override
	public List<Ingrediente> listar() {
		Connection connection = null;
		try {
			connection = Utils.createConnection();

			PreparedStatement sttm = connection.prepareStatement("select * from "+tableName);

			ResultSet rs = sttm.executeQuery();

			List<Ingrediente> list = new ArrayList<Ingrediente>();
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				
				Ingrediente i = new Ingrediente(id, nome);
				
				list.add(i);
			}
			
			if (sttm != null)
				sttm.close();

			sttm = null;

			return list;
		} catch (SQLException Except) {
			Except.printStackTrace();
		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

		return null;
	}

	@Override
	public boolean atualizar(Ingrediente ingrediente) {
		Connection connection = null;
		try {
			connection = Utils.createConnection();

			PreparedStatement sttm = connection.prepareStatement("update "+tableName+" set nome = ? where id = ?");
			sttm.setString(1, ingrediente.getNome());
			sttm.setInt(2, ingrediente.getId());

			int rowsAffected = sttm.executeUpdate();
			
			if (sttm != null)
				sttm.close();

			sttm = null;

			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

		return false;
	}

	@Override
	public boolean remover(int ingredienteId) {
		Connection connection = null;
		try {
			connection = Utils.createConnection();

			PreparedStatement sttm = connection.prepareStatement("delete from "+tableName+" where id = ?");
			sttm.setInt(1, ingredienteId);

			int rowsAffected = sttm.executeUpdate();
			
			if (sttm != null)
				sttm.close();

			sttm = null;

			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

		return false;
	}
}
