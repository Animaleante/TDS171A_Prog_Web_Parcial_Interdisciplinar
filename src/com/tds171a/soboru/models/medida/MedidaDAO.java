package com.tds171a.soboru.models.medida;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tds171a.soboru.models.IDAO;
import com.tds171a.soboru.utils.Utils;
import com.tds171a.soboru.vos.Medida;

/**
 * Classe de DAO da Medida
 * @author Diogo
 *
 */
public class MedidaDAO implements IDAO<Medida> {
	
	/**
	 * Par�metro com nome da tabela referente a esse DAO
	 */
	private String tableName = "medidas";

	/**
	 * M�todo para incluir uma nova Medida
	 * @param ingrediente
	 * @return
	 */
	@Override
	public boolean incluir(Medida medida) {
		Connection connection = null;
		try {
			connection = Utils.createConnection();

			PreparedStatement sttm = connection.prepareStatement("insert into "+tableName+" values(medidas_seq.NEXTVAL, ?,?)");
			sttm.setString(1, medida.getNome());
			sttm.setString(2, medida.getAbreviacao());

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

	/**
	 * M�todo para trazer uma lista de todos as Medidaa
	 * @return
	 */
	@Override
	public List<Medida> listar() {
		Connection connection = null;
		try {
			connection = Utils.createConnection();

			PreparedStatement sttm = connection.prepareStatement("select * from "+tableName);

			ResultSet rs = sttm.executeQuery();

			List<Medida> list = new ArrayList<Medida>();
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String abreveacao = rs.getString("abreveacao");
				
				Medida m = new Medida(id, nome, abreveacao);
				
				list.add(m);
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

	/**
	 * M�todo para atualizar uma Medida j� registrado
	 * @param ingrediente
	 * @return
	 */
	@Override
	public boolean atualizar(Medida	medida) {
		Connection connection = null;
		try {
			connection = Utils.createConnection();
			
			PreparedStatement sttm = connection.prepareStatement("update "+tableName+" set nome = ?, abreveacao = ? where id = ?");
			sttm.setString(1, medida.getNome());
			sttm.setString(2, medida.getAbreviacao());
			sttm.setInt(3, medida.getId());

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

	/**
	 * M�todo para remover uma Medida
	 * @param ingredienteId
	 * @return
	 */
	@Override
	public boolean remover(int medidaId) {
		Connection connection = null;
		try {
			connection = Utils.createConnection();

			PreparedStatement sttm = connection.prepareStatement("delete from "+tableName+" where id = ?");
			sttm.setInt(1, medidaId);

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
