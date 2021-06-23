package com.libraryapp;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.libraryapp.entities.*;

@SpringBootTest
public class NotificationTest {
	
	@Test
	public void notifTest() {
		Notification notif = new Notification();
		notif.setNotificationId(123456);
		notif.setNotificationMessage("Hi, you have a new notification");
		assertEquals(123456, notif.getNotificationId());
		assertEquals("Hi, you have a new notification",notif.getNotificationMessage());
		
	}
}
