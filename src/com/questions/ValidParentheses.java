package com.questions;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));

    }
//    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//
//        for(int i=0; i<s.length()-1; i++){
//            char ch = s.charAt(i);
//            if (ch == '(' || ch == '[' || ch == '{') {
//                stack.push(ch);
//            }
//            if (ch == ')' && stack.peek() == ch){
//                stack.pop();
//            }
//            if (ch == '}' && stack.peek() == ch){
//                stack.pop();
//            }
//            if (ch == ']' && stack.peek() == ch){
//                stack.pop();
//            }
//            return stack.isEmpty();
//        }

//        for(int i=0; i<s.length()-1; i++){
//            char ch = s.charAt(i);
//            if (ch == ')' || ch == ']' || ch == '}') {
//                stack.pop();
//            }
//            if (stack.isEmpty()){
//                return true;
//            }
//        }


//        int i = s.length();
//            while (stack.isEmpty()){
//                if (stack.peek() )
//                    if(s.charAt(i) != t){
//                        return false;
//                    }
//                i--;
//        }
//        return false;
public static boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {

        char ch = s.charAt(i);

        if (ch == '(' || ch == '[' || ch == '{') {
            stack.push(ch);
        }
        else {
            if (stack.isEmpty()) {
                return false;
            }

            if (ch == ')' && stack.peek() != '(') {
                return false;
            }

            if (ch == ']' && stack.peek() != '[') {
                return false;
            }

            if (ch == '}' && stack.peek() != '{') {
                return false;
            }

            stack.pop();
        }
    }

    return stack.isEmpty();
}
    }

