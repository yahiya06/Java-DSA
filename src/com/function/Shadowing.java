package com.function;

public class Shadowing {
    static int x= 10;
    static String name= "yahiya";

    public static void main(String[] args) {
        System.out.println(x);
        int x = 90;
        System.out.println(x);
        fum();

        System.out.println(name);
        String name= "khan";
        System.out.println(name);
        name();

    }

    private static void name() {
        System.out.println(name);
    }

    static void fum(){
        System.out.println(x);
    }
}
