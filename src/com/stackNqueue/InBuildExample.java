package com.stackNqueue;

import java.util.*;

public class InBuildExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(16);
        stack.push(1);

        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        queue.add(16);
        queue.add(17);
        queue.add(18);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.peek());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(9);
        System.out.println(deque.peek());
    }
}
