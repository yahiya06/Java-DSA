package com.bitWiseAndMath;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 2; i<n; i++){
            if(n%i==0){
                System.out.println("not");
                break;
            }
        }
        System.out.println("prime");
    }
}
