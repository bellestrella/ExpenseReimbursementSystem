package models;

public class Employee {
	private String empName;
	private int empNo;						// Primary key
	private String email;

	// Parameterized constructor
	public Employee(String empName, int empNo, double monthlySalary){
		this.empName = empName;
		this.empNo = empNo;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// Getters are setters
	public String getEmpName() {
		return empName;
	}

	public void setName(String name) {
		this.empName = name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	@Override
	public String toString() {
		return "\nNAME: " + empName + "\nEMP ID: " + empNo + 
				"\nMONTHLY SALARY: $";
	}


}
