package com.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,0,1};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void selection(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int max = maxElement(nums, 0, last);
            swap(nums, max,last);
        }
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] =nums[second];
        nums[second] = temp;
    }
    static int maxElement(int[] nums, int start, int last){
        int max = start;
        for (int i = start; i <= last; i++) {
            if (nums[max] < nums[i]){
                max = i;
            }
        }
        return max;
    }
}
