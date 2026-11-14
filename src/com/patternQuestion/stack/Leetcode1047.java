package com.patternQuestion.stack;

import java.util.Stack;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/

public class Leetcode1047 {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        String res = "";
        for(int i = 0; i<n ; i++){
            if(st.empty()){
                st.push(s.charAt(i));
                continue;
            }
            if(st.peek()==s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        while(!st.empty()){
            char ch = st.peek();
            res = ch + res;
            st.pop();
        }
        return res;
    }
}
