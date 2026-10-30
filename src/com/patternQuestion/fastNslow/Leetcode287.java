package com.patternQuestion.fastNslow;

//https://leetcode.com/problems/find-the-duplicate-number/description/?__cf_chl_tk=eDUGnpkorVV8A6TsN7FbtVM1Jct0AREJn8Qp7usQEOw-1793389787-1.0.1.1-n65puXheB1qqeqDZN6h09jcjD1Bgtjbe6THrzV7n.QM

public class Leetcode287 {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        while(fast < nums.length){
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];
            if(slow == fast ){
                slow = 0;
                while(slow != fast){
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return slow ;
            }
        }
        return -1;
    }
}
