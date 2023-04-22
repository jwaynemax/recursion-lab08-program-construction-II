/**
 * 
 */
package edu.westga.cs6312.RecursionService;

import java.util.ArrayList;

import edu.westga.cs6312.Model.Person;

/**
 * RecursionService to solve problems using recursion
 * @author justinmaxwell
 * @version 3/23/22
 */
public class RecursionService {
	
	/**
	 * Recursive method to reverse the string provided
	 * @param personDetails
	 * @return reverse of provided string
	 */
	public static String reverseString(String personDetails) {
		if (personDetails.length() <= 1) {
			return personDetails;
		} else {
			return reverseString(personDetails.substring(1)) + personDetails.charAt(0);
		}
	}
	
	/**
	 * Recursive method to find all 'persons' with matching year param
	 * @param person
	 * @param year
	 * @return size of list of person collection that contains only 'persons' with birth year matching year param
	 */
	public static int countBirthYear(ArrayList<Person> person, String year) {
		
		for (int i = 0; i < person.size(); i++) {
			String substringYear = person.get(i).getBirthday().substring(person.get(i).getBirthday().length() - 4);
			if (!(substringYear.equals(year))) {
				person.remove(i);
				countBirthYear(person, year);
			}
		}
		
		return person.size();
		
	}
	
}