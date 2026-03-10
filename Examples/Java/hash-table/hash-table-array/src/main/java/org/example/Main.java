package org.example;

import org.example.entities.Book;

public class Main {
    static void main(String[] args) {
        Book book1 = new Book(1, "Clean Code", "Robert C. Martin");
        Book book2 = new Book(2, "Effective Java", "Joshua Bloch");
        Book book3 = new Book(3, "Design Patterns", "Erich Gamma");
        Book book4 = new Book(4, "Refactoring", "Martin Fowler");
        Book book5 = new Book(5, "Head First Java", "Kathy Sierra");

        SimpleHashtable simpleHashtable = new SimpleHashtable();
        simpleHashtable.put("Clean Code", book1);
        simpleHashtable.put("Effective Java", book2);
        simpleHashtable.put("Design Patterns", book3);
        simpleHashtable.put("Refactoring", book4);
        simpleHashtable.put("Head First Java 2", book5);

        simpleHashtable.printHashtable();

        System.out.println("Retrive key Clean Code: " + simpleHashtable.get("Clean Code"));
    }
}
