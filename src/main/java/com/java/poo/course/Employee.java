package com.java.poo.course;

public class Employee {
    protected String name;
    protected String emailAddress;
    protected String department;
    protected String Address;
    protected int yearOfBirth;

    public Employee(String name, String emailAddress, String department, String address, int yearOfBirth) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.department = department;
        Address = address;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
