package com.ems.extra_concepts;

import static io.restassured.RestAssured.given;


import org.testng.annotations.Test;

public class RequestSpecificationExample {
	
	@Test
	public void getAllemployeesBDD() {


		given()
		.baseUri("http://localhost:3000")
		.when()
		.get("/employees")
		.prettyPrint();

	}
	
	@Test
	public void getAnemployeeBDD() {


		given()
		.baseUri("http://localhost:3000")
		.when()
		.get("/employees/7")
		.prettyPrint();


	}

}
