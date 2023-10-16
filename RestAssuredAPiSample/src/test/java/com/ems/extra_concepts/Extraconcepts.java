package com.ems.extra_concepts;

import java.util.ArrayList;
import java.util.List;

public class Extraconcepts {
	
	public static void main(String[] args) {
		
		  int ar [] = {1,2,3,4};
	        int ar1[]={5,6,7,8,};
	        
	        List<Integer> listone = new ArrayList<>();
	        listone.add(1);
	        listone.add(2);
	        listone.add(3);
	        listone.add(4);
	        
	        List<Integer>listtwo= new ArrayList<>();
	        listtwo.add(5);
	        listtwo.add(6);
	        listtwo.add(7);
	        listtwo.add(8);
	        List<Integer>listthree= new ArrayList<>();
	        List<Integer>Listfour= new ArrayList<>();
	        
	        
	            
	        	for (int i = 0; i < Math.min(listone.size(), listtwo.size()); i++) {
	        		listthree.add(listone.get(i));
		        	listthree.add(listtwo.get(i));
				}
	      
	        for( int i=0;i< Math.min(listone.size(),listtwo.size());i++){
	        	listthree.add(listone.get(i)+listtwo.get(i));
	        }
	        
	        System.out.println("Listthree:"+listthree);
	        System.out.println("List Four:"+Listfour);
	        

	    }
	
	}


