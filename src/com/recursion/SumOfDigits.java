package com.recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int ans = sum(n);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
13
        return (n % 10) + sum(n/10) ;
    }
}
