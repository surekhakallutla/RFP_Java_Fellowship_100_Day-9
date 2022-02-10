package com.bridgelabz.addressbook;

import java.util.*;

public class ScannerUtility {
    public static final Scanner scn = new Scanner(System.in);

    public static final String StringInput() {
        return scn.next();
    }
    
    public static final int IntegerInput() {
    	return scn.nextInt();
    }
    
    public static final long LongInput() {
    	return scn.nextLong();
    }
    
}
