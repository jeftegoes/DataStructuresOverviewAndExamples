package org.example;

import java.util.LinkedList;

public class Palindrome {
    private LinkedList<Character> stack;
    private LinkedList<Character> queue;

    public boolean isPalindrome(String string) {
        stack = new LinkedList<>();
        queue = new LinkedList<>();

        StringBuilder sanitizedString = getSanitizedString(string);

        buildDataStructures(sanitizedString);

        return checkForPalindrome();
    }

    private void buildDataStructures(StringBuilder string) {
        for (int i = 0; i < string.length(); i++) {
            this.stack.push(string.charAt(i));
            this.queue.addLast(string.charAt(i));
        }
    }

    private boolean checkForPalindrome() {
        /*
            "carro"
            stack: push(c), push(a), push(r), push(r), push(o)
            queue: add(c), add(a), add(r), add(r), add(o)

            "ovo"
            stack: push(o), push(v), push(o)
            queue: add(o), add(v), add(o)
        */
        while (!this.stack.isEmpty()) {
            if (!this.stack.pop().equals(this.queue.removeFirst())) {
                return false;
            }
        }

        // Alternative: return queue.equals(stack);
        return true;
    }

    private StringBuilder getSanitizedString(String string) {
        StringBuilder sanitizedString = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sanitizedString.append(c);
            }
        }

        return sanitizedString;
    }
}
