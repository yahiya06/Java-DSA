package com.patternQuestion.kadane;

public class MaxSubarraySumWithOneDeletion {
    public int maximumSum(int[] arr) {
        int ans = arr[0], noDelete = arr[0], oneDelete = Integer.MIN_VALUE;
        for(int i = 1; i< arr.length; i++){
            int prevNoDelete = noDelete;
            int prevOneDelete = oneDelete;
            noDelete = Math.max(noDelete + arr[i] , arr[i]);

            int v1 = 0;

            if(prevOneDelete == Integer.MIN_VALUE){
                v1 = arr[i];
            }else{
                v1 = prevOneDelete + arr[i];
            }
            oneDelete = Math.max(v1, prevNoDelete);
            ans = Math.max(ans, Math.max(oneDelete, noDelete));
        }
        return ans;
    }
}
