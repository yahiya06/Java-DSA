package com.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1,0};
        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void insertion(int[] nums) {
        for (int i = 0; i <= nums.length-2; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }else break;
            }
        }
    }

}
