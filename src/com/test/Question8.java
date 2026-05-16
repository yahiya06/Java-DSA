package com.test;
//Find ceiling of a number in sorted array.
public class Question8 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = bs(nums, target);
        System.out.println(ans);
    }

    static int bs(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
//
//        if (start > end) {
//            return -1;
//        }

        while (start < end) {
            int mid = start + (end - start) / 2;
//            if (nums[mid] == target) {
//                return mid;
//            }
            if (nums[mid] < target) {
               start = mid + 1;
            }
            if(nums[mid]>target) {
                end = mid - 1;
            }
        }
        return nums[start+1];
    }
}
