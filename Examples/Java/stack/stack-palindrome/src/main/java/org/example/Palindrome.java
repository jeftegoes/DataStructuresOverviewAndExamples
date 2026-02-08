package org.example;

import java.util.LinkedList;

public class Palindrome {
    public boolean isPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<>();

        StringBuilder stringNoPunctuation = getSanitizedString(string, stack);

        StringBuilder reversedString = getReversedString(stack);

        boolean isPalindrome = reversedString.toString().equals(stringNoPunctuation.toString());

        return isPalindrome;
    }

    private StringBuilder getReversedString(LinkedList<Character> stack) {
        StringBuilder reversedString = new StringBuilder(stack.size());

        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString;
    }

    private StringBuilder getSanitizedString(String string, LinkedList<Character> stack) {
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        return stringNoPunctuation;
    }
}
