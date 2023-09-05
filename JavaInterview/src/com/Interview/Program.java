package com.Interview;

	public class Program {
		
		
		    public static void main(String[] args) {
		        String input = "abc#$#23asc";
		        
		        StringBuilder characters = new StringBuilder();
		        StringBuilder specialCharacters = new StringBuilder();
		        StringBuilder numbers = new StringBuilder();
		        
		        for (int i = 0; i < input.length(); i++) {
		            char c = input.charAt(i);
		            
		            if (Character.isLetter(c)) {
		                characters.append(c);
		            } else if (Character.isDigit(c)) {
		                numbers.append(c);
		            } else {
		                specialCharacters.append(c);
		            }
		        }
		        
		        System.out.println("Characters: " + characters.toString());
		        System.out.println("Special Characters: " + specialCharacters.toString());
		        System.out.println("Numbers: " + numbers.toString());
		    }
		}
	


