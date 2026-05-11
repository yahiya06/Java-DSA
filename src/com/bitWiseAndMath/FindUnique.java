package com.bitWiseAndMath;


public class FindUnique {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,3,2,1,4};
        System.out.println(ans(nums));
    }
    static int ans(int[] nums){
        int unique = 0;
        for (int n :nums) {
            unique ^= n;
        }

        return unique;
    }
}
