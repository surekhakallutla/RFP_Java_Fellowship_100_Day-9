package com.bridgelabz.addressbook;

import java.util.*;

public class ScannerUtility {
	
	static Scanner scn = new Scanner(System.in);
	
	public static String getString(String message) {
		System.out.println(message);
		return scn.next();
	}

	public static Long getLong(String message) {
		System.out.println(message);
		return scn.nextLong();
	}
}
