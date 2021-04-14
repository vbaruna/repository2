package com.petstore.pojo;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class CreatePet {
	@Test
	public void createPet() {
		Category category = new Category(123, "Animal");
		Tags[] tag = new Tags[] {new Tags(23456, "Dog")};
		String[] photourls=new String[] {"url"};
		PetStorePojo pet = new PetStorePojo(123, category, "Shizu", photourls, tag, "available");
		
		
		given()
			.contentType(ContentType.JSON)
			.body(pet)
		.when().
			post("https://petstore.swagger.io/v2/pet")
		.then()
			.log().all();
		
			
	}
}
