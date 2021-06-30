package models;

public class Manager extends Employee {

	public Manager(String empName, int empID, String userName, String passWord) {
		super(empName, empID, userName, passWord);
		this.empName = empName;
		this.empID = empID;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	
}
