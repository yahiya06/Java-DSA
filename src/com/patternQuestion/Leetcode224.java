package com.patternQuestion;

//https://leetcode.com/problems/longest-repeating-character-replacement/

public class Leetcode224 {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int low = 0, high = 0, res = Integer.MIN_VALUE;
        int[] arr = new int[256];
        while(high < n){
            arr[s.charAt(high)]++;
            int len = high - low +1;
            int maxInt = find(arr);
            int diff = len - maxInt;
            while(diff > k ){
                arr[s.charAt(low)]--;
                low++;
                len = high - low +1;
                maxInt = find(arr);
                diff = len - maxInt;
            }
            len = high - low +1;
            res = Math.max(res,len);
            high++;
        }
        return res;
    }
    private int find(int[] arr){
        int maxc =-1;
        for(int i=0;i<256;i++)
            maxc=Math.max(maxc,arr[i]);
        return maxc;
    }
}
