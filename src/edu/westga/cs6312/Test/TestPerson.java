package edu.westga.cs6312.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs6312.Model.Person;

class TestPerson {
	private Person person;
	
	@BeforeEach
	void setUp() throws Exception {
		this.person = new Person("John", "Doe", "Atlanta", "United States", "English", "11/11/1999");
	}
	
	@AfterEach
	void tearDown() throws Exception {
		this.person = null;
	}

	@Test
	void testValidConstructor() {
		assertEquals("John", this.person.getFirstName(), "Testing valid constructor");
	}
	
	@Test
	void testFirstName() {
		this.person.setFirstName("Jane");
		assertEquals("Jane", this.person.getFirstName(), "Testing getter/setter for firstName");
	}
	
	@Test
	void testLastName() {
		this.person.setLastName("Test");
		assertEquals("Test", this.person.getLastName(), "Testing getter/setter for lastName");
	}
	
	@Test
	void testBirthCity() {
		this.person.setBirthCity("Orlando");
		assertEquals("Orlando", this.person.getBirthCity(), "Testing getter/setter for birthCity");
	}
	
	@Test
	void testBirthCountry() {
		this.person.setBirthCountry("Canada");
		assertEquals("Canada", this.person.getBirthCountry(), "Testing getter/setter for birthCountry");
	}
	
	@Test
	void testNativeLanguage() {
		this.person.setNativeLanguage("French");
		assertEquals("French", this.person.getNativeLanguage(), "Testing getter/setter for nativeLanguage");
	}
	
	@Test
	void testBirthday() {
		this.person.setBirthday("11/11/2022");;
		assertEquals("11/11/2022", this.person.getBirthday(), "Testing getter/setter for birthday");
	}

}
