package com.pattern;

import java.util.Scanner;

//*
//**
//***
//****
public class Pattern1 {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number ");
        int num = sc.nextInt();
        for (int i = 1; i <= num;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

