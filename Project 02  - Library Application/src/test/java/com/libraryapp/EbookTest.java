package com.libraryapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.libraryapp.entities.Book;

@SpringBootTest
public class EbookTest {
	
	@Test
	void ebooktest(){
		Book b1 = new Book();
		b1.setEbook("The Grass is Always Greener");
		assertEquals("The Grass is Always Greener", b1.getEbook());
		b1.setEbook("Murder!");
		assertEquals("Murder!",b1.getEbook());
	}
	
}
