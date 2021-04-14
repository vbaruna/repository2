package com.rmg.projecttest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ProjectTestWith_BDD {
	
	@Test
	
	public void getAllProjects()
	{
		
		when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().statusCode(200)
		.and()
		.assertThat().contentType(ContentType.JSON)
		.log().all();
		
	}

}
