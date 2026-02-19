package com.java.LibrarySystem.service;

import com.java.LibrarySystem.model.Item;
import com.java.LibrarySystem.model.Member;
import com.java.LibrarySystem.model.PremiumMember;

import java.util.HashMap;
import java.util.Map;

public class LibraryService implements borrowable {
    private Map<String,Item> inventory = new HashMap<>();
    private NotifiableInterface notifier;

    public LibraryService(NotifiableInterface notifier) {
        this.notifier = notifier;
    }
    public void addItem(Item item){
        inventory.put(item.getTitle(),item);
    }

    @Override
    public void borrow(Member member, Item item) {
        if(!item.isBorrowed()){
            item.setBorrowed(true);
            member.borrowItem(item);
            notifier.send(member.getName()+"borrowed"+item.getTitle());
        }
    }
    @Override
    public void returnItem(Member member,Item item,int daysLate){
        item.setBorrowed(false);
        double fee = item.calculateLateFee(daysLate);
         if (member instanceof PremiumMember) {
             fee =((PremiumMember)member).applyDiscount(fee);
         }
         System.out.println("late fee:" + fee);
    }
}
