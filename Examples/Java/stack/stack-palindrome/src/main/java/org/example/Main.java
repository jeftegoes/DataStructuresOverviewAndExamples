package org.example;

public class Main {
    static void main() {
        Palindrome palindrome = new Palindrome();

        System.out.println(palindrome.isPalindrome("abccba"));
        System.out.println(palindrome.isPalindrome("Was is a car or a cat I saw?"));
        System.out.println(palindrome.isPalindrome("I did, did I?"));
        System.out.println(palindrome.isPalindrome("hello"));
        System.out.println(palindrome.isPalindrome("don't nod"));
    }
}