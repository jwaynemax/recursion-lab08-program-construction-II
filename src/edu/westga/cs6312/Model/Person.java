/**
 * 
 */
package edu.westga.cs6312.Model;


/**
 * Define person
 * @author justinmaxwell
 * @version 3/23/22
 */
public class Person {
	private String firstName;
	private String lastName;
	private String birthCity;
	private String birthCountry;
	private String nativeLanguage;
	private String birthday;

	public Person(String firstName, String lastName, String birthCity, String birthCountry, String nativeLanguage, String birthday) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setBirthCity(birthCity);
		this.setBirthCountry(birthCountry);
		this.setNativeLanguage(nativeLanguage);
		this.setBirthday(birthday);
	}
	
	/**
	 * get firstName
	 * @return the firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * set firstName
	 * @precondition cannot be null, empty, or only whitespace
	 * @postcondition none	 
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		
		try {
			if (firstName.equals("") || firstName.equals(" ") || firstName.equals(null)) {
				throw new IllegalArgumentException("First Name cannot be null, empty, or only whitespace.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		this.firstName = firstName;
	}
	
	/**
	 * get lastName
	 * @return the lastName
	 */
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	 * set lastName
	 * @precondition cannot be null, empty, or only whitespace
	 * @postcondition none 
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		
		try {
			if (lastName.equals("") || lastName.equals(" ") || lastName.equals(null)) {
				throw new IllegalArgumentException("Last Name cannot be null, empty, or only whitespace.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		this.lastName = lastName;
	}
	
	/**
	 * get birthCity
	 * @return the birthCity
	 */
	public String getBirthCity() {
		return this.birthCity;
	}
	
	/**
	 * set birthCity
	 * @precondition cannot be null, empty, or only whitespace
	 * @postcondition none
	 * @param birthCity the birthCity to set
	 */
	public void setBirthCity(String birthCity) {
		
		try {
			if (birthCity.equals("") || birthCity.equals(" ") || birthCity.equals(null)) {
				throw new IllegalArgumentException("birthCity cannot be null, empty, or only whitespace.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		this.birthCity = birthCity;
	}
	
	/**
	 * get birthCountry
	 * @return the birthCountry
	 */
	public String getBirthCountry() {
		return this.birthCountry;
	}
	
	/**
	 * set birthCountry
	 * @precondition cannot be null, empty, or only whitespace
	 * @postcondition none
	 * @param birthCountry the birthCountry to set
	 */
	public void setBirthCountry(String birthCountry) {
		
		try {
			if (birthCountry.equals("") || birthCountry.equals(" ") || birthCountry.equals(null)) {
				throw new IllegalArgumentException("birthCountry cannot be null, empty, or only whitespace.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		this.birthCountry = birthCountry;
	}
	
	/**
	 * get nativeLanguage
	 * @return the nativeLanguage
	 */
	public String getNativeLanguage() {
		return this.nativeLanguage;
	}
	
	/**
	 * set nativeLanguage
	 * @precondition cannot be null, empty, or only whitespace
	 * @postcondition none
	 * @param nativeLanguage the nativeLanguage to set
	 */
	public void setNativeLanguage(String nativeLanguage) {
		
		try {
			if (nativeLanguage.equals("") || nativeLanguage.equals(" ") || nativeLanguage.equals(null)) {
				throw new IllegalArgumentException("nativeLanguage cannot be null, empty, or only whitespace.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		this.nativeLanguage = nativeLanguage;
	}
	
	/**
	 * get birthday
	 * @return the birthday
	 */
	public String getBirthday() {
		return this.birthday;
	}
	
	/**
	 * set birthday
	 * @precondition cannot be null, empty, or only whitespace
	 * @postcondition none
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		
		try {
			if (birthday.equals("") || birthday.equals(" ") || birthday.equals(null)) {
				throw new IllegalArgumentException("birthday cannot be null, empty, or only whitespace.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		this.birthday = birthday;
	}
	
	/**
	 * override toString to print details of person
	 */
	@Override
	public String toString() {
		return "Person firstName: " + this.firstName + ", lastName: " + this.lastName + ", birthCity: " + this.birthCity
				+ ", birthCountry: " + this.birthCountry + ", nativeLanguage: " + this.nativeLanguage + ", birthday: " + this.birthday;
	}

}
