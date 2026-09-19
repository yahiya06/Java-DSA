package com.stackNqueue;

public class QueueMain {
    public static void main(String[] args) throws Exception{
//        CustomQueue queue = new CustomQueue();
        CircularQueue queue = new CircularQueue(5);
        queue.insert(11);
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);
        queue.insert(15);
        queue.display();
        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
        queue.display();
        System.out.println(queue.front());

    }
}
