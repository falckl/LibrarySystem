package com.qa.library;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private String name;
	private static int personId;
	
	private List<Item> itemsHeld = new ArrayList<>();
	
	public Person(String name) {
		this.setName(name);
		Person.personId = personId++;
	}
	
	public String getId() {
		String stringId = Integer.toString(personId);
		return stringId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//check out
	public void checkOut(Item i) {
		//reduce availability of item by 1
		//only checkOut if more than 1 available & if Item exists.
		if (i.getAvailable() > 0) {
			//add to list
			itemsHeld.add(i);
			int newAvailable = i.getAvailable() - 1;
			i.setAvailable(newAvailable);
		} else {
			System.out.println("Item unavailable");
		}
	}
	
	public void checkIn(Item i) {
		if (itemsHeld.contains(i)) {
			itemsHeld.remove(i);
			int newAvailable = i.getAvailable() + 1;
			i.setAvailable(newAvailable);
		}
	}
	
	public boolean holdingItem(Item i) {
		if (itemsHeld.contains(i)){
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Member details:\n\tID: " + getId() + "\n\tPerson name: " + getName() + "\n";
	}
	
	

}
