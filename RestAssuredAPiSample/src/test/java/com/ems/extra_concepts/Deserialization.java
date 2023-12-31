package com.ems.extra_concepts;

import com.ems.pojo_concepts.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import static io.restassured.RestAssured.*;

import java.util.Map;

import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

import io.restassured.common.mapper.TypeRef;

public class Deserialization {

	String json = "{\r\n" + 
			"    \"first_name\": \"Kalaivanan\",\r\n" + 
			"    \"last_name\": \"MSk\",\r\n" + 
			"    \"email\":\"KalaivananMs@king.com\",\r\n" + 
			"    \"Skills\":[\"creating time machine\",\"playing with giutar\"]\r\n" + 
			"}";

	public void UsingObjectMapper() throws JsonMappingException, JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();
		Employee employee = mapper.readValue(json,Employee.class);
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSkills());
	}

	public void usingJaywayJsonPath() {

		JacksonMappingProvider provider = new  JacksonMappingProvider();

		Configuration configuration = Configuration
				.builder()
				.mappingProvider(provider)
				.build();

		Employee employee = JsonPath.using(configuration)
				.parse(json)
				.read("$",Employee.class);

		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSkills()); 

	}


	public void RAJsonPath() {

		io.restassured.path.json.JsonPath jsonPath = 
				io.restassured.path.json.JsonPath.from(json);
		Employee employee = jsonPath.getObject("$",Employee.class);

		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSkills()); 
	}

	public void usingAFuction() {

		Map<String, Object>response=given()
				.baseUri("http://localhost:3000")
				.when()
				.get("/employees/7")
				.then()
				.extract()
				.body()
				.as(new TypeRef <Map<String,Object>>() {	
				});
		System.out.println(response);
		System.out.println(response.get("firstName"));
		System.out.println(response.get("LastName"));
		System.out.println(response.get("email"));
		System.out.println(response.get("Skills"));


	}

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		Deserialization deserialization= new Deserialization();
		deserialization.usingAFuction();

	}

}
