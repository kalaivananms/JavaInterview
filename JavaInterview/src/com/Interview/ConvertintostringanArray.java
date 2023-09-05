package com.Interview;

import java.util.ArrayList;

public class ConvertintostringanArray {

	
	public static void main(String[] args) {
		
		
		/*ArrayList<String> k = new ArrayList<String>();
		k.add("kalaivanan MS");
		k.add("krrish ");
		k.add("pathiyam ");
		k.add("looose");
		k.add("adiga");
		
		String[] s = new String [k.size()];
		
		for (int i = 0; i < k.size(); i++) {
			String h = k.get(i);
		}
		for (String kk : s) {
			System.out.println(kk);
		}*/
		
		
		String s = "kalaivanan";
		String s1 ="MS";
		String[] stri = s.split(" ");
		
		System.out.println("String :"+s);
		System.out.println("String Array :[");
		
		for (int i = 0; i < stri.length; i++) {
			System.out.println(stri[i]+"MS");
		}
		System.out.print("]");
			
	}
}


