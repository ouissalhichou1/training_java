package com.java.poo.abstraction;

public abstract class Course {
    protected String title;
    public Course(String title){
        this.title=title;
    }
    public abstract double calculateFinalGrade(double exam,double project);

}
