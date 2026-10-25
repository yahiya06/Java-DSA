package com.patternQuestion;

import java.util.HashMap;

//https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1

public class LongestSubstringWithKUniques {
    public int longestKSubstr(String s, int k) {
        int n = s.length();
        int ans = -1;
        HashMap<Character,Integer> map = new HashMap<>();
        int low = 0;
        int high = 0;
        while(high < n){
            char ch = s.charAt(high);
            // if(map.size() == 0){
            //     map.put(ch  , 1 );
            // }else{
            //     map.put(ch, map.getOrDefault(ch, 0) + 1);
            // }
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.size() > k){
                map.put(s.charAt(low), map.get(s.charAt(low))-1);
                if(map.get(s.charAt(low)) == 0){
                    map.remove(s.charAt(low));
                }
                low++;
            }
            if(map.size() == k){
                int len = high -low +1;
                ans = Math.max(len,ans);
            }
            high++;
        }
        // if(ans == Integer.MIN_VALUE){
        //     return -1;
        // }
        return ans;
    }
}
