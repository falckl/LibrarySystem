package com.qa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.library.Book;
import com.qa.library.Library;
import com.qa.library.Person;

public class LibraryTest {
	
	private Library library = new Library();
	private Book book = new Book(1986, "It", 2, "Horror", "Stephen King");
	private Person person = new Person("John");
	
	@Test
	//adding item to list
	void testAddItem() {
		library.addItem(book);
		assertEquals(true, library.containsItem(book));
	}
	
	@Test
	//remove item from list
	void testRemoveItem() {
		library.removeItem(book);
		assertEquals(false,library.containsItem(book));
	}
	
	@Test
	//adding Member to list
	void testAddMember() {
		//check member list contains new member
		library.addMember(person);
		assertEquals(true,library.containsMember(person));
	}
	
	@Test
	//remove Member from list
	void testRemoveMember() {
		library.removeMember(person);
		assertEquals(false,library.containsMember(person));
	}
	
	@Test
	//update item
	void testUpdateItem() {
		//update item
		library.addItem(book);
		library.updateItem(book, 1986, "It", 4, "Horror", "Stephen King");
		Book book1 = new Book(1986, "It", 4, "Horror", "Stephen King");
		assertEquals(true, book.getAuthor().equals(book1.getAuthor()) && book.getTitle().equals(book1.getTitle())
				&& book.getYearPublished() == (book1.getYearPublished()) && book.getGenre().equals(book1.getGenre())
				&& book.getAvailable() == (book1.getAvailable()));
	}
	
	@Test
	//update Member
	void testUpdateMember() {
		library.addMember(person);
		library.updateMember(person, "Joe");
		Person person1 = new Person("Joe");
		assertEquals(true, person.getName().equals(person1.getName()));
	}
	
	@Test
	//availability non-negative
	void testAvailability() {
		assertEquals(2, book.getAvailable());
	}
	
	@Test
	//check out item
	void testCheckOut() {
		//item in person's list
		person.checkOut(book);
		assertEquals(true, person.holdingItem(book));
	}
	
	@Test
	//check in item
	void testCheckIn() {
		//item no longer in person's list
		person.checkIn(book);
		assertEquals(false, person.holdingItem(book));
	}
	
	@Test
	//no duplicate ID
	void testUniqueId() {
		assertEquals(library.countItems(), library.countUnique() );
	}
	

}
