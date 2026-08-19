package com.linkedList;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);

        if (head == null){
            head=node;
            tail=node;
            return;
        }
    }

    private class Node{
        int value;
        Node next;

        public Node(Node next, int val) {
            this.next = next;
            this.value = val;
        }
    }
}
