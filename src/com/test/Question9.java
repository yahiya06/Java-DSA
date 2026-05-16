package com.test;

//Check whether a string is palindrome.
public class Question9 {
    public static void main(String[] args) {
        String s = "abcbba";
        System.out.println(plin(s));
    }
    static boolean plin(String s){
        for (int i = 1; i<s.length();i++){
            int start = s.charAt(i);
            int end = s.charAt(s.length()-1-i);
            if (start!=end)
                return false;
        }
        return true;
    }
}
