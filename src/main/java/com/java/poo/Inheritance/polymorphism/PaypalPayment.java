package com.java.poo.Inheritance.polymorphism;

public class PaypalPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("paid"+amount+"using Paypal ");
    }
}
