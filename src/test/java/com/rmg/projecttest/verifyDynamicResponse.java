package com.rmg.projecttest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.List;

import io.restassured.response.Response;

public class verifyDynamicResponse {
	
	@Test
	
	public void verifyProjectName()
	{
		String expectedData = "teju";
		
		Response resp = when()
				      .get("http://localhost:8084/projects");
		List<String> list = resp.jsonPath().get("createdBy");
		
		    for (String string : list) {
		    	if (string.equals(expectedData)) 
		    	{
					System.out.println(expectedData + "==> is available in Dynamic response");
					break;
				}
		    	resp.then().log().all();
				
			}
				
	}

}
