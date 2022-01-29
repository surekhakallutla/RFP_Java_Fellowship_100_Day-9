package com.bridgelabz.addressbook;

import java.util.*;

public class ContactController {
	
	private ArrayList<Contact> contactList = new ArrayList<Contact> ();

	public ArrayList<Contact> getContactList() {
		return contactList;
	}
	
	Contact contact = new Contact();
	ScannerUtility scn = new ScannerUtility();
	
	public Contact add() {
		
		contact.setFname(scn.getString("Enter First Name"));
		contact.setLname(scn.getString("Enter Last Name"));
		contact.setAddress(scn.getString("Enter Address"));
		contact.setCity(scn.getString("Enter City Name"));
		contact.setState(scn.getString("Enter State Name"));
		contact.setZip(scn.getLong("Enter Zip Code"));
		contact.setPhonenumber(scn.getString("Enter Phone Number"));
		contact.setEmail(scn.getString("Enter Email Address"));
		
		contactList.add(contact);
		return contact;
	}
	
	public Contact editContact(Contact contact) {
		
		contact.setFname(scn.getString("Enter First Name"));
		contact.setLname(scn.getString("Enter Last Name"));
		contact.setAddress(scn.getString("Enter Address"));
		contact.setCity(scn.getString("Enter City Name"));
		contact.setState(scn.getString("Enter State Name"));
		contact.setZip(scn.getLong("Enter Zip Code"));
		contact.setPhonenumber(scn.getString("Enter Phone Number"));
		contact.setEmail(scn.getString("Enter Email Address"));
		
		contactList.add(contact);
		return contact;
	}
	
	public void editByName(String name) {
		for (Contact contact : contactList) {
			
			if (name.equalsIgnoreCase(contact.getFname())) {
				editContact(contact);
			} 
			
			else {
				System.out.println("Contact not found");
			}
		}
	}
}
