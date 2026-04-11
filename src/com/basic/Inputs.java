package com.basic;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        //int input
        System.out.println("enter the rollno.");
        Scanner s = new Scanner(System.in);
        int rollno = s.nextInt();
        System.out.println("Roll no. is "+rollno);

        //string input
        System.out.println("enter the name");
        String name = s.next();
        System.out.println("name is:"+ name);

        //flot
        System.out.println("enter the cgpa");
        String cgpa = s.next();
        System.out.println("cgpa is:"+ cgpa);

        //double
        System.out.println("enter the persentage");
        String per = s.next();
        System.out.println("persentage is:"+ per);


    }
}
