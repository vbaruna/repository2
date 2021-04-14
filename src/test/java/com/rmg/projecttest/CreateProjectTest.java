package com.rmg.projecttest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	
	
	@Test
	public void addProject()
	{
		JSONObject jObject=new JSONObject();
		jObject.put("createdBy", "aru");
		jObject.put("projectName", "straiten");
		jObject.put("status", "Created");
		jObject.put("teamSize", "10");
		
		jObject.put("createdBy", "aruna");
		jObject.put("projectName", "straiten1");
		jObject.put("status", "Created");
		jObject.put("teamSize", "10");
		
		
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jObject);
		Response resp = req.post("http://localhost:8084/addProject");
		Response res = req.get("http://localhost:8084/projects");
		
		 String completeBody = resp.prettyPrint();
	      System.out.println(completeBody);
	        
	        int actSc = resp.getStatusCode();
	        System.out.println(actSc);
	        
	        String actCT = resp.getContentType();
	        System.out.println(actCT);
	}
	
		
	
	
}