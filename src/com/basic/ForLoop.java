package com.basic;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = in.nextInt();
        for(int i=0; i<=a; i++){
            System.out.println("hy");
        }
    }
}
