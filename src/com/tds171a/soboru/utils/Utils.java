package com.tds171a.soboru.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe Utils
 * @author Diogo
 *
 */
public class Utils {
	
	/**
	 * M�todo est�tico que cria uma conex�o com o banco
	 * @return a conex�o com o banco
	 */
	public static Connection createConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "aluno", "aluno");
	}
}
