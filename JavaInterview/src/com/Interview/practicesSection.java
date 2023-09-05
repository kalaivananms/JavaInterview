package com.Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class practicesSection {
	
	public static void main(String[] args) {
	
		String s = "kalaivanan";
		String s1=s.replace("" ,"");
		String s2 = "";
		System.out.println(s1);
		char[] chh =s1.toCharArray();
		Map<Character, Integer> mp1= new LinkedHashMap<>();
		
		for (int i=0;i<chh.length;i++){

		if (mp1.containsKey(chh[i])){
		}
		else{
		mp1.put(chh[i],1);
		}}

		Set<Entry<Character,Integer>> entrySet = mp1.entrySet();
		for(Entry<Character,Integer> entry :entrySet){
		s=s+entry.getKey();
		}
		System.out.println(s);
		
	}
	
	

}
