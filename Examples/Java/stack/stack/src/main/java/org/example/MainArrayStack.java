package org.example;

import org.example.arraystack.ArrayStack;
import org.example.entities.Employee;

public class MainArrayStack {
    static void main() {
        ArrayStack stack = new ArrayStack(4);

        Employee employee1 = new Employee(123, "Ethan", "Walker");
        Employee employee2 = new Employee(456, "Olivia", "Bennett");
        Employee employee3 = new Employee(22, "Mason", "Carter");
        Employee employee4 = new Employee(2345, "Ava", "Thompson");

        stack.push(employee1);
        stack.push(employee2);
        stack.push(employee3);
        stack.push(employee4);

        stack.printStack();
        System.out.println(stack.isEmpty());
        System.out.println("Peek: " + stack.peek());
        System.out.println(stack.size());


        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.printStack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}
