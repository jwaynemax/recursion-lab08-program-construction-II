package edu.westga.cs6312.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.Model.Person;
import edu.westga.cs6312.RecursionService.RecursionService;

class TestRecursionService {

	@Test
	void testReverseString() {
		assertEquals("deR", RecursionService.reverseString("Red"), "Testing reverseString");
	}
	
	@Test
	void tesCountBirthYear() {
		Person p1 = new Person("John", "Doe", "Atlanta", "United States", "English", "11/11/1999");
		Person p2 = new Person("Jane", "Test", "city", "Germany", "French", "11/11/1992");
		Person p3 = new Person("Tester", "Testing", "cities", "Canada", "Italian", "12/01/1999");

		ArrayList<Person> person = new ArrayList<>();
		
		person.add(p1);
		person.add(p2);
		person.add(p3);
		
		assertEquals(2, RecursionService.countBirthYear(person, "1999"), "Testing countBirthYear");
	}

}
