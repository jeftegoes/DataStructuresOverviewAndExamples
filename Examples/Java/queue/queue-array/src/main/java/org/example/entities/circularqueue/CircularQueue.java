package org.example.entities.circularqueue;

import org.example.entities.Patient;

import java.util.NoSuchElementException;

public class CircularQueue {
    private Patient[] queue;
    private int front = 0;
    private int back = 0;
    private int size = 0;

    public CircularQueue(int capacity) {
        queue = new Patient[capacity];
    }

    public void add(Patient patient) {
        if (size == queue.length) {
            throw new IllegalArgumentException("Queue full!");
        }

        queue[back] = patient;
        back = (back + 1) % queue.length;
        size++;
    }


    public Patient remove() {
        if (size() == 0) {
            throw new NoSuchElementException("No patients were found to remove.");
        }

        Patient patient = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;

        size--;

        return patient;
    }

    public Patient peek() {
        if (size() == 0) {
            throw new NoSuchElementException("No patients were found to remove.");
        }

        return queue[front];
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        for (int i = 0; i < size(); i++) {
            System.out.println(queue[i]);
        }
    }
}
