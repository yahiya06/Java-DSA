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
        System.out.println(large(list));
    }

    public static int large(ArrayList<Integer> list){
        int size =list.size();
        int i= 0;
        int max = list.get(i);
        while(i<size){
            if (list.get(i) > max){
                max = list.get(i);
            }
            i++;
        }
        return max;
    }
}
