package com.java.LibrarySystem.service;

public class EmailNotification implements NotifiableInterface {
    @Override
    public void send(String message) {
        System.out.println("Sending emaail"+message);
    }
}
