package com.qa.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Item> items = new ArrayList<>();
	private List<Person> members = new ArrayList<>();
	
	//adding and removing items from the library system 
	//(do not adjust items in this list for checking in items or checking out items, instead change number available)
	
	public void addItem(Item i) {
		//if item in list, remove it
			if (items.contains(i) == false) {
				items.add(i);
			}
	}
	
	public void removeItem(Item i) {
		if (items.contains(i)) {
			items.remove(i);
		}
	}
	
	public void getItemList() {
		System.out.println(items);
	}
	
	public void addMember(Person p) {
		if (members.contains(p) == false) {
			members.add(p);
		}
	}
	
	public void removeMember(Person p) {
		if (members.contains(p)) {
			members.remove(p);
		}
	}
	
	public void updateMember(Person p, String name) {
		if (members.contains(p)) {
			p.setName(name);
		}
	}
	
	//use overloading for updating different items.
	//update Book
	public void updateItem(Book b, int yearPublished, String title, int numberAvailable, String genre, String author) {
		if (items.contains(b)) {
			b.setAvailable(numberAvailable);
			b.setGenre(genre);
			b.setTitle(title);
			b.setYearPublished(yearPublished);
			b.setAuthor(author);
		}
	}
	
	//update Magazine
	public void updateItem(Magazine m, int yearPublished, String title, int numberAvailable, String category) {
		if (items.contains(m)) {
			m.setAvailable(numberAvailable);
			m.setCategory(category);
			m.setTitle(title);
			m.setYearPublished(yearPublished);
		}
	}
	
	//update DVD
	public void updateItem(DVD d, int yearPublished, String title, int numberAvailable, int length) {
		if (items.contains(d)) {
			d.setAvailable(numberAvailable);
			d.setLength(length);
			d.setTitle(title);
			d.setYearPublished(yearPublished);
		}
	}
	
	public int countItems() {
		return items.size();
	}
	
	public int countUnique() {
		return (int) items.stream().distinct().count();
	}
	
	public boolean containsItem(Item i) {
		if (items.contains(i)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean containsMember(Person p) {
		if (members.contains(p)) {
			return true;
		} else {
			return false;
		}
	}

}
