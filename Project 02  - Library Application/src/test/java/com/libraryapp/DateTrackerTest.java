package com.libraryapp;
import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.libraryapp.entities.Book;
import com.libraryapp.entities.User;
import com.libraryapp.services.BookService;
import com.libraryapp.utils.DateTracker;
import com.libraryapp.utils.FineCalculator;



public class DateTrackerTest {
	@Test
	void dateDiff() {
		Book book=new Book();
		book.setReturnDate(LocalDate.now());
		DateTracker ob=new DateTracker();
		int actual=ob.getWeeksToExtendReturnDate(book);
		assertEquals(1,actual);
	}
	@Test
	void getReservationDate() {
		Book book=new Book();
		book.setReturnDate(LocalDate.now());
		DateTracker ob=new DateTracker();
		String actual=ob.getReservationDatesInString(book);
		assertEquals("2021-06-24   /   2021-07-01",actual);
	}
	
}
