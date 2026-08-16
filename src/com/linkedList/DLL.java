package com.linkedList;

public class DLL {
    private Node head;

    public void insertf(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head=node;
    }

    public void display(){
        Node node = head;
        while (node!=null){
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int val;
        private Node next;
        private  Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, Node prev, int val) {
            this.next = next;
            this.prev = prev;
            this.val = val;
        }
    }
}
