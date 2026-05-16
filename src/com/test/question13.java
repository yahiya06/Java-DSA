package com.test;

public class question13 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,1};
        int ans = unique(nums);
        System.out.println(ans);
    }
   static int unique(int[] nums){
        int uni = 0;
        for (int n : nums){
            uni ^= n;
        }
        return uni;
   }

}
