package services;

import java.util.Scanner;

import models.Employee;


public class EmployeeServicesImp implements EmployeeServices{
	public Scanner empChoiceModify = new Scanner(System.in);
	public Scanner empNewDetailString = new Scanner(System.in);
	public Scanner empNewDetailNum = new Scanner(System.in);
	
	@Override
	public void login(String userName, String passWord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewEmployeeHomepage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployeeInfo(Employee e1) {
		System.out.println("\nWhat detail do you wish to modify for " + e1.getFirstName() + e1.getLastName() + "?" + " Enter the number. "
				+ "\n1. First name" + "\n2. Last name" + "\n3. Country" + "\n4. Username" + "\n5. Password");
		
		int modifyChoice = empChoiceModify.nextInt();							// Variable to store choice
		
		switch(modifyChoice) {
		case 1: System.out.println("Enter the new employee first name: ");
				String newFirstName = empNewDetailString.next();
				e1.setFirstName(newFirstName);
				break;
				
		case 2: System.out.println("Enter the new employee last name: ");
				String newLastName = empNewDetailString.next();
				e1.setLastName(newLastName);
				break;
				
		case 3: System.out.println("Enter the new country: ");
				String newCountry = empNewDetailString.next();
				e1.setCountry(newCountry);
				break;
				
		case 4: System.out.println("Enter the new username: ");
				String newUsername = empNewDetailString.next();
				e1.setUsername(newUsername);
				break;
				
		case 5: System.out.println("Enter the new password: ");
				String newPassword = empNewDetailString.next();
				e1.setPassWord(newPassword);
				break;
		}
		
	}



}
