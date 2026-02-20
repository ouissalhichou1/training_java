package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStudent {

    List<Student> students = Arrays.asList(
            new Student("Ali", 14),
            new Student("Sara", 18),
            new Student("Yassine", 10),
            new Student("Amal", 16)
    );

    List<Student> StudentsWithGradePlus15 = students.stream()
            .filter(s->s.getGrade()>=15)
            .collect(Collectors.toList());

    double AverageGrade = students.stream()
            .mapToInt(Student::getGrade)
            .average()
            .orElse(0);
    int max = students.stream()
            .mapToInt(Student::getGrade)
            .max()
            .orElse(0);
    List<String> SortedNamesByGrade = students.stream()
            .sorted(Comparator.comparing(Student::getGrade))
            .map(Student::getName)
            .collect(Collectors.toList());


}
