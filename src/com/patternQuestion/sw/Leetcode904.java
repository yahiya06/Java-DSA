package com.patternQuestion.sw;

import java.util.HashMap;

//https://leetcode.com/problems/fruit-into-baskets/

public class Leetcode904 {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int low = 0, high = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(high < n){
            map.put(fruits[high], map.getOrDefault(fruits[high],0)+1);
            while(map.size() > 2){
                map.put(fruits[low], map.get(fruits[low])-1);
                if(map.get(fruits[low])==0){
                    map.remove(fruits[low]);
                }
                low++;
            }
            maxLen = Math.max(maxLen, high - low +1);
            high++;
        }
        return maxLen;
    }
}

//9VKv.ZPzzs#VJ8U
