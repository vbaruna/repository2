package com.rmg.projecttest;

import static org.junit.Assert.assertThat;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;

public class deletemethodchaining {
	
	@Test
	public void delete()
	{
		 given()
		.get("http://localhost:8084/projects");

		when()
		.delete("http://localhost:8084/projects/"+"TY_PROJ_1003")
		
		.then()
		.log().all();
		
	}

}
