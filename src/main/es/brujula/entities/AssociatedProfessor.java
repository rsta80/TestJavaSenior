package es.brujula.entities;

import java.time.LocalDate;

import es.brujula.exception.BrujulaException;

public class AssociatedProfessor extends Professor{
	
	private LocalDate startDate;	

	public AssociatedProfessor(String name, String surName, int yearOfBirth, String department, LocalDate startDate) throws BrujulaException {
		super(name, surName, yearOfBirth, department);
		this.startDate = startDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	

}
