package com.Interview;

public class StringOperatrion {
	
	    public static void main(String[] args) {
	    	
	        String s = "kalaivanan";

	        // Length of the string
	        int length = s.length();
	        System.out.println("Length of the string: " + length);

	        // Accessing characters in the string
	        char firstChar = s.charAt(0);
	        char lastChar = s.charAt(length - 1);
	        System.out.println("First character: " + firstChar);
	        System.out.println("Last character: " + lastChar);

	        // Substring
	        String substring = s.substring(3, 8);
	        System.out.println("Substring from index 3 to 7: " + substring);

	        // Check if the string contains a specific substring
	        boolean contains = s.contains("ivan");
	        System.out.println("Contains 'ivan': " + contains);

	        // Replace characters
	        String replaced = s.replace('a', 'A');
	        System.out.println("String with 'a' replaced by 'A': " + replaced);

	        // Uppercase and lowercase
	        String uppercase = s.toUpperCase();
	        String lowercase = s.toLowerCase();
	        System.out.println("Uppercase: " + uppercase);
	        System.out.println("Lowercase: " + lowercase);
	    }
	}



