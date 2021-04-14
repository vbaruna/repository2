package com.petstore.pojo;

public class PetStorePojo {
	int id;
	Category category;
	String name;
	String[] photourls;
	Tags[] tags;
	String status;
	public PetStorePojo(int id, Category category, String name, String[] photourls, Tags[] tags, String status) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.photourls = photourls;
		this.tags = tags;
		this.status = status;
	}
	public PetStorePojo() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getPhotourls() {
		return photourls;
	}
	public void setPhotourls(String[] photourls) {
		this.photourls = photourls;
	}
	public Tags[] getTags() {
		return tags;
	}
	public void setTags(Tags[] tags) {
		this.tags = tags;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
		
	}
	

}
class Category{
	
	int id;
	String name;
	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Category() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

class Tags{
	int id;
	String name;
	public Tags(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Tags() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}