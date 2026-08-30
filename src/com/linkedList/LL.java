package com.linkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size= 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail=head;
        }
        size +=1;
    }

    public void insertEnd(int val){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val, int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
            insertEnd(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index ; i++) {
            temp=temp.next;
        }

        Node node = new Node(temp.next,val);
        temp.next=node;
        size++;
    }
    //insert using recurrsion
    public void insertRec(int val ,int index){
        head=insertRec(val,index,head);
    }

    private Node insertRec(int val, int index, Node node){
        if (index==0){
            Node temp = new Node(node,val);
            size++;
            return temp;
        }
        node.next = insertRec(val , index-1 , node.next);
        return node;
    }

    //remove first node from list
    public int removeFirst(){
        int val = head.value;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;

        return val;
    }

    public int removeLast(){
        if (size<=1){
           return removeFirst();
        }
        int val = tail.value;
        Node secondLast = get(size-2);
        tail=secondLast;
        tail.next=null;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public int remove(int index){
        if (index==0){
            return removeFirst();
        }
        if(index==size-1){
            return removeLast();
        }
        Node prev = get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value +"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node{

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, int value) {
            this.next= next;
            this.value = value;
        }

    }

    public void deleteDuplicate(){
        Node node= head;

        while(node.next !=null){
            if (node.value == node.next.value){
                node.next= node.next.next;
                size--;
            }else {
                node =node.next;
            }
        }
        tail=node;
        tail.next=null;
    }

}