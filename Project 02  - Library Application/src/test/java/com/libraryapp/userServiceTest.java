package com.libraryapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.libraryapp.DAO.UserRepository;
import com.libraryapp.entities.User;
import com.libraryapp.services.UserService;


@SpringBootTest
public class userServiceTest {
	
	@Autowired
	public UserRepository repo; 
	
	@Autowired
	public UserService service;
	
	@Test
	public void getByFirstNameTest() {
		String name="Kasturi";
		User u1 = new User("kasturi", "test", "24fdd24@gmail.com", name, "Priya", "Leidijk 97", "06-18756892", "Hyderabad");
		assertEquals(u1.getFirstName(), service.getByFirstName(name).stream().filter(a -> a.getFirstName().equals("Kasturi"))
				.findFirst().get().getFirstName());
		
	}
	
	@Test
	public void getByLastNameTest() {
		String name="Priya";
		User u1 = new User("kasturi", "test", "24fdd24@gmail.com", "Kasturi", name , "Leidijk 97", "06-18756892", "Hyderabad");
		assertEquals(u1.getLastName(), service.getByLastName(name).stream().filter(a -> a.getLastName().equals("Priya"))
				.findFirst().get().getLastName());
		
	}
	
	@Test
	public void getByFullNameTest() {
		String fname="Kasturi";
		String lname= "Priya";
		User u1 = new User("kasturi", "test", "24fdd24@gmail.com", fname, lname , "Leidijk 97", "06-18756892", "Hyderabad");
		assertEquals(u1.getFirstName(), service.getByFirstName(fname).stream().filter(a -> a.getFirstName().equals("Kasturi"))
				.findFirst().get().getFirstName());
		assertEquals(u1.getLastName(), service.getByLastName(lname).stream().filter(a -> a.getLastName().equals("Priya"))
				.findFirst().get().getLastName());
		
		
	}
	
}
