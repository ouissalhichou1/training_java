package com.java.LibrarySystem.model;

public abstract class Item {
    private String title;
    private boolean borrowed;

    public Item(String title) {
        this.title = title;
        this.borrowed = false;
    }
    public String getTitle() {
        return title;
    }
    public boolean isBorrowed(){
        return borrowed;
    }
    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
    public abstract double calculateLateFee(int dayslate);

}
