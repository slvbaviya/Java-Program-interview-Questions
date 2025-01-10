package com.java8.interview.programs;

import java.time.LocalDate;
import java.util.Objects;

class Student {
	private int id;
	private String name;
	private LocalDate dob;

	public Student(int id, String name, LocalDate dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDob() {
		return dob;
	}

	@Override
	public boolean equals(Object x) {
		if (this == x)
			return true;
		if (x == null || getClass() != x.getClass())
			return false;
		Student student = (Student) x;
		return id == student.id && Objects.equals(name, student.name) && Objects.equals(dob, student.dob);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, dob);
	}

	@Override
	public String toString() {
		return "Student{id=" + id + ", name='" + name + "', dob=" + dob + "}";
	}
}
