package com.pattern;

//* * * * * *
//* * * * *
//* * * *
//* * *
//* *
//*

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(6);
    }
    static void pattern3(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >=1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

