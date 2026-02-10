package org.example;

import org.example.entities.Patient;
import org.example.entities.circularqueue.CircularQueue;

public class MainCircularQueue {
    static void main() {
        Patient patient1 = new Patient(123, "Ethan", "Walker");
        Patient patient2 = new Patient(456, "Olivia", "Bennett");
        Patient patient3 = new Patient(22, "Mason", "Carter");
        Patient patient4 = new Patient(2345, "Ava", "Thompson");

        CircularQueue queue = new CircularQueue(4);
        queue.add(patient1);
        queue.add(patient2);
        queue.add(patient3);
        queue.add(patient4);

        System.out.println("1-----------");
        queue.printQueue();

        System.out.println("2-----------");
        queue.remove();
        queue.remove();
        System.out.println("3-----------");
        queue.printQueue();

        queue.add(patient1);
        queue.add(patient2);

//        queue.add(patient1);
//        queue.add(patient2);
//        queue.add(patient3);
//        queue.add(patient4);


        System.out.println("4-----------");
        System.out.println(queue.peek());

//        queue.add(patient4);
    }
}
