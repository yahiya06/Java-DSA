package com.string;

public class Palindrome {
    public static void main(String[] args) {
        String name = "abcdscba";
        System.out.println(isPalindrome(name));
    }

    static boolean isPalindrome(String name){
        for (int i = 0; i < name.length(); i++) {
            int start = name.charAt(i);
            int end = name.charAt(name.length() - 1 - i);
            if (start!= end){
                return false;
            }
        }
        return true;
    }
}
