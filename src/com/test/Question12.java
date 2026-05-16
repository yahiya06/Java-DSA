package com.test;
//Q12. Print numbers from n to 1 using recursion.
public class Question12 {
    public static void main(String[] args) {
        int n =5;
        int ans = numbers(n);
        System.out.println(ans);
    }
    static int numbers(int n){
        if(n == 1){
            return n;
        }
        System.out.println(n);
        return numbers(n-1);
    }
}
