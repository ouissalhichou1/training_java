package com.java.poo.course;

public class Developer extends Employee {
    protected String ProjectName;

    public Developer(String name, String emailAddress, String department, String address, int yearOfBirth) {
        super(name, emailAddress, department, address, yearOfBirth);
        this.ProjectName=name;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }


}
