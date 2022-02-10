package com.bridgelabz.addressbook;

public class Contact {
	
	String fname;
	String lname;
	String address;
	String city;
	String state;
	long zip;
	long phonenumber;
	String email;
	
	@Override
	public String toString() {
		return "Contact [fname=" + fname + ", lname=" + lname + ", address=" + address + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", phonenumber=" + phonenumber + ", email=" + email + "]";
	}

	
	
	

}
