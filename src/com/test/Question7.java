package com.test;
//binarysearch
public class Question7 {
    public static void main(String[] args) {
        int[] nums = {1,2,34,56,78,90,100,101};
        int target = 3;
        int start= 0;
        int end = nums.length-1;
        int ans = bs(nums, target, start, end);
        System.out.println(ans);
    }
    static int bs(int[] nums, int target, int start, int end){
        if(start>end){
             return -1;
        }
        int mid = start+(end-start)/2;
        if (nums[mid]==target){
            return mid;
        }
        if(mid>target){
            return bs(nums, target, mid+1, end);
        }
        return bs(nums, target, start, mid-1);
    }
}
