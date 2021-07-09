package services;
// This class helps us create a connection object

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

	public static Connection getConnection() {
		
		// Obtain all the information to connect JDBC
		Connection con = null;
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String dbURL = "jdbc:oracle:thin:@mydatabase.c65hoirtyaod.us-east-2.rds.amazonaws.com:1521:ORCL";
		String dbMyUserName = "admin";
		String dbMyPass = "qwe123956";
		
		try {
			Class.forName(driverClass);
			con = DriverManager.getConnection(dbURL, dbMyUserName, dbMyPass);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}

