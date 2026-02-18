package com.java.poo.abstraction;

public class ProgrammingCourse extends Course {

    public ProgrammingCourse(String title){
        super(title);
    }
    @Override
    public double calculateFinalGrade(double exam,double project) {
        return exam*0.6+project*0.4;
    }
}
