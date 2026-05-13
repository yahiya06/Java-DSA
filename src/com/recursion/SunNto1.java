package com.recursion;

import java.util.Scanner;

public class SunNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int ans = sum(n);
        System.out.println(ans);

    }

    static int sum(int n){
        if(n == 1){
            return 1;
        }

        return n + sum(n-1);
    }
}
