package es.brujula.entities;

import java.time.LocalDate;

import es.brujula.exception.BrujulaException;

public class Person {

	private String name;
	private String surName;
	private int yearOfBirth;

	public Person(String name, String surName, int yearOfBirth) throws BrujulaException {
		
		if(name.isEmpty() || name.length() > 20 || surName.isEmpty() || surName.length() > 20 ) {
			throw new BrujulaException("String types cannot be empty or exceed 20 characters");
		}
		
		this.name = name;
		this.surName = surName;
		this.yearOfBirth = yearOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getCompleteName() {

		return surName + ", " + name;

	}

	public int getAge() {

		int currentYear = LocalDate.now().getYear(); 	 
		return currentYear - yearOfBirth;

	}

}
