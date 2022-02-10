package com.bridgelabz.addressbook;

import java.util.*;

public class ContactController {
	
	private ArrayList<Contact> contactList = new ArrayList<Contact> ();

	private ContactController() {
		
	}
	
	private static ContactController instance;
	
	public static ContactController getInstance() {
		if(instance == null) {
			instance = new ContactController();
		}
		return instance;
	}
	
	public ArrayList<Contact> getContactList() {
		return contactList;
	}
	
	public void add(Contact contact)
	{
		contactList.add(contact);		
	}
		
	public void remove(Contact contact)
	{
		contactList.remove(contact);	
	}
		
	public Contact getContact(String firstName) {
		for(Contact contact : contactList) {
			if(firstName.equalsIgnoreCase(contact.fname)) {
				return contact;
			}
		}
		return null;
	}
		
}
