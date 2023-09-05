package com.Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class ProgramPDF {
	
	public static void main(String[] args) {
		
		 String  s= "abc#$#23asc";
		    
		    StringBuilder characters = new StringBuilder();
		    StringBuilder specialcharacter= new StringBuilder();
		    StringBuilder numbers= new StringBuilder();
		    
		    
		    for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (Character.isLetter(c)) {
					characters.append(c);
				}
				else if (Character.isDigit(c)) {
					numbers.append(c);
				}
				else {
					specialcharacter.append(c);
				}
				
			}
		    System.out.println("Characters :"+ characters.toString());
		    System.out.println("special character :"+specialcharacter.toString());
		    System.out.println("Numbers :"+numbers.toString());
	}
	    
	}


