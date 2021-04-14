package com.rmg.projecttest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PathParamater {
	
	
	@Test
	public void pathPram() {
		/*RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		
		req.pathParam("projectId", "TY_PROJ_805");
		Response res = req.get("http://localhost:8084/projects/{projectId}");
		
		res.prettyPrint();*/
		
		given()
		
		.contentType(ContentType.JSON)
		.baseUri("http://localhost:8084")
		.pathParam("projectId","TY_PROJ_804")
		.when()
		.delete("/projects/{projectId}")
		.then()
		.log().all();

	}

}
