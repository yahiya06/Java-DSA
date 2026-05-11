package com.bitWiseAndMath;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if((n&1)==1)
            System.out.println("odd");
        else
            System.out.println("even");
    }
}
