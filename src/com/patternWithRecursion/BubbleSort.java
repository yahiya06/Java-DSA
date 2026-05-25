package com.patternWithRecursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        bubbleSort(nums,nums.length-1,0);
        System.out.println(Arrays.toString(nums));
    }
    static void bubbleSort(int[] nums,int r,int c){
        if(r ==0){
            return;
        }
        if(c<r){
            if(nums[c]>nums[c+1]){
                int temp = nums[c];
                nums[c] = nums[c+1];
                nums[c+1] = temp;
            }
            bubbleSort(nums,r,c+1);
        }else {
            bubbleSort(nums,r-1,0);
        }
    }
}
