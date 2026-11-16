package com.patternQuestion.stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[n-1]= 0;
        st.push(n-1);
        for(int i = n-2 ; i>=0; i--){
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop();
            }

            if(st.isEmpty())
                ans[i] =0;
            else
                ans[i] = st.peek() - i;

            st.push(i);
        }
        return ans;
    }
}
