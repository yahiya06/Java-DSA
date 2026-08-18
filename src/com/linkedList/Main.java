package com.linkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        DLL Dlist = new DLL();

        list.insertFirst(90);
        list.insertFirst(89);
        list.insertFirst(66);
        list.insertFirst(21);

        list.insertEnd(99);

        list.insert(100,4);

        //list.display();

        //System.out.println(list.removeFirst());
        //list.display();

        //System.out.println(list.removeLast());
       // list.display();

        //System.out.println(list.remove(2));
        //list.display();

        Dlist.insertf(12);
        Dlist.insertf(34);
        Dlist.insertf(90);
        Dlist.insertf(123);

        Dlist.insertl(99);

        Dlist.display();
    }
}
