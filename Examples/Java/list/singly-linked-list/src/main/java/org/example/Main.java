package org.example;

import org.example.entities.Employee;
import org.example.entities.EmployeeLinkedList;

public class Main {
    static void main() {
        Employee employee1 = new Employee(123, "Ethan", "Walker");
        Employee employee2 = new Employee(456, "Olivia", "Bennett");
        Employee employee3 = new Employee(22, "Mason", "Carter");
        Employee employee4 = new Employee(2345, "Ava", "Thompson");

        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);
        list.addToFront(employee4);

        list.printList();

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        System.out.println(list.removeFromFront());

        System.out.println(list.getSize());

        list.printList();
    }
}
