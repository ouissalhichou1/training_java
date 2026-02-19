package com.java.LibrarySystem.service;

import com.java.LibrarySystem.model.Item;
import com.java.LibrarySystem.model.Member;

public interface borrowable {
    void borrow(Member member, Item item);
    void returnItem(Member member, Item item,int daysLate);
}
