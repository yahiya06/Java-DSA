package com.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,3,4,8,9,10,23,45,60};
        int target = 10;
        int start = 0;
        int end = nums.length-1;
        int ans = bs(nums, target, start, end);
        System.out.println(ans);
    }


//    static int bs(int[] nums, int target , int start, int end){
//        if(start> end){
//            return -1;
//        }
//        int mid = start + (end - start)/2;
//
//        if(target == nums[mid]){
//            return mid;
//        }
//        if(nums[mid] > target){
//            end = mid -1;
//            return bs(nums, target, start, end );
//        }
//        else {
//            start = mid + 1;
//            return bs(nums, target, start , end);
//        }
//    }

    static int bs(int[] nums, int target , int start, int end){
        if (start > end) {
            return -1;
        }
        int mid = start +(end-start)/2;

        if(target == nums[mid]){
            return mid;
        }
        if(target<nums[mid]){
            return bs(nums, target, start,mid-1 );
        }
        return bs(nums, target, mid+1, end);
    }
}
