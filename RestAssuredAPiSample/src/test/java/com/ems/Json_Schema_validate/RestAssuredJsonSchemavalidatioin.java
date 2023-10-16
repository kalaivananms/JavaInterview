package com.ems.Json_Schema_validate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.internal.support.FileReader;
import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredJsonSchemavalidatioin {

	@Test(enabled=false)
	public void validationusingJsonschemainclassPath() {

		File inputjson = new File("src/test/resources/input.json");
		//File SchemaJson = new File("src/test/resources/Schema.json");
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(inputjson)
		.when()
		.post("/employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schema.json")); 
	}

	@Test
	public void vaildationusingMatchesJsonSchema() throws FileNotFoundException {

		File inputjson = new File("src/test/resources/input.json");
		//File Schemainputjson = new File("src/test/resources/Schema.json");
		//InputStream inputSchema = new FileInputStream("src/test/resources/Schema.json");
		FileReader inputSchema = new FileReader(); 
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(inputjson)
		.when()
		.post("/employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema("{\r\n" + 
				"	\"$schema\": \"http://json-schema.org/draft-04/schema#\",\r\n" + 
				"	\"type\": \"object\",\r\n" + 
				"	\"properties\": {\r\n" + 
				"		\"first_name\": {\r\n" + 
				"			\"type\": \"string\"\r\n" + 
				"		},\r\n" + 
				"		\"last_name\": {\r\n" + 
				"			\"type\": \"string\"\r\n" + 
				"		},\r\n" + 
				"		\"email\": {\r\n" + 
				"			\"type\": \"string\"\r\n" + 
				"		},\r\n" + 
				"		\"Skills\": {\r\n" + 
				"			\"type\": \"array\",\r\n" + 
				"			\"items\": [\r\n" + 
				"				{\r\n" + 
				"					\"type\": \"string\"\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"type\": \"string\"\r\n" + 
				"				}\r\n" + 
				"			]\r\n" + 
				"		}\r\n" + 
				"	},\r\n" + 
				"	\"required\": [\r\n" + 
				"		\"first_name\",\r\n" + 
				"		\"last_name\",\r\n" + 
				"		\"email\",\r\n" + 
				"		\"Skills\"\r\n" + 
				"	]\r\n" + 
				"}"));
	}
}
