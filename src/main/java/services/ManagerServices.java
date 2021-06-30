package services;

import models.Employee;
import models.Requests;

public interface ManagerServices {
	public void login(String userName, String passWord);
	public void logout();
	public void viewManagerHomepage();
	public void viewAllEmployees();
	public Requests viewAllPendingRequests();
	public Requests viewSinglePendingRequest(Employee e);
	// This is for one single request. How could we display all?
	public Requests approveOrDenyRequest(Employee e);
	public Requests viewAllResolvedRequests();
}
