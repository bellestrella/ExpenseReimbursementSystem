package servlet;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import services.ConnectionUtil;

public class emptoJSON {

	public static void main(String[] args) throws IOException {
		viewRecords();
	}
	
	@SuppressWarnings("unchecked")
	public static void viewRecords() throws IOException {
	    //boolean status = false;
	    Connection con = ConnectionUtil.getConnection();

	    try {
	    	System.out.println("Did the try work?");
	    	PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM Employees");
	        // The integers correspond to the question marks in the query
	        ResultSet rs = preparedStatement.executeQuery();
	        //status = rs.next();
	        
	        // Create a JSON document, to represent your table, by instantiating the JSONObject
	        // class of the json-simple library.
	        JSONObject jsonObject = new JSONObject();
	        
	        // Store your employee records in a JSON array
	        JSONArray empArray = new JSONArray();
	        while(rs.next()) {
	        	// Create a JSON object to store your records in
	        	JSONObject empObjs = new JSONObject();
	        	empObjs.put("FirstName", rs.getString("FirstName"));
	        	empObjs.put("LastName", rs.getString("LastName"));
	        	empObjs.put("EmpID", rs.getString("EmpID"));
	        	empObjs.put("Country", rs.getString("Country"));
	        	empObjs.put("PendingRequests", rs.getString("PendingRequests"));
	        	empArray.add(empObjs);
	        }
	        // After adding all the required records of the JSON array, add it to the parent JSON object
	        jsonObject.put("Employee_Data", empArray);
	        // Write the JSON object, named empObjs, to a file using FileReader
	        FileWriter file = new FileWriter("empJSON.json");
	        file.write(jsonObject.toJSONString());
	        file.close();
	        
	    } catch (SQLException e) {
	    	System.out.println("Skipped the try section.");
	    	e.printStackTrace();
	    }
	}
}
