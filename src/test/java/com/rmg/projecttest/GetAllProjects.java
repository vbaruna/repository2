package com.rmg.projecttest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class GetAllProjects {
	
	@Test
	public void getProject()
	{
		given()
		
		.contentType(ContentType.JSON)
		.baseUri("http://localhost:8084")
		.when()
		.get("/projects")
		.then()
		.log().all();
		
	}

}
