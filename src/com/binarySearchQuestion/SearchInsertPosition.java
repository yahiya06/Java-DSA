package com.binarySearchQuestion;

// leetcode problem 35
public class SearchInsertPosition {
    public static void main(String[] args) {

    }
       static public int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length-1;
            while (start <= end){
                int mid = start + (end - start) /2;
                if(nums[mid] < target){
                    start = mid +1;
                }
                else if(nums[mid] > target){
                    end = mid-1;
                }else{
                    return mid;
                }
            }
            return start;
        }
    }
