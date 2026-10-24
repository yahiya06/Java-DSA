package com.patternQuestion;

//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class MaxSumSubarrayOfSizeK {
    public int maxSubarraySum(int[] arr, int k) {
        int res =0;
        int n = arr.length;
        int sum = 0;

        int low = 0;
        int high = k-1;

        for (int i = low ; i<=high;i++){
            sum = sum + arr[i];
        }

        while(high < n){
            res = Math.max(res, sum);
            low++;
            high++;

            if(high == n){
                break;
            }

            sum = sum - arr[low -1];
            sum = sum + arr[high];
        }
        return res;
    }
}
