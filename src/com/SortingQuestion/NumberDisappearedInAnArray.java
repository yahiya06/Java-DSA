package com.SortingQuestion;

import java.util.List;
//leetcode 448
class NumberDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else i++;
        }

    }
}