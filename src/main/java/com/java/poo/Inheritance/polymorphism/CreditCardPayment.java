package com.java.poo.Inheritance.polymorphism;

public class CreditCardPayment extends Payment{
    @Override
    public void pay(double amount,String currency) {
        System.out.println("Paid"+amount+currency +"using CreditCard");
    }
}
