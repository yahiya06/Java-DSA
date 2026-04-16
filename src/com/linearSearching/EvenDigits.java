package com.linearSearching;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {123,1234,56,789,90,1223};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count =0;
        for (int num : nums){
            if(even(num)){
                count++;
            };
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigit = digit(num);
        if(numberOfDigit % 2==0){
            return true;
        }
        return false;
    }

    static int digit(int n){
        int count =0;
        while(n>0){
            count++;
            n= n/10;
        }
        return count;
    }

}
