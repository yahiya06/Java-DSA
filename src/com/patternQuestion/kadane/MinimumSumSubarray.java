package com.patternQuestion.kadane;

//https://www.geeksforgeeks.org/problems/smallest-sum-contiguous-subarray/1

public class MinimumSumSubarray {
    public int minSubarraySum(int[] arr) {
        int bestEnding = arr[0];
        int ans = arr[0];
        for(int i = 1; i<arr.length; i++){
            int v1 = bestEnding + arr[i];
            int v2 = arr[i];
            bestEnding = Math.min(v1,v2);
            ans = Math.min(bestEnding, ans );
        }
        return ans;
    }
}
