package org.example;

import org.example.entities.Book;

public class SimpleHashtable {
    private Book[] hashtable;

    public SimpleHashtable() {
        this.hashtable = new Book[10];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void put(String key, Book book) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null) {
            System.out.println("Sorry, there is already a book at position: " + hashedKey);
        } else {
            hashtable[hashedKey] = book;
        }
    }

    public Book get(String key) {
        int hashdKey = hashKey(key);
        return hashtable[hashdKey];
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }
}
