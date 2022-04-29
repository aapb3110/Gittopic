package org.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class employeejdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","aapb@3010");
		
		String s = "select*from employees";
		PreparedStatement pre = connection.prepareStatement(s);
		ResultSet executeQuery = pre.executeQuery();
		while(executeQuery.next()) {
			int int1 = executeQuery.getInt("employee_Id");
			System.out.println(int1);
			String string = executeQuery.getString("first_name");
			System.out.println(string);
		}
		connection.close();
	}
	
	
 
}

