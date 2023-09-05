package com.Interview;

import java.util.Arrays;
import java.util.Collections;

public class ReversetehStringwordbyword {
	
	
   public static void main(String[] args) {
	   
	   //reverse the String word by word 
	String s= "Kalaivanan Is a Software testing engineer";
	String[] str = s.split(" ");
	
	Collections.reverse(Arrays.asList(str));
	System.out.println(String.join(" ", str));
	
	
	//Reverse the String 
	
	String s1 = "Kalaivanan Is a Software testing engineer";
	String rev = " ";
	for (int i = s1.length()-1; i >=0; i--) {
		rev= rev+s1.charAt(i);
	}
	System.out.println(rev);
	
	//reverse the String without using for loop
	
	String s2 ="Kalaivanan Is a Software testing engineer";
	int i = s2.length();
	while (i>0) {
		char c = s.charAt(i-1);
		System.out.print(c);
		i--;
	}
}
}
