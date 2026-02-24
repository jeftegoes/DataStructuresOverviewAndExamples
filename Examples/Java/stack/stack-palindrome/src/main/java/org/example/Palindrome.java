package org.example;

import java.util.LinkedList;
import java.util.Stack;

public class Palindrome {
    private LinkedList<Character> stack;

    public boolean isPalindrome(String string) {
        stack = new LinkedList<>();

        StringBuilder sanitizedString = getSanitizedString(string);

        buildStack(sanitizedString);

        StringBuilder reversedString = getReversedString();

        return reversedString.toString().equals(sanitizedString.toString());
    }

    private StringBuilder getReversedString() {
        StringBuilder reversedString = new StringBuilder(this.stack.size());

        while (!this.stack.isEmpty()) {
            reversedString.append(this.stack.pop());
        }

        return reversedString;
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

    private void buildStack(StringBuilder string) {
        for (int i = 0; i < string.length(); i++) {
            this.stack.push(string.charAt(i));
        }
    }
}
