package com.java8.interview.programs;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentInformation {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "baviya", LocalDate.of(1990, 6, 21)),
                new Student(2, "tarrun", LocalDate.of(2018, 9, 13)),
                new Student(3, "sainiranjana", LocalDate.of(2020, 12, 23)),
                new Student(4, "boopathi", LocalDate.of(1980, 12, 13)),
                new Student(5, "tarrun", LocalDate.of(2018, 9, 13)) // Duplicate by name and date of birth
        );

        // Remove duplicates based on name and date of birth
        List<Student> stud1 = students.stream()
                .collect(Collectors.toMap(
                        student -> Arrays.asList(student.getName(), student.getDob()), 
                        Function.identity(), 
                        (existing, replacement) -> existing)) 
                .values()
                .stream()
                .collect(Collectors.toList());

        // Sort by Name
        List<Student> sortedByName = stud1.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        // Sort by DOB
        List<Student> sortedByDob = stud1.stream()
                .sorted(Comparator.comparing(Student::getDob))
                .collect(Collectors.toList());

        System.out.println("Unique Students:");
        stud1.forEach(System.out::println);

        System.out.println("\nSorted by Student Name:");
        sortedByName.forEach(System.out::println);

        System.out.println("\nSorted by Student Date Of Birth:");
        sortedByDob.forEach(System.out::println);
    }
}
