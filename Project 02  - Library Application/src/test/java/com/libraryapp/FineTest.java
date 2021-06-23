package com.libraryapp;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.libraryapp.entities.Book;
import com.libraryapp.entities.User;
import com.libraryapp.utils.FineCalculator;

public class FineTest {
	@Test
	void FineTest() {
		User user = new User();
		Book book = new Book();
		book.setReturnDate(LocalDate.now());
		List<Book> b=new ArrayList<>();
		b.add(book);
		user.setBooks(b);
		FineCalculator fin=new FineCalculator();
		boolean actual=fin.hasFineOrNot(user);
		assertEquals(false,actual);
		
		
		
	}

}
