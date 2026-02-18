package com.java.poo.Inheritance;

public class Person {
    protected String name;
    protected String email;
    protected int age;

    public Person(String name, String surname, int age){
        this.name=name;
        this.email=surname;
        this.age=age;
    }
    public String getDetails(){
        return "Name: "+name+"\nEmail: "+email+"\nAge: "+age;
    }
}
