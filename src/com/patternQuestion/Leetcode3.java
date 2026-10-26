package com.patternQuestion;

import java.util.HashMap;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class Leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int low =0, high =0, res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(high < n){
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            int k = high - low +1;
            while(map.size() < k){
                map.put(s.charAt(low), map.get(s.charAt(low))-1);
                if(map.get(s.charAt(low)) == 0){
                    map.remove(s.charAt(low));
                }
                low++;
                k = high - low +1;
            }
            int len = high - low + 1;
            res = Math.max(res , len);
            high++;
        }
        return res;
    }
}
