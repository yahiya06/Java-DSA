package com.basic;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a =0;
        int b=1;
        //with while loop
//        int count =2;
//        while(count<=n){
//            int temp=b;
//            b= a+b;
//            a=temp;
//            count++;
//        }
//        System.out.println(b);

//with for loop
        for(int count = 2; count <= n; count++){
            int temp =b;
            b= a+b;
            a=temp;
        }
        System.out.println(b);

    }
}
