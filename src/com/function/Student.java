package com.function;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String Name = StudentName();
        System.out.println("Nmae of student is: "+ Name);
    }
    static String StudentName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        String name = in.nextLine();
        return name;
    }
}
