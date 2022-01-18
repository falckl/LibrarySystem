package com.qa.library;

public class Magazine extends Item implements Readable {
	
	private String category;
	
	public Magazine(int yearPublished, String title, int numberAvailable, String category) {
		super(yearPublished, title, numberAvailable);
		setCategory(category);
		// TODO Auto-generated constructor stub
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public boolean readable() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Item summary:\n\tItem type: Magazine\n\tNumber available: "+ getAvailable() + "\n\tPublished: " + getYearPublished() + "\n\tTitle: " + getTitle() + "\n\tCategory: " + getCategory()+ "\n";
	}
	
	
	
	

}
