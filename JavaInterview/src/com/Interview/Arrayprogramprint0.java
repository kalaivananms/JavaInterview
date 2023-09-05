package com.Interview;

public class Arrayprogramprint0 {


	public static void main(String[] args) {

		int[] array = {0,3,0,3,0,3,0,3};

		// Fill the first four elements with zeros
		for (int i = 0; i < 4; i++) {
			array[i] = 0;
		}

		// Fill the next four elements with threes
		for (int i = 4; i < 8; i++) {
			array[i] = 3;
		}

		// Print the array
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

}


