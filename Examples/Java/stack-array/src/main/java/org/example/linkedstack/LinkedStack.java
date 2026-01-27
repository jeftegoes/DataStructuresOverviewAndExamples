package org.example.linkedstack;

import org.example.entities.Employee;

import java.util.EmptyStackException;

public class LinkedStack {
    private Node top;
    private int size;

    public void push(Employee employee) {
        Node node = new Node(employee);
        node.setNext(top);
        top = node;
        size++;
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Employee employee = top.getEmployee();
        top = top.getNext();
        size--;
        return employee;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.getEmployee();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node current = top;

        while (current != null) {
            System.out.println(current.getEmployee());
            current = current.getNext();
        }
    }
}
