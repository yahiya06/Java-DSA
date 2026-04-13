package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] name= new String[4];
        for (int i = 0; i < name.length; i++) {
            name[i]= in.next();
        }
        System.out.println(Arrays.toString(name));
    }
}
