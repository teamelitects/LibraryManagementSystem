package com.libraryapp;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import com.libraryapp.entities.User;


@SpringBootTest
public class UserTests {

	@Test
	public void contextLoads() {
		
	}
	@Test
	public void userTest() {
		User user=new User();
		user.setUserName("kajal");
		user.setPassword("test");
		assertEquals("kajal",user.getUserName());
		assertEquals("test",user.getPassword());	
	}
	@Test
	public void userRegister() {
		User user1=new User();
		user1.setEmail("kajal@gmail.com");
		user1.setFirstName("kajal");
		user1.setLastName("sahu");
		user1.setAddress("Earth");
		user1.setPhoneNumber("996969");
		user1.setCity("bhubaneswar");
		
		assertEquals("kajal@gmail.com",user1.getEmail());
		assertEquals("kajal",user1.getFirstName());
		assertEquals("sahu",user1.getLastName());
		assertEquals("Earth",user1.getAddress());
		assertEquals("996969",user1.getPhoneNumber());
		assertEquals("bhubaneswar",user1.getCity());
	}


}
