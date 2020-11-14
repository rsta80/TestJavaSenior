package es.brujula.entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import es.brujula.exception.BrujulaException;

public class DepartmentProfessors {

	private String departmentName;
	List<Professor> listProfessor = new ArrayList<>();

	public DepartmentProfessors(String departmentName) throws BrujulaException {

		if (departmentName.isEmpty() || departmentName.length() > 20) {
			throw new BrujulaException("String types cannot be empty or exceed 20 characters");
		}
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public void addProfessor(Professor professor) throws BrujulaException {

		if (professor.getDepartment() != this.departmentName)
			throw new BrujulaException("Cannot add a professor with duplicated name");

		for (Professor p : listProfessor) {
			int i = Comparator.comparing(Professor::getName).thenComparing(Professor::getSurName).compare(p, professor);
			if (i == 0) {
				return;
			}
		}

		listProfessor.add(professor);

	}

	public List<Professor> list() {

		listProfessor.sort(Comparator.comparing(Professor::getSurName));
		return listProfessor;

	}

}
