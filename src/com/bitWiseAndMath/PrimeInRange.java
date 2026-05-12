package com.bitWiseAndMath;

public class PrimeInRange {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 2; i<40; i++){
            if (isprime(i))
                System.out.println(i );
        }
    }

    static boolean isprime(int n){
        if(n < 2){
            return false;
        }

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
    }

