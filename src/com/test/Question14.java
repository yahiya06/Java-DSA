package com.test;
//Two Sum Problem
public class Question14 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,6,7};
        int target = 11;
        for (int i = 0; i<nums.length-1; i++){
            if (nums[i]+nums[i+1]==target){
                System.out.println(nums[i]+" " +nums[i+1]);
            }
        }
    }
}
