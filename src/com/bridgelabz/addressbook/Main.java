package com.bridgelabz.addressbook;

import java.util.*;

public class Main {
	
	static {
		
		System.out.println("Welcome to Address Book ManagementProgram");
	}
	
	public void handleUserSelection() {
		ContactController contactController = new ContactController();
		UserInterface userInterface = new UserInterface();
		
		int i = 1;
		Scanner scn = new Scanner(System.in);
		
		do {
			int choice = userInterface.showMainMenu();
			
			switch(choice) {
			case 1: 
				contactController.add();
				break;
			case 2:
				contactController.editByName(ScannerUtility.getString("Enter the Contact Name to Edit"));
				break;
			}
			
			i = scn.nextInt();
		}while(i == 1);
	}
	
	public static void main(String[] args) {

		ContactController contactController = new ContactController();	
		contactController.add();
		
		Main main = new Main();
		main.handleUserSelection();
//		System.out.println("Added a new record");
		
	}

}
