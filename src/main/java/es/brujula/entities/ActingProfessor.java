package es.brujula.entities;

import java.time.LocalDate;

import es.brujula.exception.BrujulaException;

public class ActingProfessor extends Professor {

	private LocalDate endDate;

	public ActingProfessor(String name, String surName, int yearOfBirth, String department, LocalDate endDate)
			throws BrujulaException {

		super(name, surName, yearOfBirth, department);

		LocalDate actualLocalDate = LocalDate.now();		
		if (endDate.compareTo(actualLocalDate) < 0) {
			throw new BrujulaException("End date of an Acting Professor cannot be lower than current date");
		}

		this.endDate = endDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}
