package com.java.poo.miniProject.model;

public class Member {
    private String name;
    private int borrowedItems;

    public Member(String name){
        this.name=name;
        this.borrowedItems=0;
    }
    public String getName() {
        return name;
    }
    public int getBorrowedItems() {
        return borrowedItems;
    }
    public void borrowItem(){
        borrowedItems++;
    }


}

