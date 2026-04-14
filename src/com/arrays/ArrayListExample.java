package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(11);
//        list.add(114);
//        list.add(123);
//        list.add(15);
//        list.add(6);
//        list.add(70);
//        list.add(90);

//        System.out.println(list);
//        System.out.println(list.get(0));


        //insert using loop
        for (int i = 0; i < 6; i++) {
           list.add(in.nextInt());
        }
        //output using loop
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
