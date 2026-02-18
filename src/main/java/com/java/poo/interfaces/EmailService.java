package com.java.poo.interfaces;

public class EmailService implements Notifiable{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email :"+message);
    }
}
