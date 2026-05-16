package com.test;
//Find factorial using recursion.
public class Question11 {
    public static void main(String[] args) {
        int n =5;
        int ans = fact(n);
        System.out.println(ans);
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n *fact(n-1);
    }
}
