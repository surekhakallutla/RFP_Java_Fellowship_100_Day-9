package com.bridgelabz.addressbook;

import java.util.*;

public class Main {
	
	static {
		
		System.out.println("Welcome to Address Book ManagementProgram");
	}
	
	ContactController contactController = ContactController.getInstance();
	ScannerUtility scn = new ScannerUtility();
	
	public void handleUserSelection(int choice) {
		UserInterface userInterface = UserInterface.getInstance();
		
		switch(choice) {
		case 1: 
			addContact();
			System.out.println("Contact Added Successfully");
			break;
		case 2:
			updateContact();
			System.out.println("Contact Updated Successfully");
			break;
		case 3:
			String userSelection = userInterface.selectContact();
			ContactInfo contact = contactController.getContact(userSelection);
			System.out.println("Contact = "+contact);
			contactController.getContactList().remove(contact);
			System.out.println("Medicine Removed Successfully");
			System.out.println(contactController.getContactList());
			break;
		case 4:
			System.out.println("The Contact List is ");
			userInterface.print(contactController.getContactList());
			break;
		case 5:
			System.out.println("Exited Main Menu");
			break;
		}

	}
	

	public void addContact() {
		ContactInfo contact = new ContactInfo();
		
		System.out.println("Enter First Name");
		contact.fname = scn.StringInput();
		System.out.println("Enter Last Name");
		contact.lname = scn.StringInput();
		System.out.println("Enter Address ");
		contact.address = scn.StringInput();
		System.out.println("Enter City Name");
		contact.city = scn.StringInput();
		System.out.println("Enter State Name");
		contact.state = scn.StringInput();
		System.out.println("Enter Zip Code");
		contact.zip = scn.LongInput();
		System.out.println("Enter Phone Number");
		contact.phonenumber = scn.LongInput();
		System.out.println("Enter email Address");
		contact.email = scn.StringInput();
		
		contactController.add(contact);
		System.out.println(contactController.getContactList());
			
	}
	
	private void updateContact() {
		UserInterface userInterface = UserInterface.getInstance();
		String firstname = userInterface.selectContact();
		
		ContactInfo contactForUpdate = contactController.getContact(firstname);
		System.out.println(contactForUpdate);
		
		int updateChoice = userInterface.showUpdateMenu();
		
		switch (updateChoice) {
		case 1:
			System.out.println("Current First Name is : " 
					+ contactForUpdate.fname + ". Enter your new First Name :");
			contactForUpdate.fname = scn.StringInput();
			break;
		case 2:
			System.out.println("Current Last Name is : " 
					+ contactForUpdate.lname + ". Enter your new Last Name :");
			contactForUpdate.lname = scn.StringInput();
			break;
		case 3:
			System.out.println("Current Address is : " 
					+ contactForUpdate.address + ". Enter your new Address :");
			contactForUpdate.address = scn.StringInput();
			break;
		case 4:
			System.out.println("Current CIty Name is : " 
					+ contactForUpdate.city + ". Enter your new City Name :");
			contactForUpdate.city = scn.StringInput();
			break;
		case 5:
			System.out.println("Current State Name is : " 
					+ contactForUpdate.state + ". Enter your new State Name :");
			contactForUpdate.state = scn.StringInput();
			break;
		case 6:
			System.out.println("Current Zip code is : " 
					+ contactForUpdate.zip + ". Enter your new Zip Code :");
			contactForUpdate.zip = scn.LongInput();
			break;
		case 7:
			System.out.println("Current Phone Number is : " 
					+ contactForUpdate.phonenumber + ". Enter your new Phone Number :");
			contactForUpdate.phonenumber = scn.LongInput();
			break;
		case 8:
			System.out.println("Current email address is : " 
					+ contactForUpdate.email + ". Enter your new email address :");
			contactForUpdate.email = scn.StringInput();
			break;
		
		}
	}
	
	public static void main(String[] args) {
	
		UserInterface userInterface = UserInterface.getInstance();
		Main main = new Main();
		
		int choice = 0;
		while(choice != 5) {
			choice = userInterface.showMainMenu();
			main.handleUserSelection(choice);
		}
	
	}

}
