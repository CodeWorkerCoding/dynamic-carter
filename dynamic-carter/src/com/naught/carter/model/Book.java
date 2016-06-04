package com.naught.carter.model;

/**
 * 书本商品
 * @author alen
 */
public class Book extends Commdity {

	private String author;
	private String description;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
