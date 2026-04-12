package com.function;

public class Overloading {
    public static void main(String[] args) {
        fun(5,6);
        fun("yahiya", "khan");
    }
    static void fun(int a, int b){
        System.out.println(a+b);
    }

    static void fun(String a, String b){
        System.out.println(a+" "+b);
    }
}
