package com.Interview;

import java.util.Arrays;

public class Arrayinterview {
	
	public static void main(String[] args) {
		
		 /*int [] arr= new int [] {1, 2, 3, 6, 7};
	        int n= 3;
	        System.out.println("Original array ; ");
	        for(int i=0;i<arr.length;i++){
	            System.out.print(arr[i]+ " ");
	        }
	        for(int i =0;i<n;i++){
	            int j ,last;
	            last = arr[arr.length-1];
	            
	        for(int j1= arr.length-1;j1> 0; j1--){
	            arr[j1]=arr[j1-1];
	        }    
	        arr[0]= last;
	        }
	        System.out.println();
	    System.out.println("array after that to print is : ");
	   // System.out.println("array after that print : ");
	  
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]+ " ");
	    }*/
	    
	    
	    int [] nums = {1,2,3,4,5};
	    int sum = Arrays.stream(nums).sum();
	    System.out.println(sum);
	    
	    
	}

}
