package com.libraryapp;
import java.time.LocalDate; 
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.libraryapp.entities.Book;
import com.libraryapp.entities.User;
import com.libraryapp.services.BookService;
import com.libraryapp.services.NotificationService;
import com.libraryapp.services.UserService;
import com.libraryapp.utils.MidnightApplicationRefresh;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Autowired
	BookService bookService;
	
	@Autowired
	UserService usService;
	
	@Autowired
	NotificationService notifService;
	
	@Autowired
	BCryptPasswordEncoder pwEncoder;
	
	@Autowired
	MidnightApplicationRefresh midAppRef;
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
		
			User user1 = new User("admin", pwEncoder.encode("test"), "itssukeshhere@gmail.com", "Sukesh", "Goud", "Huizumerlaan 158", "06-11433823", "Hyderabad");
			user1.setRole("ROLE_ADMIN");
			
			User user2 = new User("sukesh", pwEncoder.encode("test"), "itssukeshhere@gamail.com", "Sukesh", "Goud", "Hugo de Grootstraat 174", "06-87054875", "Hyderabad");
			user2.setRole("ROLE_EMPLOYEE");
			
			User user3 = new User("krishna", pwEncoder.encode("test"), "mskr2424@gmail.com", "Sai Krishna", "Reddy", "Leidijk 97", "06-18756892", "Hyderabad");
			user3.setRole("ROLE_USER");
			User user4 = new User("kajal", pwEncoder.encode("test"), "2424@gmail.com", "Kajal", "Sahu", "Leidijk 97", "06-18756892", "Hyderabad");
			user3.setRole("ROLE_USER");
			User user5 = new User("naveen", pwEncoder.encode("test"), "24fdd24@gmail.com", "Naveen", "Kumar", "Leidijk 97", "06-18756892", "Hyderabad");
			user3.setRole("ROLE_USER");
			User user6 = new User("kasturi", pwEncoder.encode("test"), "24fdd24@gmail.com", "Kasturi", "Priya", "Leidijk 97", "06-18756892", "Hyderabad");
			user3.setRole("ROLE_USER");
			User user7 = new User("sandeep", pwEncoder.encode("test"), "24fdd24@gmail.com", "Sandeep", "B", "Leidijk 97", "06-18756892", "Hyderabad");
			user3.setRole("ROLE_USER");
			User user8 = new User("sushmitha", pwEncoder.encode("test"), "24fdd24@gmail.com", "Sushmitha", "Sush", "Leidijk 97", "06-18756892", "Hyderabad");
			user3.setRole("ROLE_USER");
			usService.save(user1);
			usService.save(user2);
			usService.save(user3);
			usService.save(user4);
			usService.save(user5);
			usService.save(user6);
			usService.save(user7);
			usService.save(user8);
			
			Book book1 = new Book(9,"The Grass is Always Greener", "David Thomas, Andrew Hunt", 2006, 1,"click here");
			Book book2 = new Book(10,"Murder!", "Robert C. Martin", 2020, 2,"click here");
			Book book3 = new Book(11,"Goodbye to all cats", "Steve McConnell", 2012, 1, "click here");
			Book book4 = new Book(12,"The Travellers story of a terribly strange bed", "Martin Fowler", 2017, 4,"click here");
			Book book5 = new Book(13,"	An Occurrence at Owl Creek Bridge One of the Missing", "Eric Freeman, Bert Bates, Kathy Sierra, Elisabeth Robson", 2019, 5,"click here");
			Book book6 = new Book(14,"The Mythical Man-Month", "Frederick P. Brooks Jr", 1999, 1,"click here");
			Book book7 = new Book(15,"The Clean Coder", "Robert Martin", 2021, 3,"click here");
			Book book8 = new Book(16,"Working Effectively with Legacy Code", "Micheal Feathers", 2015, 1,"click here");
			Book book9 = new Book(17,"Design Patterns", "Erich Gamma, Richard Helm. Ralph Johnson, John Vlissides", 2019, 2,"click here");
			Book book10 = new Book(18,"Cracking the Coding Interview", "Gayle Laakmann McDowell", 2018, 3,"click here");
			Book book11 = new Book(19,"Rework", "Jason Fried, David Heinemeier Hansson", 2011, 1,"click here");
			Book book12 = new Book(20,"Don't Make Me Think", "Steve Krug", 2005, 1,"click here");
			Book book13 = new Book(21,"Code", "Charles Petzold", 2017, 1,"click here");
			Book book14 = new Book(22,"Peopleware", "Tom DeMarco, Tim Lister", 2013, 3,"click here");
			Book book15 = new Book(23,"Introduction to Algorithms", "Thomas H. Cormen", 2020, 2,"click here");
			Book book16 = new Book(24,"Programming Pearls", "Jon Bently", 1998, 1,"click here");
			Book book17 = new Book(25,"Patterns of Enterprice Application Architecture", "Martin Fowler", 2020, 2,"click here");
			Book book18 = new Book(26,"Structure and Interpretation of Computer Programs", "Harold Abelson, Gerald Jay Sussman, Julie Sussman", 2013, 1,"click here");
			Book book19 = new Book(27,"The Art of Computer Programming", "Donald E. Knuth", 2014, 4,"click here");
			Book book20 = new Book(28,"Domain-Driven Design", "Eric Evans", 2010, 2,"click here");
			Book book21 = new Book(29,"Coders at Work", "Peter Seibel", 2009, 1,"click here");
			Book book22 = new Book(30,"Rapid Development", "Steve McConnell", 1995, 6,"click here");
			Book book23 = new Book(31,"The Self-Taught Programmer", "Cory Althoff", 2021, 1,"click here");
			Book book24 = new Book(32,"Algorithms", "Robert Sedgewick, Kevin Wayne", 2000, 3,"click here");
			Book book25 = new Book(33,"Continuous Delivery", "Jez Humble, David Farley", 2003, 1,"click here");
			
			bookService.save(book1);
			bookService.save(book2);
			bookService.save(book3);
			bookService.save(book4);
			bookService.save(book5);
			bookService.save(book6);
			bookService.save(book7);
			bookService.save(book8);
			bookService.save(book9);
			bookService.save(book10);
			bookService.save(book11);
			bookService.save(book12);
			bookService.save(book13);
			bookService.save(book14);
			bookService.save(book15);
			bookService.save(book16);
			bookService.save(book17);
			bookService.save(book18);
			bookService.save(book19);
			bookService.save(book20);
			bookService.save(book21);
			bookService.save(book22);
			bookService.save(book23);
			bookService.save(book24);
			bookService.save(book25);
			
			book10.setTheUser(user3);
			book10.setReturnDate(LocalDate.of(2021, 6, 23));
			
			book1.setTheUser(user3);
			book1.setReturnDate(LocalDate.of(2021, 6, 10));
			
			user3.setBooks(Arrays.asList(book10, book1));
			
			bookService.save(book1);
			bookService.save(book10);
			usService.save(user3);
			
			book2.setTheUser(user4);
			book2.setReturnDate(LocalDate.of(2021, 6, 23));
			
			book3.setTheUser(user4);
			book3.setReturnDate(LocalDate.of(2021, 6, 10));
			
			user4.setBooks(Arrays.asList(book2, book3));
			
			bookService.save(book2);
			bookService.save(book3);
			usService.save(user4);
			
			book4.setTheUser(user5);
			book4.setReturnDate(LocalDate.of(2021, 6, 23));
			
			book5.setTheUser(user5);
			book5.setReturnDate(LocalDate.of(2021, 6, 10));
			
			user5.setBooks(Arrays.asList(book5, book4));
			
			bookService.save(book4);
			bookService.save(book5);
			usService.save(user5);
			
			book10.setTheUser(user6);
			book10.setReturnDate(LocalDate.of(2021, 6, 23));
			
			book1.setTheUser(user3);
			book1.setReturnDate(LocalDate.of(2021, 6, 10));
			
			user6.setBooks(Arrays.asList(book10, book1));
			
			bookService.save(book1);
			bookService.save(book10);
			usService.save(user6);
			
			book10.setTheUser(user7);
			book10.setReturnDate(LocalDate.of(2021, 6, 23));
			
			book1.setTheUser(user7);
			book1.setReturnDate(LocalDate.of(2021, 6, 10));
			
			user7.setBooks(Arrays.asList(book10, book1));
			
			bookService.save(book1);
			bookService.save(book10);
			usService.save(user7);
			
			book10.setTheUser(user8);
			book10.setReturnDate(LocalDate.of(2021, 6, 23));
			
			book1.setTheUser(user8);
			book1.setReturnDate(LocalDate.of(2021, 6, 10));
			
			user8.setBooks(Arrays.asList(book10, book1));
			
			bookService.save(book1);
			bookService.save(book10);
			usService.save(user8);
		
						
			midAppRef.midnightApplicationRefresher();	
		};
	}
}
