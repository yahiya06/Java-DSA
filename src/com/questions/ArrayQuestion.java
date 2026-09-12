package com.questions;

import java.util.Arrays;

public class ArrayQuestion {
    public static void main(String[] args) {
        int[] nums = {12, 5, 8, 21, 3};
        int[] nums2 = {10, 5, 20, 8, 20};
        int[] nums3 = {1, 2, 2, 4, 7};
        int[] nums4= {0, 1, 0, 3, 12};
        int ans = largestElement(nums);
        System.out.println(ans);
        int ans2 = secondLargestElement(nums2);
        System.out.println(ans2);
        System.out.println(checkSorted(nums3));
        System.out.println(Arrays.toString(revArray(nums)));
        System.out.println(Arrays.toString(moveZeros(nums4)));
    }

    //Q1 — Largest Element
    public static int largestElement(int[] nums) {
        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (a < nums[i]) {
                a = nums[i];
            }
        }
        return a;
    }

    //Q2 — Second Largest
    public static int secondLargestElement(int[] nums) {
        int largest = nums[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

    //Q3 — Check Sorted
    //Determine whether an array is sorted in non-decreasing order.
    public static boolean checkSorted(int[] nums) {
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    //Q4 — Reverse Array
    public static int[] revArray(int[] nums){
        int start =0;
        int end= nums.length-1;
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;
        }
        return nums;
    }

    //Q5 — Move Zeroes
    public static int[] moveZeros(int[] nums){
        int first = 0;
        for(int i = 0; i <= nums.length-1; i++){
            if(nums[i] != 0){
                int temp;
                temp = nums[i];
                nums[i]=nums[first];
                nums[first]=temp;
                first++;
            }
        }
        return nums;
    }

}
