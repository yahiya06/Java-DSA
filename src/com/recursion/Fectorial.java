package com.recursion;

public class Fectorial {
    public static void main(String[] args) {

        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }
    static int factorial(int n){
        if(n == 1){
            return n;
        }

        return n * factorial(n-1);
    }
}
