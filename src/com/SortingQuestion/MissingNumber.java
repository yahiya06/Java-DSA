package com.SortingQuestion;

import java.util.Arrays;

class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {5,4,2,1,0};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }

    static public int missingNumber(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct = nums[i];
            if (nums[i] < nums.length &&  nums[i] != nums[correct] ){
                int temp =nums[i];
                nums[i] =nums[correct] ;
                nums[correct]  =temp;

            }else{
               i++;
            }
        }
        for(int j=0; j<nums.length; j++){
            if (nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }
}