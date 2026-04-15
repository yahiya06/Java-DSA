package com.basic;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
        System.out.println("ente the number to find ");
        int no = in.nextInt();

        int count =0;
        while(n>0){
            int rem = n % 10;
            if(rem==no){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
