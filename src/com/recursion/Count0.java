package com.recursion;

public class Count0 {
    static int ans = 0;
    static  void count(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        if(rem== 0){
            ans++;
        }
        count(n/10);
    }
    public static void main(String[] args) {
        int n = 30204;
        count(n);
        System.out.println(ans);

    }
}
