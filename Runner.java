package com.qa.library;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an item of each type
		
		Book book1 = new Book(1815, "Pride and Prej", 1, "Period Drama", "Janet Austen");
		System.out.println(book1.toString());
		
		Magazine mag1 = new Magazine(1999, "Vogue", 1, "Fashion");
		System.out.println(mag1.toString());
		
		DVD dvd1 = new DVD(2009, "Avatar", 1, 162);
		System.out.println(dvd1.toString());
		
		System.out.println(book1.readable());
		
		
		Library library = new Library();
		library.addItem(book1);
		library.addItem(mag1);
		library.addItem(dvd1);
		
		library.getItemList();
		
//		library.removeItem(book1);
//		library.removeItem(mag1);
//		library.removeItem(dvd1);
//		
//		library.getItemList();
		
		Person person1 = new Person("Juliet");
		person1.checkOut(dvd1);
		person1.checkIn(dvd1);
		System.out.println(dvd1.toString());
		
		library.addMember(person1);
		library.updateMember(person1, "Janet");
		System.out.println(person1);
		
		library.updateItem(book1, 1813, "Pride and Prejudice", 3, "Romance novel", "Jane Austen");
		System.out.println(book1);
		
		dvd1.setYearPublished(2034);
		System.out.println(dvd1.toString());
		
		library.countItems();
		
	}
	
	

}
