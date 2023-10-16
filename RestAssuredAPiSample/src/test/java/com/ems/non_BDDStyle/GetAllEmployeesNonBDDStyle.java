package com.ems.non_BDDStyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployeesNonBDDStyle {

	@Test(enabled=false)
	public void getallemployess() {


		RestAssured.baseURI="http://localhost:3000";

		RequestSpecification requestSpecification=RestAssured.given();
		Response response = requestSpecification. request(Method.GET,"/employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());

	}

	@Test(enabled = false)
	public void Createanemployee() {

		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification requestSpecification = 
				RestAssured
				.given()
				.header("Content-Type","application/json")
				.body("{\r\n"  
						+"    \"first_name\": \"Kalaivanan\",\r\n" 
						+"    \"last_name\": \"MSK\",\r\n"  
						+"    \"email\": \"kalaivananmsk@gmail.com\"\r\n" 
						+"\r\n"
						+"}");

		Response response = requestSpecification.request(Method.POST,"/employees");

		System.out.println(response.getStatusLine());
	}

	@Test(enabled=false)
	public void UpdateAnEmployee() {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification requestSpecification = RestAssured
				.given()
				.header("Content-Type","application/json")
				.body("{\r\n" + 
						"    \"first_name\": \"sastikarajendhren\",\r\n" + 
						"    \"last_name\": \"sastika\",\r\n" + 
						"    \"email\": \"sastika@reqres.in\"\r\n" + 
						"}");
		Response response = requestSpecification.request(Method.PUT,"/employees/5");
		System.out.println(response.asPrettyString());


	}
	@Test(enabled = false)
	public void deleteanemployee() {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification requestSpecification = RestAssured
				.given();
		Response response = requestSpecification.request(Method.DELETE,"/employees/24");
		System.out.println(response.asPrettyString());
	}

	@Test
	public void getanemployee() {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification requestSpecification = RestAssured
				.given();
		Response response = requestSpecification.request(Method.GET,"/employees/5");
		System.out.println(response.asPrettyString());
	}


}
