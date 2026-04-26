package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {2,3,5,4,1};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void bubbleSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j]= nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
    }
}

