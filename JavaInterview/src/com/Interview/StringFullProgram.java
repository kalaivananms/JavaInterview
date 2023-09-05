/*package com.Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.Set;
import java.util.TreeMap;

public class StringFullProgram {


	public static void main(String[] args) {

	//Reverse the Program
	//=======================	
	String s = "Kalaivanan as a Software Testing engineer";
	String rev=" ";

	for (int i = s.length()-1; i>=0; i--) {
		rev= rev+s.charAt(i);

	}
	System.out.println(rev);

	//String reverse the without using forloop and while loop 
	//using only Method and condition 
	//============================================================================================
	String s1= "Kalaivanan as a Software Testing engineer";
	String[] str = s1.split(" ");

	Collections.reverse(Arrays.asList(str));
	System.out.println(String.join(" ", str));

	//reverse the program of using while condition 
    //===========================================================================================
	String s2="Kalaivanan as a Software Testing engineer";
	int i = s.length();
	while (i>0) {
		char c =s.charAt(i-1);
		System.out.print(c);
		i--;
	}

	//String Occurences.
	//========================================================================================
	String s3="Kalaivanan as a Software Testing engineer";
	char[] ch = s3.toCharArray();

	Map<Character, Integer> mp = new  TreeMap<Character, Integer>();
	for (int j = 0; j < ch.length; j++) {
		char c= ch[j];
		if (mp.containsKey(c)) {
			Integer inte = mp.get(ch[j]);
			mp.put(c, inte+1);

		}
		else {
			mp.put(c, 1);
		}
		Set<Entry<Character,Integer>> entrySet = mp.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {

			System.out.println(entry);
		}

	}

	//String Operation.
	//==========================================================================================
	String s4 = "kalaivanan";

    // Length of the string
    int length = s4.length();
    System.out.println("Length of the string: " + length);

    // Accessing characters in the string
    char firstChar = s4.charAt(0);
    char lastChar = s4.charAt(length - 1);
    System.out.println("First character: " + firstChar);
    System.out.println("Last character: " + lastChar);

    // Substring
    String substring = s4.substring(3, 8);
    System.out.println("Substring from index 3 to 7: " + substring);

    // Check if the string contains a specific substring
    boolean contains = s4.contains("ivan");
    System.out.println("Contains 'ivan': " + contains);

    // Replace characters
    String replaced = s4.replace('a', 'A');
    System.out.println("String with 'a' replaced by 'A': " + replaced);

    // Uppercase and lowercase
    String uppercase = s4.toUpperCase();
    String lowercase = s4.toLowerCase();
    System.out.println("Uppercase: " + uppercase);
    System.out.println("Lowercase: " + lowercase);


    //String Spilt the Special Character

    String s1= "MphaSis!@#123";

	int s= 0,c=0,n=0,ch=0;
	String small = "",caps ="",digit="",spcl="";

	for( int i=0;i<s1.length();i++){

		char a = s1.charAt(i);
		if (a>=97&&a<=122) {
			s++;
			small=small+a;	
		}
		else if (a>=65&&a<=90) {
			c++;
			caps=caps+a;
		}
		else if (a>=48&&a<=57) {
			n++;
			digit=digit+a;
		}
		else {
			ch++;
			spcl=spcl+a;
		}
	}

	System.out.println("Captial=======>"+c+"=====>"+caps);
		System.out.println("Small======>"+s+"=====>"+small);
		  System.out.println("Digit=====>"+n+"==========>"+digit);
		  System.out.println("Special Character====>"+ch+"======>"+spcl);


    //String print on only first 2 letter Print 
    //===================================================================================
    String s5 = "kalaivanan";

    // Print only the first two characters
    String firstTwoChars = s5.substring(2, 4);
    System.out.println("First two characters: " + firstTwoChars);

    //Declare the String mail Style 

    String email = "kalaivananms@gmail.com";

    // Find the index of the "@" symbol.
    int atIndex = email.indexOf("@");

    // Extract the substring before the "@".
    String username = email.substring(0, atIndex);

    // Print the extracted substring
    System.out.println("Username is : " + username);


   // convert to the String into the Array.
    //======================================================================================
    String s6 = "kalaivanan";
	String ss ="MS";
	String[] stri = s6.split(" ");

	System.out.println("String :"+s6);
	System.out.println("String Array :[");

	for (int k = 0; k < stri.length; k++) {
		System.out.println(stri[k]+"MS");
	}
	System.out.print("]");



    //Remove the Duplicate the String
   //========================================================================================== 
	String kk = "kalaivanan";
	String k2=kk.replace("" ,"");
	String k3 = "";
	System.out.println(k2);
	char[] chh =k2.toCharArray();
	Map<Character, Integer> mp1= new LinkedHashMap<>();

	for (int b=0;b<chh.length;b++){

	if (mp1.containsKey(chh[b])){
	}
	else{
	mp1.put(chh[b],1);
	}}

	Set<Entry<Character,Integer>> entrySet = mp1.entrySet();
	for(Entry<Character,Integer> entry :entrySet){
	s=s+entry.getKey();
	}
	System.out.println(kk); 

    // Reverse the Given String
	//==========================================================================================
	String v ="Kalaivanan as A Software testing Engineer";
	Pattern v1= Pattern.compile(" ");
	System.out.println("The original String is :"+v);
	String[] temp = v1.split(v);
	String reve="";
	for (int R = 0; R < temp.length; R++) {
		if (R==temp.length-1) {
			reve= temp[R]+reve;
		}
			else {
				reve="  "+temp[R]+reve;

			}
			System.out.println("The reverse the string is:"+ reve);
		}



	//Reverse the Word of string using for loop and for each
	//=======================================================================================
	String  m= "kalaivanan MS ";
	String m2 ="";
	 String[] m3 = m.split(" ");

	 for (String str2 : m3) {

		 String m4 = "";
		 for (int o = str2.length()-1; o >=0 ; o--) {
			char c = str2.charAt(o);
			m4=m4+c;
		 }
		 m2=m2+m4+"";

	}
	 System.out.println("To print the reverse the words of string :" +m2);
}

	//String Split the Special Character , numerical and words

	     String input = "abc#$#23asc";

	     StringBuilder characters = new StringBuilder();
	     StringBuilder specialCharacters= new StringBuilder();
	     StringBuilder numbers= new StringBuilder();
    StringBuilder characters = new StringBuilder();
    StringBuilder specialCharacters = new StringBuilder();
    StringBuilder numbers = new StringBuilder();

    for (int  t= 0; t < input.length(); t++) {
        char mk = input.charAt(t);

        if (Character.isLetter(mk)) {

            characters.append(mk);
        } else if (Character.isDigit(mk)) {
            numbers.append(mk);
        } else {
            specialCharacters.append(mk);
        }
    }

    System.out.println("Characters: " + characters.toString());
    System.out.println("Special Characters: " + specialCharacters.toString());
    System.out.println("Numbers: " + numbers.toString());


   //Slpit the special character and numbers and Symbol 
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
}*/