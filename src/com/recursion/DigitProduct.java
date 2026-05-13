package com.recursion;

import java.util.Scanner;

public class DigitProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int ans = product(n);
        System.out.println(ans);
    }
    static int product(int n){
        if(n%10 == n){
            return n;
        }

        return (n % 10) * product(n/10) ;
    }
}
