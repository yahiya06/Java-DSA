package com.patternQuestion.kadane;

public class MaxAbsoluteSumSubarray {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnd = 0, maxSum = Integer.MIN_VALUE;
        int minEnd = 0, minSum = Integer.MAX_VALUE;

        for(int x : nums ){
            maxEnd = Math.max(x, maxEnd+x);
            maxSum = Math.max(maxSum, maxEnd);

            minEnd = Math.min(x, minEnd + x);
            minSum = Math.min(minEnd, minSum);
        }
        return Math.max(Math.abs(minSum), Math.abs(maxSum));
    }
}
