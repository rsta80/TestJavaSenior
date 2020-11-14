package es.brujula.entities;

import es.brujula.exception.BrujulaException;

public class Professor extends Person {
	
	private String department;

	

	public Professor(String name, String surName, int yearOfBirth, String department) throws BrujulaException {
		super(name, surName, yearOfBirth);
		
		if(department.isEmpty() || department.length() > 20) {
			throw new BrujulaException("String types cannot be empty or exceed 20 characters");
		}
		
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

}
