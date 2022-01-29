package com.bridgelabz.addressbook;

import java.util.*;

public class UserInterface {
	
	Scanner scn = new Scanner(System.in);
	
	public int showMainMenu() {
		System.out.println("select \n 1. Add Contact \n 2.Edit Contact \n 3.Delete Contact \n 4.Display Contacts List");
		int choice = scn.nextInt();
		return choice;
	}

}
