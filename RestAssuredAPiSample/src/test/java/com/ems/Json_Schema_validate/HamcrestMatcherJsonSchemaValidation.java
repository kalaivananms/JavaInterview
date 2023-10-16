package com.ems.Json_Schema_validate;

import java.io.File;



import org.hamcrest.MatcherAssert;

import io.restassured.module.jsv.JsonSchemaValidator;

public class HamcrestMatcherJsonSchemaValidation {

	public void validate() {


		File inputjson = new File("src/test/resources/input.json");
		//String Jsoncontent = FileUtils.readFileToString(inputjson,"UTF-8");
		File schemajson = new File("src/test/resources/Schema.json");

		MatcherAssert.assertThat("{\r\n" + 
				"    \"first_name\": \"Kalaivanan\",\r\n" + 
				"    \"last_name\": \"MS\",\r\n" + 
				"    \"email\":\"KalaivananMs@king.com\",\r\n" + 
				"    \"Skills\":[\"creating time machine\",\"playing with giutar\"]\r\n" + 
				"}", JsonSchemaValidator.matchesJsonSchema(schemajson));

	}

}
