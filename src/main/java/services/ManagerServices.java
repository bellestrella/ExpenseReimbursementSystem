package services;

import models.Employee;

public interface ManagerServices {
	public void login(String userName, String passWord);
	public void logout();
	public void viewManagerHomepage();
	public void viewAllEmployees();
}
