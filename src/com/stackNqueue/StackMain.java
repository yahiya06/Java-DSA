package com.stackNqueue;

public class StackMain {
    public static void main(String[] args) throws StackException {
//        CustomStack stack = new CustomStack(3);
        DynamicStack stack = new DynamicStack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Removed item is:" + stack.pop());
        System.out.println("Removed item is:" + stack.pop());
        System.out.println("Removed item is:" + stack.pop());
        System.out.println("Removed item is:" + stack.pop());
        System.out.println("Removed item is:" + stack.pop());
        System.out.println("Peek of stack is:" + stack.peek());
    }
}
