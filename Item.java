package com.qa.library;

public abstract class Item{
	
	//parent class with the generic methods for creating items
	
	//items have ID, author, title, availability
	
	private static int idTag = 0;
	private int yearPublished;
	private String title;
	private int available = 1;
	private int currentYear = 2022;
	
	public Item(int yearPublished, String title, int numberAvailable) {
		this.setYearPublished(yearPublished);
		this.title = title;
		this.available = numberAvailable;
		Item.idTag = idTag++;
	}

	public static int getIdTag() {
		return idTag;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		if (available >= 0) {
			this.available = available;
		} else {
			System.out.println("Error: negative availability");
		}
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		if (yearPublished <= currentYear) {
			this.yearPublished = yearPublished;
		} else {
			System.out.println("Publication date cannot be in the future");
		}
	}

	public int getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

}
