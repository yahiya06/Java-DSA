package com.pattern;

//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n){
        int row = n;
        if(row>=n){
            for (int i = 1; i <=row ; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        if(row<=n) {
            for (int ii = n-1; ii >= 1; ii--) {
                for (int jj = ii; jj >=1; jj--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }
}
