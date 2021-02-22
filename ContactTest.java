package Contact;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

	@Test
	void testContactID() {
		Contact pass = new Contact("1", "Greg", "Taylor", "1234567890", "555 Winding Way");
		assertTrue(Contact.getContactID().equals("1"));
		assertTrue(Contact.getContactFirstName().equals("Greg"));
		assertTrue(Contact.getContactLastName().equals("Taylor"));
		assertTrue(Contact.getContactPhone().equals("1234567890"));
		assertTrue(Contact.getContactAddress().equals("555 Winding Way"));
	
	}

	@Test
	void testContactIDFail() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("", "Greg", "Taylor", "1234567890", "555 Winding Way");
		});
	}
	
	@Test
	void testContactPhoneFail() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("57", "Greg", "Taylor", "123Bc7890", "555 Winding Way");
		});
	}

}
