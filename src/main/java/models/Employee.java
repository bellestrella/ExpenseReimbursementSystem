/* An Employee must have some personal information and the ability to make requests */
package models;

import java.util.List;

public class Employee {
	protected String empName;
	protected int empID;
	protected String userName = "";
	protected String passWord = "";
	
	public Employee(String empName, int empID, String userName, String passWord) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	
}
