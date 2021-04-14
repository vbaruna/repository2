package com.rmg.projecttest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

public class verifyStaticResponse {

	
	@Test
	public void verifystaticresponse()
	{
		String expectedData = "aru";
		
		Response resp = when()
				     .get("http://localhost:8084/projects");
		String actprojectName = resp.jsonPath().get("[1].createdBy");
		resp.then()
		.log();
		Assert.assertEquals(actprojectName, expectedData);
		
		
	}
}
