package com.basic;

import java.util.Scanner;

public class LagestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

//        int max = a;
//
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
//        System.out.println(max);

        if( a>b && a>c){
            System.out.println(a);
        }
        if(b>a && b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
