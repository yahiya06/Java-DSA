package com.string;

public class StringFirst {
    public static void main(String[] args) {
        String name = "yahiya";
        System.out.println(name);

        //string pool
        //both pointing to same object in heap string pool
        String a = "same";
        String b = "same";
        System.out.println(a+" "+b);
        //now a new object is created named not same in heap and a is point to that but b is same
        a= "not same";
        System.out.println(a);
    }
}
