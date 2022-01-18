package com.qa.library;

public class Book extends Item implements Readable{
	
	public Book(int yearPublished, String title, int numberAvailable, String genre, String author) {
		super(yearPublished, title, numberAvailable);
		setGenre(genre);
		setAuthor(author);
		// TODO Auto-generated constructor stub
	}

	private String genre;
	private String author;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public boolean readable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Item summary:\n\tItem type: Book\n\tNumber available: " + getAvailable() + "\n\tYear Published: " 
				+ getYearPublished() + "\n\tTitle: " + getTitle() + "\n\tGenre: " + getGenre() + "\n\tAuthor: " + getAuthor() + "\n";
	}
	
	

}
