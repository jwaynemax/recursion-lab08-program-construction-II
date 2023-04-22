/**
 * 
 */
package edu.westga.cs6312.Main;

import java.util.ArrayList;

import edu.westga.cs6312.Model.Person;
import edu.westga.cs6312.RecursionService.RecursionService;
import edu.westga.cs6312.Service.DataService;

/**
 * Main method
 * @author justinmaxwell
 * @version 3/23/22
 */
public class Main {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		// read from starter_data.csv & verify expected results
		DataService.readPersonCsv();
		
		System.out.println(DataService.readPersonCsv().get(0));
		
		// call reverseString to reverse all person properties except birthdate
		Person person = DataService.readPersonCsv().get(0);
		String reverseFirstName = RecursionService.reverseString(person.getFirstName());
		String reverseLastName = RecursionService.reverseString(person.getLastName());
		String reverseBirthCity = RecursionService.reverseString(person.getBirthCity());
		String reverseBirthCountry = RecursionService.reverseString(person.getBirthCountry());
		String reverseNativeLanguage = RecursionService.reverseString(person.getNativeLanguage());
		
		System.out.println("Reversed Values: " + "firstName: " + reverseFirstName + ", lastName: " + reverseLastName + ", birthCity: " + reverseBirthCity + ", birthCountry: " + reverseBirthCountry + ", nativeLanguage: " +  reverseNativeLanguage);
		
		//print countBirthYear for people born in 1997
		ArrayList<Person> people = new ArrayList<>();
		
		people = DataService.readPersonCsv();
		
		System.out.println("The number of people born in 1997 is " + RecursionService.countBirthYear(people, "1997"));
	}

}
