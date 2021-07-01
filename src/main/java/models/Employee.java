/* An Employee must have some personal information and the ability to make requests */
package models;

import java.util.List;

public class Employee {
	protected String firstName;
	protected String lastName;
	protected int empID;
	protected String country;
	//	protected String userName = "";
	//	protected String passWord = "";
	//	protected boolean isManager = false;
	public Employee(String firstName, String lastName, int empID, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empID = empID;
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	


}
