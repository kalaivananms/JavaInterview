package com.Interview;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class StringOccurences {
	
	public static void main(String[] args) {
		
		/*String s = "kalaivananMS";
		char[] ch = s.toCharArray();
		Map<Character, Integer> mp = new TreeMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (mp.containsKey(c)) {
				Integer integer = mp.get(ch[i]);
				mp.put(c, integer+1);
				
			}
			else {
				mp.put(c, 1);
			}
		}
		
		
		Set<Entry<Character,Integer>> entrySet = mp.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);
		}*/
		
		
		String s2 ="Kalaivana MS";
		char[] ch1 = s2.toCharArray();
		Map<Character, Integer> mp1 = new TreeMap<Character,Integer>();
		for (int i = 0; i < ch1.length; i++) {
			char k= ch1[i];
			if (mp1.containsKey(k)) {
				Integer inte = mp1.get(ch1[i]);
				mp1.put(k, inte+1 );
				
			}
			else {
				mp1.put(k, 1);
			}
		
			Set<Entry<Character,Integer>> entrySet2 = mp1.entrySet();
			for (Entry<Character, Integer> entry1 : entrySet2) {
				
				System.out.println(entry1);
			}
		}
		
	}
	
	
	
	
	

}
