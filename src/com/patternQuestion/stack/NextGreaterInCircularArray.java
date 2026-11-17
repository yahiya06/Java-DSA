package com.patternQuestion.stack;

import java.util.Arrays;
import java.util.Stack;

//https://leetcode.com/problems/next-greater-element-ii/

public class NextGreaterInCircularArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n - 2; i>=0; i--){
            st.push(nums[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return res;
    }
}
