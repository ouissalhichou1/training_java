package com.java.poo.Inheritance;

public class Teacher extends Person {
    protected String subject;

    public Teacher(String name, String email, int age, String subject){
        super(name,email,age);
        this.subject=subject;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+"\nteaches: "+ subject;
    }



}
