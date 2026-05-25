package com.patternWithRecursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        selSort(nums,nums.length,0,0);
        System.out.println(Arrays.toString(nums));
    }
    static void selSort(int[] nums, int r, int c, int max){
        if(r ==0){
            return;
        }

        if (c<r){
           if(nums[c] > nums[max]){
               selSort(nums,r,c+1,c);
           }else{
               selSort(nums,r,c+1,max);
           }
        }else{
            int temp = nums[max];
            nums[max]=nums[r-1];
            nums[r-1]=temp;
            selSort(nums,r-1,0,0);
        }
    }
}
