package com.Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayIndividualreverse {

	public static void main(String[] args) {
		
		String str="kalaivanan as a Software engineer";
		String result = Arrays.asList(str.split(" "))
				.stream()
				.map(s-> new StringBuilder(s).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(result);
	}
}
