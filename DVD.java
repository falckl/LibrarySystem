package com.qa.library;

public class DVD extends Item {
	
	private int length;
	
	public DVD(int yearPublished, String title, int numberAvailable, int length) {
		super(yearPublished, title, numberAvailable);
		setLength(length);
		// TODO Auto-generated constructor stub
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Item summary:\n\tItem type: DVD\n\tNumber available: " + getAvailable()+ " \n\tPublished: " + getYearPublished() + "\n\tTitle: " + getTitle() + "\n\tLength: " + getLength() + " minutes\n";
	}

}
