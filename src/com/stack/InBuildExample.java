package com.stack;

import java.util.Stack;

public class InBuildExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(16);
        stack.push(1);

        System.out.println(stack.pop());
    }
}
