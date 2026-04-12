package com.function;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String Name = StudentName();
        System.out.println("Nmae of student is: "+ Name);

        // perameter
        String name2 = s2("yahiya");
        System.out.println("name is: "+name2);
    }
    static String StudentName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        return in.nextLine();
    }

    static String s2(String a){
        return a;
    }


}
