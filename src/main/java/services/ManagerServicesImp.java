package services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.Employee;


public class ManagerServicesImp implements ManagerServices {

	@Override
	public void login(String userName, String passWord) {
		// TODO Auto-generated method stub

	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewManagerHomepage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewAllEmployees() {
		System.out.print("Viewing all Employees\n");
		
		String QUERY = "select FirstName, LastName, EmpID, Country, username, pass_word from Employee";
		try(Connection con = ConnectionUtil.getConnection();
				Statement stmt = con.createStatement();			
				ResultSet rs = stmt.executeQuery(QUERY))		
		{	
			// Traverse the particular result set
			while(rs.next()){
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("LastName");
				int empID = rs.getInt("EmpID");
				String country = rs.getString("Country");
				String username = rs.getString("username");
				String pw = rs.getString("pass_word");

				System.out.println("\n|Name| " + firstName + " " + lastName + " |Employee ID| " + empID + 
									" |Country| " + country + " |Username| " + username + " |Password| " + pw);
			}//try
		} catch (SQLException e) {e.printStackTrace(); }
	}


}
