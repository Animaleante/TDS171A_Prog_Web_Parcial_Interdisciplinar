/**
 * 
 */
package com.tds171a.soboru.main;

import com.tds171a.soboru.views.MainView;

/**
 * @author Diogo S. Moraes
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		new MainView();
	}
}
