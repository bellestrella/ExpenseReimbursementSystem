package services;
import models.Employee;


public interface EmployeeServices {
	public void login(String userName, String passWord);
	public void logout();
	public void viewEmployeeHomepage();
	public void updateEmployeeInfo(Employee e);
}
