package com.patternQuestion;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1

public class TripletsWithSmallerSumGFG {
    int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int ans = 0;
        for(int i = 0 ; i < n-2; i++){
            int left = i+1;
            int right = n-1;

            while(left<right){
                int s = arr[i]+arr[left]+arr[right];

                if(s >= sum){
                    right--;
                }else{
                    ans = ans + (right - left);
                    left++;
                }
            }
        }
        return ans;
    }
}

