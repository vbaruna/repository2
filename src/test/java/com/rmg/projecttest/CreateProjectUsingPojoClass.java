package com.rmg.projecttest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectUsingPojoClass {
	
	@Test
	public void createProjectTest()
	{
		ProjectPojo reqBody = new ProjectPojo("aruna", "06/04/21", "TY_03", "skilled", "completed",05);
		/*RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(reqBody);
		
		Response res = req.post("http://localhost:8084/addProject");
		System.out.println(res.getStatusCode());
		res.prettyPrint();*/
		
		given()
		.body(reqBody)
		.contentType(ContentType.JSON)
		.baseUri("http://localhost:8084")
		.when()
		.get("/projects/TY_PROJ_804")
		.then()
		.log().body();

		

	}

}
