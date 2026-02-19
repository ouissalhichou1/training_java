package com.java.LibrarySystem;

import com.java.LibrarySystem.model.*;
import com.java.LibrarySystem.service.EmailNotification;
import com.java.LibrarySystem.service.LibraryService;
import com.java.LibrarySystem.service.NotifiableInterface;


public class Main {

    public static void main(String[] args) {

        NotifiableInterface emailService = new EmailNotification();
        LibraryService library = new LibraryService(emailService);

        Item book = new Book("Clean Code");
        Item magazine = new Magazine("Tech hours");

        library.addItem(book);
        library.addItem(magazine);

        Member normal = new Member("Ouissal");
        Member premium = new PremiumMember("fatima");

        library.borrow(normal, book);
        library.returnItem(normal, book, 3);

        library.borrow(premium, magazine);
        library.returnItem(premium, magazine, 3);
    }
}

