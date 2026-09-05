package com.questions;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'y','a','h','i','y','a'};

    }
    public static void reverseString(char[] s) {
        int end = s.length-1;
        for(int i=0; i<s.length-1; i++){
            char temp;
            temp = s[i];
            s[i]=s[end];
            s[end]=temp;
            end--;
        }
    }
}
