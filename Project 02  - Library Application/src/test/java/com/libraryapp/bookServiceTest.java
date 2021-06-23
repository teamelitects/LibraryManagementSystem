package com.libraryapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.libraryapp.DAO.BookRepository;
import com.libraryapp.entities.Book;
import com.libraryapp.services.BookService;


@SpringBootTest
public class bookServiceTest {
	
	@Autowired
	public BookRepository repo; 
	
	@Autowired
	public BookService service;
	
	@Test
	public void getByTitleTest() {
		String title="Murder!";
		Book b1 = new Book(10,title, "Robert C. Martin", 2020, 2,"click here");
		assertEquals(b1.getTitle(), service.getByTitle(title).stream().filter(a -> a.getTitle().equals("Murder!"))
				.findFirst().get().getTitle());
		
	}
	
	@Test
	public void getByAuthorTest() {
		String author="Steve McConnell";
		Book b2 = new Book(11,"Goodbye to all cats", "Steve McConnell", 2012, 1, "click here");
		assertEquals(b2.getAuthor(), service.getByAuthor(author).stream().filter(a -> a.getAuthor().equals("Steve McConnell"))
				.findFirst().get().getAuthor());
	}
	
	@Test
	public void getByTitleAndAuthorTest() {
		String author="Gayle Laakmann McDowell";
		String title = "Cracking the Coding Interview";
		Book b3 = new Book(18,"Cracking the Coding Interview", "Gayle Laakmann McDowell", 2018, 3,"click here");
		assertEquals(b3.getTitle(), service.getByTitle(title).stream().filter(a -> a.getTitle().equals("Cracking the Coding Interview"))
				.findFirst().get().getTitle());
		assertEquals(b3.getAuthor(), service.getByAuthor(author).stream().filter(a -> a.getAuthor().equals("Gayle Laakmann McDowell"))
				.findFirst().get().getAuthor());
	}
	
	
	@Test
	public void findByIdTest() 
	{
		long id = 9;
		Book book =new Book(9,"The Grass is Always Greener", "David Thomas, Andrew Hunt", 2006, 1,"click here");
		assertEquals(book.getBookId(), service.findById(id).getBookId());
	}

	
	
}