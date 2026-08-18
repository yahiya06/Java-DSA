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

    public void insertl(int val){
        Node node = new Node(val);
        Node last = head;

        node.next=null;

        if (head==null){
            node.prev=null;
            head=node;
            return;
        }

        while (last.next!=null){
            last=last.next;
        }

        last.next=node;
        node.prev=last;
    }
    public void display(){
        Node node = head;
        Node last = null;
        while (node!=null){
            last=node;
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.println("END");

        while (last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
        }
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
