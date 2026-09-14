package com.questions;

public class MissingNumberRev {
    public static void main(String[] args) {
        int[] nums ={0,1};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }
    public static int missingNumber(int[] nums){
        int n = nums.length;
        int sum = n*(n+1)/2;

        for (int i = 0; i < nums.length; i++) {
            sum = sum-nums[i];
        }
        return sum;
    }
}
