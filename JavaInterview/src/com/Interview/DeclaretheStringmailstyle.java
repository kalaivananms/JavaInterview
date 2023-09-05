package com.Interview;

public class DeclaretheStringmailstyle {

	public static void main(String[] args) {

		//declare the String mail Style and the Output is before @ to  print the output

		String email = "kalaivananms@gmail.com";

		// Find the index of the "@" symbol.

		int atIndex = email.indexOf("@");

		// Extract the substring before the "@".
		String username = email.substring(0, atIndex);

		// Print the extracted substring
		System.out.println("Username: " + username);


		String s= "kalaimsk331997@gmail.com";
		int indexOf = s.indexOf("@");
		String name = s.substring(0,indexOf);
		System.out.println("name :X"+name);


	}

}
