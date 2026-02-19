package com.java.LibrarySystem.model;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private List<Item> borrowedItems = new ArrayList<>();

    public Member(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public List<Item> getBorrowedItems(){
        return borrowedItems;
    }
    public void borrowItem(Item item){
        borrowedItems.add(item);
    }

}
