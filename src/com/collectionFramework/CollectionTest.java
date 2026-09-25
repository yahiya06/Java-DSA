package com.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        System.out.println(list);
        list.set(1,10);
        List<Integer> list2 = new ArrayList<>(list);
        list2.add(123);
        list2.add(124);
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list2);
        System.out.println(list3);

        System.out.println(list3.indexOf(123));

    }

}
