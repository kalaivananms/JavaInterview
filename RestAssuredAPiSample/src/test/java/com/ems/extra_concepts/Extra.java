package com.ems.extra_concepts;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Extra {
	
	public static void main(String[] args) {
		
		String s ="Welcome";

		char[] ch =s.toCharArray();
		
		Map<Character,Integer> m = new TreeMap<Character,Integer>();

		for( int i=0 ;i<ch.length;i++){

		char c = ch[i];
		if(m.containsKey(c)) {

		Integer integer = m.get(ch[i]);
		m.put(c, integer+1);
		}
		
		else{

		m.put(c,1);
		}
	}
		Set<Entry<Character,Integer>> entrySet = m.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			
			System.out.println(entry);
		}

}
}
