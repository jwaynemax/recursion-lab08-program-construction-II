/**
 * 
 */
package edu.westga.cs6312.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.westga.cs6312.Model.Person;

/**
 * DataService class to read and write files
 * @author justinmaxwell
 * @version 3/23/22
 */
public class DataService {
	
	/**
	 * Read people from file and create list
	 * @return list of people
	 */
	public static ArrayList<Person> readPersonCsv() {
		ArrayList<Person> people = new ArrayList<>();

		File file = new File("starter_data.csv");

		try (Scanner input = new Scanner(file);) {
			input.useDelimiter(",");
			input.nextLine();
			while (input.hasNext()) {
				String firstName = input.next();
				String lastName = input.next();
				String birthCity = input.next();
				String birthCountry = input.next();
				String nativeLanguage = input.next();
				String birthday = input.nextLine().replace(",", "");
				
				Person newPerson = new Person(firstName, lastName, birthCity, birthCountry, nativeLanguage, birthday);

				people.add(newPerson);
				
			}
			
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		return people;
	}

}
