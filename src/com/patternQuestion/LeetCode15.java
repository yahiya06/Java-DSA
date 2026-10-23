package com.patternQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/3sum/
public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            int sum = -1 * nums[i];

            while(left < right ){
                int s = nums[left] + nums[right];
                if(sum == s){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);

                    left++;
                    right--;

                    while(left < nums.length-1 && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(right >= 0 && nums[right] == nums[right+1]){
                        right--;
                    }
                }else if(s < sum){
                    left++;
                }else{
                    right--;
                }

            }
        }
        return res;
    }
}
