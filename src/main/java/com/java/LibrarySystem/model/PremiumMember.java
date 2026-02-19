package com.java.LibrarySystem.model;

public class PremiumMember extends Member{
    public PremiumMember(String name){
        super(name);
    }

    public double applyDiscount(double fee){
        return fee * 0.5;
    }
}
