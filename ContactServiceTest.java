package ContactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Contact.Contact;
import Task.Task;
import TaskService.TaskService;
import TaskService.addToList;
import TaskService.deleteTask;
import TaskService.updateTask;

class ContactServiceTest {

	@Test
	void testContactServiceAdd() {
		ContactService pass = new addToContactList();
		assertTrue(ContactService.addToContactList().equals());
	}

	@Test
	void testContactServiceDelete() {
		ContactService pass = new deleteContact();
		assertTrue(ContactService.deleteContact().equals());
	}
	
	@Test
	void testContactServiceUpdate() {
		ContactService pass = new updateContact();
		assertTrue(ContactService.updateContact().equals());
	}
}