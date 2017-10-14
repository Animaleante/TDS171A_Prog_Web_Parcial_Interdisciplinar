package com.tds171a.soboru.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utils {
	public static Connection createConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "aluno", "aluno");
	}
}
