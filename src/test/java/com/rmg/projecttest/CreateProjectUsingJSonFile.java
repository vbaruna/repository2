package com.rmg.projecttest;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectUsingJSonFile {
	
	
	@Test
	public void createProjectUsingJsonFile()
	{
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		 req.body(new File("./test-output/ar.json"));
		
		Response res = req.post("http://localhost:8084/addProject");
		
	
		System.out.println(res.getContentType());
		System.out.println(res.getStatusCode());
		
		res.prettyPrint();  
	}

}
