package org.example.entities.arrayqueue;

import org.example.entities.Patient;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Patient[] queue;
    private int front = 0;
    private int back = 0;

    public ArrayQueue(int capacity) {
        queue = new Patient[capacity];
    }

    public void add(Patient patient) {
        if (back == queue.length) {
            throw new IllegalArgumentException("Queue full!");
        }

        queue[back] = patient;
        back++;
    }


    public Patient remove() {
        if (size() == 0) {
            throw new NoSuchElementException("No patients were found to remove.");
        }

        Patient patient = queue[front];
        queue[front] = null;
        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return patient;
    }

    public Patient peek() {
        if (size() == 0) {
            throw new NoSuchElementException("No patients were found to remove.");
        }

        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}
