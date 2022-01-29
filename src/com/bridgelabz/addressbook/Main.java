package com.bridgelabz.addressbook;

public class Main {
	
	static {
		
		System.out.println("Welcome to Address Book ManagementProgram");
	}
	
	public static void main(String[] args) {

		ContactController contactController = new ContactController();	
		contactController.add();
		System.out.println("Added a new record");
		
	}

}
