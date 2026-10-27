package com.patternQuestion;

//https://leetcode.com/problems/max-consecutive-ones-iii/

public class Leetcode1004 {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int low = 0, high = 0, res = Integer.MIN_VALUE;
        int zeros = 0;
        while(high < n){
            if(nums[high] == 0){
                zeros++;
            }
            while( zeros > k ){
                if(nums[low] == 0){
                    zeros--;
                }
                low++;
            }
            int len = high - low +1;
            res = Math.max(res,len);
            high++;
        }
        return res;
    }
}
