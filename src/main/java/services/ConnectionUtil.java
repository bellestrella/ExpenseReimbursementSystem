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
		// Create an object of properties
		Properties props = new Properties();
		// Create a reference of file stream because we are going to read a file
		FileInputStream fis = null;
		// Create a reference of Connection. Connection is an interface
		Connection con = null;
		try {
			fis = new FileInputStream("db.properties");			// Read the file
			props.load(fis);									// Load the file after reading

			// load the Driver Class, get the driver details from the property file (db.property), and read in a key ("DB_DRIVER_CLASS")
			Class.forName(props.getProperty("DB_DRIVER_CLASS"));

			// create the connection now
			// a connection reference will be stored in "con"
			con = DriverManager.getConnection(props.getProperty("DB_URL"),	// Read the value of DB_URL key
					props.getProperty("DB_USERNAME"),
					props.getProperty("DB_PASSWORD"));
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;	//return the connection
	}
}
