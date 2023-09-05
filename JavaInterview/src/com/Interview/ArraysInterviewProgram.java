package com.Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysInterviewProgram {
	
	public static void main(String[] args) {
		
		String str = "kalaivanan as a Software engineer";
		String result = Arrays.asList(str.split(" "))
				.stream()
				.map(s -> new StringBuilder(s).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(result);
		
		//sum of two arrays
		 int [] nums = {1,2,3,4,5};
		    int sum = Arrays.stream(nums).sum();
		    System.out.println(sum);
		    
	
		    String s ="akalaivana software";
		    int i = s.length();
		    while(i>0) {
		    	
		    	char c = s.charAt(i-1);
		    	System.out.print(c);
		    	i--;
		    	
		    }
	}
	

}
