package com.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListQ {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.remove(2);
        list.add(2,25);
        System.out.println(list);
        System.out.println(list.size());
    }
}
