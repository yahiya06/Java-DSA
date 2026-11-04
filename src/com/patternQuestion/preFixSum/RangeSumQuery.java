package com.patternQuestion.preFixSum;

public class RangeSumQuery {

    private int[] prefix;
    public RangeSumQuery(int[] nums) {

        int n = nums.length;
        for(int i = 1; i<n; i++){
            nums[i] += nums[i-1];
        }
        prefix = nums;
    }
    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
}
