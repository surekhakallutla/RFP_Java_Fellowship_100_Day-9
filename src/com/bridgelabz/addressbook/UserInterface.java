package com.bridgelabz.addressbook;

import java.util.*;

public class UserInterface {
	
	Scanner scn = new Scanner(System.in);
	
	public int showMainMenu() {
		System.out.println("select \n 1. Add Contact \n 2.Edit Contact");
		int choice = scn.nextInt();
		return choice;
	}

}
