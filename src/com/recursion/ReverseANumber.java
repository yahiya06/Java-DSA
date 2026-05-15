package com.recursion;

import java.util.Scanner;

public class ReverseANumber {
    static int sum =0;
    static void rev(int n){
        if(n == 0){
            return ;
        }
        int rem = n%10;
        sum = sum *10 +rem;
        rev(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        rev(n);
        System.out.println(sum);
    }
}
