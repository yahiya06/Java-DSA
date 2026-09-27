package com.collectionFramework;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        Integer[] nums = list.toArray(new Integer[0]);
//        for (int x: nums){
//            System.out.print(x+",");
//        }
//        System.out.println(list);
//        list.set(1,10);
//        List<Integer> list2 = new ArrayList<>(list);
//        list2.add(123);
//        list2.add(124);
//        System.out.println(list2);
//
//        List<Integer> list3 = new ArrayList<>();
//        list3.addAll(list2);
//        System.out.println(list3);
//
//        System.out.println(list3.indexOf(123));

//        List<Integer> ll = new LinkedList<>();
//        ll.add(12);
//        ll.add(13);
//        ll.add(14);
//        ll.add(15);
//
//        ListIterator<Integer>  iterator = ll.listIterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.previous());

//        Queue<Integer> q = new LinkedList<>();
//
//        q.offer(12);
//        q.offer(13);
//        q.offer(14);
//        System.out.println();
//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q);

        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        set2.add(11);
        set2.add(12);
        set2.add(13);
        set2.add(1);

        set.retainAll(set2);

        System.out.println(set);
        System.out.println(set2);
    }

}
