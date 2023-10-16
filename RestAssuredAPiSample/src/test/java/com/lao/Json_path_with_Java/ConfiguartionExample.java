package com.lao.Json_path_with_Java;

import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class ConfiguartionExample {


	/**
	 * @param args
	 */
	public static void main(String[] args) {


		String json ="[\r\n" + 
				"{\r\n" + 
				"\"name\": \"kalaivanan\",\r\n" + 
				"\"gender\":\"Male\",\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"\"name\":\"Pathiyam\",\r\n" + 
				"}\r\n" + 
				"]" ; 

		Configuration configuration =  Configuration.defaultConfiguration();
		// Configuration options = configuration.addOptions(Option.ALWAYS_RETURN_LIST );
		//configuration= configuration.addOptions(Option.SUPPRESS_EXCEPTIONS);
		configuration= configuration.addOptions(Option.REQUIRE_PROPERTIES);
		/*Configuration configuration = Configuration.builder()
				.options(Option.DEFAULT_PATH_LEAF_TO_NULL)
				.build();*/

		List<String> result = JsonPath
				.using(configuration)
				.parse(json)
				.read("$[*].gender");

		System.out.println(result);

	}

}
