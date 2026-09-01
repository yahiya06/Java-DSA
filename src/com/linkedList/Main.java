package com.linkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        DLL Dlist = new DLL();
//
//        list.insertFirst(90);
//        list.insertFirst(89);
//        list.insertFirst(66);
//        list.insertFirst(21);
//
//        list.insertEnd(99);
//
//        list.insert(100,4);

        //list.display();

        //System.out.println(list.removeFirst());
        //list.display();

        //System.out.println(list.removeLast());
       // list.display();

        //System.out.println(list.remove(2));
        //list.display();

//        Dlist.insertf(12);
//        Dlist.insertf(34);
//        Dlist.insertf(90);
//        Dlist.insertf(123);
//
//        Dlist.insertl(99);
//
//        Dlist.insert(100,34);
//
//        Dlist.display();
//
//        CLL cll = new CLL();
//        cll.insert(12);
//        cll.insert(13);
//        cll.insert(15);
//        cll.insert(16);
//        cll.display();
//
//        cll.delete(12);
//        cll.display();
//
//        list.insertRec(78,3);
//        list.display();

//        LL list = new LL();
//
//        list.insertEnd(1);
//        list.insertEnd(1);
//        list.insertEnd(2);
//        list.insertEnd(2);
//        list.insertEnd(2);
//        list.insertEnd(3);
//        list.insertEnd(3);

//        list.display();
//        System.out.println(list.lengthOfList());
//        list.deleteDuplicate();
//        list.display();
//
//        System.out.println(list.lengthOfList());
//
//        System.out.println(list.middleNode());

        LL first = new LL();
        LL second = new LL();

        first.insertEnd(1);
        first.insertEnd(3);
        first.insertEnd(5);

        second.insertEnd(1);
        second.insertEnd(3);
        second.insertEnd(9);
        second.insertEnd(14);

        LL ans = LL.merge(first,second);
        ans.display();

    }
}
