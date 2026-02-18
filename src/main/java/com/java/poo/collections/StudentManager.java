package com.java.poo.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<String> students = new ArrayList<>();

    public void addStudent(String name){
        students.add(name);
    }
    public void printAllStudents(){
        students.forEach(System.out::println);
    }
    public boolean exists(String name){
        return students.contains(name);
    }
}
