package com.java.LibrarySystem.model;

import com.java.poo.course.Employee;

public class Magazine extends Item {
    public Magazine(String title) {
        super(title);
    }
    public double calculateLateFee(int daysLate)
    {
        return daysLate;
    }

}

