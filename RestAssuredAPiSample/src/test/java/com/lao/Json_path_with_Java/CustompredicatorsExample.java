package com.lao.Json_path_with_Java;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;
import com.jayway.jsonpath.Predicate.PredicateContext;

public class CustompredicatorsExample {
	 
	File jsonfile = new File("src/test/resources/Bookstore.json"); 
	public void mycustomPredicator() throws IOException {
		
		/*Predicate bookWithISBN = new Predicate() {
			
		@Override
			public boolean apply(PredicateContext ctx) {
				// TODO Auto-generated method stub
				
				boolean predicate=ctx.item(Map.class).containsKey("isbn");
				return predicate;
			}
		};*/
		 Predicate bookwithISBN = ctx->ctx.item(Map.class).containsKey("isbn");

			
		List<Map<String,Object>> result=JsonPath.parse(jsonfile)
		.read("$.store.book[?].isbn",List.class,bookwithISBN);
		System.out.println(result);
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		CustompredicatorsExample custompredicatorsExample= new CustompredicatorsExample();
		custompredicatorsExample.mycustomPredicator();
		
	}

}
