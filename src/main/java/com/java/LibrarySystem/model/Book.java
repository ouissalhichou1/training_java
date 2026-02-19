package com.java.LibrarySystem.model;

public class Book extends Item{
    public Book(String title){
        super(title);
    }

    @Override
    public double calculateLateFee(int daysLate){
        return daysLate * 2;
    }
}
