package com.string;

import java.util.SplittableRandom;

public class Comparison {
    public static void main(String[] args) {
        String a ="yahiya";
        String b ="yahiya";
        //give true because pointing to same object
        System.out.println(a==b);

        //give false because pointing to differ. object
        String name = new String("name");
        String name1 =new String("name");
        System.out.println(name1 == name);

        //give true because value is same
        String name01 = new String("yahiya");
        String name02 = new String("yahiya");
        System.out.println(name01.equals(name02));

    }
}
