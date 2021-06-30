package services;
import models.Employee;
import models.Requests;

public interface EmployeeServices {
	public void login(String userName, String passWord);
	public void logout();
	public void viewEmployeeHomepage();
	public void updateEmployeeInfo(Employee e);
	public Requests submitRequest();
	public Requests viewPendingRequests();
	public Requests viewResolvedRequests();
}
