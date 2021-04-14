package com.rmg.projecttest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ProjectTest 
{
	
   @Test
public void getProjects()
    {
        Response resp = RestAssured.get("http://localhost:8084/projects");
       
        String completeBody = resp.prettyPrint();
        System.out.println(completeBody);
        
        int actSc = resp.getStatusCode();
        System.out.println(actSc);
        
        String actCT = resp.getContentType();
        System.out.println(actCT);
    }
    
}

